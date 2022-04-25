package com.group.webdesign_back.controller;

import com.group.webdesign_back.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author longxiang
 * @Description
 * @create 2022/4/19 15:07
 */
@RestController
public class TestController {
    @Autowired
    TestServiceImpl testService;


    @RequestMapping("/test")
    public String test(@RequestParam("query") String query){
        return testService.test(query);
    }
}
