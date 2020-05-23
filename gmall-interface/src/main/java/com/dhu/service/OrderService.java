package com.dhu.service;

import com.dhu.bean.UserAddress;

import java.util.List;

/**
 * @author zhou
 * @create 2020/5/22
 */
public interface OrderService {

    //初始化订单
    List<UserAddress> initOrder(String userId);
}
