package com.han.spingcloudDemo.quartz;

import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.quartz.JobBuilder.*;
import static org.quartz.TriggerBuilder.*;
import static org.quartz.SimpleScheduleBuilder.*;
import static org.quartz.CronScheduleBuilder.*;

@Service
public class QuartzEventServiceImpl {
    private static final String JOB_GROUP = "event_job_group";
    private static final String TRIGGER_GROUP = "event_trigger_group";
    private static final String JOBNAME = "jobName1";
    private static final String TRIGGERNAME = "triggerName1";

    @Autowired
    private Scheduler scheduler;

    public void initQuartzJob() throws SchedulerException {

        JobDetail job = JobBuilder.newJob(MyJob.class)
                .withIdentity(JOBNAME, JOB_GROUP)
                .build();
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity(TRIGGERNAME, TRIGGER_GROUP)
                .startNow()
                .withSchedule(cronSchedule("0/5 * * * * ?"))
                .build();

        scheduler.scheduleJob(job, trigger);
    }
}