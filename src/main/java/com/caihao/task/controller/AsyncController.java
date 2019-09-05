package com.caihao.task.controller;

import com.caihao.task.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CaiHao
 * @create 2019-09-05 22:05:14
 */

@RestController
public class AsyncController {


    @Autowired
    private AsyncService asyncService;


    @GetMapping("/hello")
    public String hello(){

        asyncService.hello();

        return "success";
    }

}
