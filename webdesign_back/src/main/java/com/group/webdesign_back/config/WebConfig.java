package com.group.webdesign_back.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author longxiang
 * @Description
 * @create 2022/4/19 15:02
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    /*
     * 跨域请求
     * 1. 需要被访问的路径
     * 2. 跨域请求来源
     * 3. 允许的跨域的方法
     * 4. 是否允许携带参数如token
     * 5. 设置最大响应时间
     * */

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("Http://localhost:8080","null")
                .allowedMethods("GET","POST","PUT","OPTIONS","DELETE")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
