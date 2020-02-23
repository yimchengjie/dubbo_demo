package com.ycj.dubboDemo.consumer.controller;

import com.ycj.dubboDemo.common.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @Author: yanchengjie
 */
@Controller
public class consumer {
    @Autowired
    public DemoService demoService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return demoService.getDemoString();
    }
}
