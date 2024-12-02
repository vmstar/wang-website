package com.mingcong.wang.interceptor;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * description: 配置拦截器
 * @version v1.0
 * @author w
 * @date 2021年2月27日下午8:54:58
 **/
@Component
public class InterceptorConfig extends WebMvcConfigurationSupport {

    @Resource
    private LoginInterceptor logInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logInterceptor)
                .addPathPatterns("/**") // 拦截所有请求
                .excludePathPatterns("/static/**");  // 静态资源过滤
        super.addInterceptors(registry);
    }
}