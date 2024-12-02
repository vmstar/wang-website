package com.mingcong.wang.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @RequestMapping(path = "/hello")
    public String hello(){
        return "Hello World!2390219i120";
    }

    @RequestMapping(path = "/time")
    public String time(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String time = sdf.format(now);
        return time;
    }

    @RequestMapping(path = "/login")
    public ModelAndView login(HttpServletResponse response){
        ModelAndView mv = new ModelAndView("redirect:/login_success.html");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String time = sdf.format(now);

        mv.addObject("username", "wangmingcong");
        return mv;
    }
}