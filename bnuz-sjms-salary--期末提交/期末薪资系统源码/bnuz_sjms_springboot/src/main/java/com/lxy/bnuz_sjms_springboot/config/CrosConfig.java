package com.lxy.bnuz_sjms_springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ChristinaXinny
 * @create 2021-05-31 5:57 下午
 */
@Configuration
public class CrosConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                //.allowedOrigins("*")
                //.allowedOrigins("*")改成.allowedOriginPatterns("*")
                .allowedOriginPatterns("*")
                .allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")
        //不能解决的可以试试将.allowedOrigins替换成.allowedOriginPatterns
                .allowCredentials(true) //这里把老师.allowCredentials(true)改成.allowCredentials(false)就可以了。这个属性是“是否支持跨域用户凭证”
                .maxAge(3600)
                .allowedHeaders("*");
    }
}
