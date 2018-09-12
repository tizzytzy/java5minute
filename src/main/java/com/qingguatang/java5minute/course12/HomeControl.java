package com.qingguatang.java5minute.course12;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControl {

    @RequestMapping(value = "/home")
    public String home(){

        return "home";
    }

}
