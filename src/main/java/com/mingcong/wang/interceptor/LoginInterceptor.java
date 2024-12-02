package com.mingcong.wang.interceptor;
import java.lang.reflect.Method;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

//import xyz.annotation.LogRecord;
//import xyz.utils.LogUtils;

/**
 * description: 日志拦截器
 * @version v1.0
 * @author w
 * @date 2021年2月27日下午7:37:28
 **/
@Component
public class LoginInterceptor implements HandlerInterceptor {
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
//                             Object handler) throws Exception {
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
//                           ModelAndView modelAndView) throws Exception {
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
//                                Object handler, Exception ex) throws Exception {
//        if (handler instanceof HandlerMethod) {
//            HandlerMethod handlerMethod = (HandlerMethod) handler;
//            Method method = handlerMethod.getMethod();
//            LogRecord annotation = method.getAnnotation(LogRecord.class);
//            if(null != annotation) {
//                String record = annotation.record();
//                String num = annotation.num();
//                // 进行日志记录
//                LogUtils.saveLog(record, num);
//            }
//        }
//
//    }

}