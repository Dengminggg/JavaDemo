package com.dm.springcloud.service;

import com.dm.springcloud.domain.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}

