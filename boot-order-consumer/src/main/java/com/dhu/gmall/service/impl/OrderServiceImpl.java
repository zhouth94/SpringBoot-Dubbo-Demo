package com.dhu.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dhu.bean.UserAddress;
import com.dhu.service.OrderService;
import com.dhu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 1、将服务提供者注册到注册中心（暴露服务）
 *  1)导入dubbo依赖
 *  2)配置服务提供者
 * 2、让服务消费者去注册中心订阅服务服务提供者的服务地址
 * @author zhou
 * @create 2020/5/22
 */
@Service
public class OrderServiceImpl implements OrderService {

    //@Autowired
    @Reference //远程调用UserService服务
    private UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        //1.查询用户的收获地址
        List<UserAddress> list = userService.getUserAddressList(userId);
        for (UserAddress userAddress : list) {
            System.out.println(userAddress);
        }
        return list;
    }
}
