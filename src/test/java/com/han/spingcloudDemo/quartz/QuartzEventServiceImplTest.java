package com.han.spingcloudDemo.quartz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * Created by hanqingsong on 17/7/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class QuartzEventServiceImplTest {
    @Autowired
    QuartzEventServiceImpl quartzEventService;
    @Test
    public void testInitQuartzJob() throws Exception {
        quartzEventService.initQuartzJob();
        TimeUnit.SECONDS.sleep(20);
        System.out.println("QuartzEventServiceImplTest.testInitQuartzJob");
    }
}