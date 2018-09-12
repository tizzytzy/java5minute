package com.qingguatang.java5minute.course10;


import com.qingguatang.java5minute.course10.model.OrderInfo;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OrderInfoControl {


    @RequestMapping(value="/order")
    public String order() {

        return "order";
    }



    @RequestMapping(value = "/orderinfo")
    public String orderInfos(ModelMap modelMap){

       List<OrderInfo> orderInfos = getOrderInfo();
        modelMap.addAttribute("orderInfos",orderInfos);

            return "ordergroup";

    }

    private List<OrderInfo> getOrderInfo(){

        List<OrderInfo> orderInfomations = new ArrayList<>();

        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderNumber(000000000001);
        orderInfo.setSender("a");
        orderInfo.setReceiver("b");
        orderInfo.setSenderPhone(100000000);
        orderInfo.setReceiverPhone(1100000000);
        orderInfo.setSenderAddress("啦啦啦");
        orderInfo.setReceiverAddress("哈哈");
        orderInfo.setGoodsKind("食品类");
        orderInfomations.add(orderInfo);

         orderInfo = new OrderInfo();
        orderInfo.setOrderNumber(000000000002);
        orderInfo.setSender("h");
        orderInfo.setReceiver("u");
        orderInfo.setSenderPhone(110000000);
        orderInfo.setReceiverPhone(1110000000);
        orderInfo.setSenderAddress("丫丫");
        orderInfo.setReceiverAddress("呜呜呜");
        orderInfo.setGoodsKind("日用品类");
        orderInfomations.add(orderInfo);

        return orderInfomations;
    }




}

