package com.caihao.task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author CaiHao
 * @create 2019-09-05 22:13:20
 */
@Service
public class ScheduledService {


    int i =0;

    /**
     * @Scheduled 表明该方法是定时任务，同时在启动主类上添加 @EnableScheduling//开启定时任务注解
     */
    @Scheduled(cron ="0 * * * * MON-SAT" )
    public void  hello2(){


        System.err.println("定时任务======"+i);
        i++;
    }

}
