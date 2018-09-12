package com.qingguatang.java5minute.course10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactControl {

    @RequestMapping(value = "/contact")
    public String contact(){

        return "contact";
    }

}
