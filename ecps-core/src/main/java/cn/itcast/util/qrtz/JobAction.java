package cn.itcast.util.qrtz;

import cn.itcast.util.entity.qrtz.QrtzJobEntity;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

//@DisallowConcurrentExecution//有状态的任务需要加上这个注解
public class JobAction implements Job {

    @Autowired
    private TestService testService;
    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        System.out.println("任务成功运行------");
        QrtzJobEntity detailInfo = (QrtzJobEntity)arg0.getMergedJobDataMap().get("scheduleJob");
        System.out.println("任务名称 = [" + detailInfo.getJob_name()+ "]");
        if(testService==null){
            System.out.println("注入不成功------");
        }else{
            System.out.println("注入成功------");
           // testService.add();
        }

    }

}
