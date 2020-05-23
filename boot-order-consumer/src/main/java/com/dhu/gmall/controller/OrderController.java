package com.dhu.gmall.controller;

import com.dhu.bean.UserAddress;
import com.dhu.service.OrderService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zhou
 * @create 2020/5/23
 */
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/initOrder")
    @ResponseBody //以json的方式写出去，返回到页面
    public List<UserAddress> initOrder(@RequestParam("uid") String userId) {
        List<UserAddress> list = orderService.initOrder(userId);
        return list;
    }
}
