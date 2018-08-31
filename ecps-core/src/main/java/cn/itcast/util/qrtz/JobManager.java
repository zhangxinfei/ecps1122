package cn.itcast.util.qrtz;

import cn.itcast.util.entity.qrtz.QrtzJobEntity;
import org.quartz.*;

import javax.annotation.Resource;

public class JobManager {


    /* 当初我初始化的是  SchedulerFactoryBean schedulerFactoryBean；  这样是注入不进去的 报下面的错
      nested exception is org.springframework.beans.factory.BeanNotOfRequiredTypeException:
      Bean named 'schedulerFactoryBean' must be of
      type [org.springframework.scheduling.quartz.SchedulerFactoryBean],
      but was actually of type [org.quartz.impl.StdScheduler>]
      看spring源码可以知道，其实spring得到的是一个工厂bean，得到的不是它本身，而是它负责创建的org.quartz.impl.StdScheduler对象            所以要使用Scheduler对象
   */
    @Resource
    private Scheduler scheduler;

    public Scheduler getScheduler() {
        return scheduler;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    /**
     * 添加一个定时任务
     */
    public void addJob(QrtzJobEntity job, Class classz) throws SchedulerException {
        //这里获取任务信息数据
        TriggerKey triggerKey = TriggerKey.triggerKey(job.getJob_name(), job.getJob_group());
        CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
        if (trigger == null) {
            System.out.println("trigger is null----");
            //不存在，创建一个
            JobDetail jobDetail = JobBuilder.newJob(classz).withIdentity(job.getJob_name(), job.getJob_group()).build();
            jobDetail.getJobDataMap().put("scheduleJob", job);
            //表达式调度构建器
            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job.getJob_time());
            //按新的cronExpression表达式构建一个新的trigger
            trigger = TriggerBuilder.newTrigger().withIdentity(job.getJob_name(), job.getJob_group()).withSchedule(scheduleBuilder).build();
            scheduler.scheduleJob(jobDetail, trigger);
        } else {
            // Trigger已存在，那么更新相应的定时设置
            //表达式调度构建器
            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job.getJob_time());
            //按新的cronExpression表达式重新构建trigger
            trigger = trigger.getTriggerBuilder().withIdentity(triggerKey).withSchedule(scheduleBuilder).build();
            //按新的trigger重新设置job执行
            scheduler.rescheduleJob(triggerKey, trigger);
        }
    }


    /**
     * @Description: 移除一个任务
     *
     * //@param jobName
     * //@param jobGroupName
     * //@param triggerName
     * //@param triggerGroupName
     */
    public void removeJob(QrtzJobEntity job) {
        try {
            TriggerKey triggerKey = TriggerKey.triggerKey(job.getJob_name(), job.getJob_group());

            scheduler.pauseTrigger(triggerKey);// 停止触发器
            scheduler.unscheduleJob(triggerKey);// 移除触发器
            scheduler.deleteJob(JobKey.jobKey(job.getJob_name(), job.getJob_group()));// 删除任务
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 启动所有定时任务
     */
    public void startJobs() {
        try {
            scheduler.start();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * @Description:关闭所有定时任务
     */
    public void shutdownJobs() {
        try {
            if (!scheduler.isShutdown()) {
                scheduler.shutdown();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * @Description: 修改一个任务的触发时间
     *
     * @param jobName
     * @param jobGroupName
     * @param triggerName 触发器名
     * @param triggerGroupName 触发器组名
     * @param cron   时间设置，参考quartz说明文档
     */
    public void modifyJobTime(String jobName,
                              String jobGroupName, String triggerName, String triggerGroupName, String cron) {
        try {
            TriggerKey triggerKey = TriggerKey.triggerKey(triggerName, triggerGroupName);
            CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
            if (trigger == null) {
                return;
            }

            String oldTime = trigger.getCronExpression();
            if (!oldTime.equalsIgnoreCase(cron)) {
                /** 方式一 ：调用 rescheduleJob 开始 */
                // 触发器
                TriggerBuilder<Trigger> triggerBuilder = TriggerBuilder.newTrigger();
                // 触发器名,触发器组
                triggerBuilder.withIdentity(triggerName, triggerGroupName);
                triggerBuilder.startNow();
                // 触发器时间设定
                triggerBuilder.withSchedule(CronScheduleBuilder.cronSchedule(cron));
                // 创建Trigger对象
                trigger = (CronTrigger) triggerBuilder.build();
                // 方式一 ：修改一个任务的触发时间
                scheduler.rescheduleJob(triggerKey, trigger);
                /** 方式一 ：调用 rescheduleJob 结束 */

                /** 方式二：先删除，然后在创建一个新的Job  */
                //JobDetail jobDetail = scheduler.getJobDetail(JobKey.jobKey(jobName, jobGroupName));
                //Class<? extends Job> jobClass = jobDetail.getJobClass();
                //removeJob(jobName, jobGroupName, triggerName, triggerGroupName);
                //addJob(jobName, jobGroupName, triggerName, triggerGroupName, jobClass, cron);
                /** 方式二 ：先删除，然后在创建一个新的Job */
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

  /*  @Override
    public Boolean modifyJobTime(String triggerName, String triggerGroupName,
                                 String time) throws ParseException, SchedulerException {
        CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerName,triggerGroupName);
        if (trigger == null) {
            return false;
        }
        String oldTime = trigger.getCronExpression();
        if (!oldTime.equalsIgnoreCase(time)) {
            // 修改时间
            trigger.setCronExpression(time);
            // 重启触发器
            scheduler.resumeTrigger(triggerName, triggerGroupName);
        }
        return null;
    }*/


    /*@Override
    public List<QrtzJobEntity> getTriggerS(String triggerName, String triggerGroupName)
            throws ParseException, SchedulerException {
        List<QrtzJobEntity> list = new ArrayList<QrtzJobEntity>();
        //获取任务名称
        for (String groupName : scheduler.getJobGroupNames()) {

            for (String jobName :  scheduler.getJobNames(groupName)) {
                QrtzJobEntity quartzJobVo = new QrtzJobEntity();
                Trigger[] triggers = scheduler.getTriggersOfJob(jobName,groupName);
                CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggers[0].getName(), triggers[0].getGroup());
                quartzJobVo.setJobName(jobName);
                quartzJobVo.setJobGroupName(groupName);
                quartzJobVo.setTriggerGroupName(triggers[0].getGroup());
                quartzJobVo.setTriggerName(triggers[0].getName());
                quartzJobVo.setCronExpression(trigger.getCronExpression());
                list.add(quartzJobVo);
            }

        }
        return list;
    }*/


    /**
     * 暂停定时任务
     * @param allPushMessage
     * @throws Exception
     */
   /* public void pauseJob(AllPushMessage allPushMessage) throws Exception {

        JobKey jobKey = JobKey.jobKey(String.valueOf(allPushMessage.getPush_id()));
        try {
            Scheduler scheduler = schedulerFactoryBean.getScheduler();
            scheduler.pauseJob(jobKey);
        } catch (SchedulerException e) {
            System.out.println("暂停定时任务失败"+e);
            throw new Exception("暂停定时任务失败");
        }
    }*/

    /**
     * 恢复任务
     * @param
     * @param
     * @param
     * @throws Exception
     */
 /*   public void resumeJob(AllPushMessage allPushMessage) throws Exception {

        JobKey jobKey = JobKey.jobKey(String.valueOf(allPushMessage.getPush_id()));
        try {
            Scheduler scheduler = schedulerFactoryBean.getScheduler();
            scheduler.resumeJob(jobKey);
        } catch (SchedulerException e) {
            System.out.println("恢复定时任务失败"+e);
            throw new Exception("恢复定时任务失败");
        }
    }*/

    /**
     * 运行一次任务
     * @param allPushMessage
     * @throws Exception
     */
  /*  public void runOnce(AllPushMessage allPushMessage) throws Exception {
        JobKey jobKey = JobKey.jobKey(String.valueOf(allPushMessage.getPush_id()));
        try {
            Scheduler scheduler = schedulerFactoryBean.getScheduler();
            scheduler.triggerJob(jobKey);
        } catch (SchedulerException e) {
            System.out.println("运行任务失败"+e);
            throw new Exception("运行一次定时任务失败");
        }
    }*/
}