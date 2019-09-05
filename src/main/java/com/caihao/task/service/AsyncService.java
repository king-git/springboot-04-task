package com.caihao.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author CaiHao
 * @create 2019-09-05 22:01:41
 */

@Service
public class AsyncService {


    /**
     * @Async 告诉spring 这是一个异步方法，同时需要在启动类上标注@EnableAsync  //开启异步注解
     */
    @Async
    public void hello(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.err.println("数据处理中======");
    }


}
