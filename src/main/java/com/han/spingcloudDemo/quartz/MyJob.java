package com.han.spingcloudDemo.quartz;

import org.joda.time.DateTime;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.Date;

public class MyJob implements Job, Serializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyJob.class);

    private static final long serialVersionUID = 1L;


    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        LOGGER.info("[MyJob execute]==============="+new DateTime(new Date()).toString("yyyy-MM-dd hh:mm:ss"));
        LOGGER.info("MyJob execute......");
        System.out.println("MyJob execute......");
    }
}