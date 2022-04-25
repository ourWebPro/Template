package com.group.webdesign_back.service;

import org.springframework.stereotype.Service;

/**
 * @author longxiang
 * @Description
 * @create 2022/4/19 15:08
 */
@Service
public class TestServiceImpl implements TestService{
    @Override
    public String test(String query) {
        System.out.println("从前端传过来的数据："+query);
        return "后端的数据";
    }
}
