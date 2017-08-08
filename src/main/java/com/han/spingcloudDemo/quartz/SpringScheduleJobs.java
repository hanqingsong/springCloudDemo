package com.han.spingcloudDemo.quartz;

import org.joda.time.DateTime;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hanqingsong on 17/7/27.
 */
//@Component
public class SpringScheduleJobs {
    /**
     * 固定等待时间
     * @throws InterruptedException
     */
    @Scheduled(fixedDelay = 1 * 2000)
    public void fixedDelayJob() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        System.out.println("[FixedDelayJob Execute]=="+new DateTime(new Date()).toString("yyyy-MM-dd hh:mm:ss"));
    }

    /**
     * 固定间隔时间
     * @throws InterruptedException
     */
    @Scheduled(fixedDelay = 1 * 2000)
    public void fixedRateJob() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        System.out.println("[fixedRateJob Execute]====="+new DateTime(new Date()).toString("yyyy-MM-dd hh:mm:ss"));
    }


    @Scheduled(cron = "0/4 * * * * ?")
    public void cronJob() {
        System.out.println("[CronJob Execute]==============="+new DateTime(new Date()).toString("yyyy-MM-dd hh:mm:ss"));
    }
}
