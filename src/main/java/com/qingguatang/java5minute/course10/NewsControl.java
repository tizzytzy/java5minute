package com.qingguatang.java5minute.course10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsControl {

    @RequestMapping(value = "/news")
    public String news(){

        return "news";
    }

}
