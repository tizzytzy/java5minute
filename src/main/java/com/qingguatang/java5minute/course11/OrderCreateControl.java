package com.qingguatang.java5minute.course11;


import com.qingguatang.java5minute.course10.model.OrderInfo;
import com.qingguatang.java5minute.course11.model.OrderCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
public class OrderCreateControl {

    @Autowired
    private OrderPostControl orderPostControl;



}
