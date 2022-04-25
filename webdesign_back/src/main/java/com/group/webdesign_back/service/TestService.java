package com.group.webdesign_back.service;

import org.apache.ibatis.annotations.Param;

/**
 * @author longxiang
 * @Description
 * @create 2022/4/19 15:08
 */
public interface TestService {
    public String test(@Param("query") String query);
}
