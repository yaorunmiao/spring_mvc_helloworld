package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String protal() {
//        ���߼���ͼ����
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "success";
    }
}
