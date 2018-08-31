package cn.itcast.util.qrtz;


import cn.itcast.util.entity.qrtz.QrtzJobEntity;
import org.quartz.SchedulerException;

import javax.annotation.Resource;


/**
 * 调用job
 * @author Administrator
 *
 */

public class JobService {
    @Resource
    private JobManager jobManager;

    public JobManager getJobManager() {
        return jobManager;
    }
    public void setJobManager(JobManager jobManager) {
        this.jobManager = jobManager;
    }

    /**
     * 初始化定时任务
     * @throws SchedulerException
     */
    public void loadJobInit() throws SchedulerException{
        System.out.println("init---");
        QrtzJobEntity job = new QrtzJobEntity();
        job.setJob_id("Id1");
        job.setJob_name("Name1");
        job.setJob_group("linGroup");
        job.setJob_time("0/30 * * * * ?");
        jobManager.addJob(job, JobAction.class);
        jobManager.startJobs();
    }


}
