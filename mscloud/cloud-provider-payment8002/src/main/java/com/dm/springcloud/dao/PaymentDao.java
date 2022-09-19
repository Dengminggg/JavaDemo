package com.dm.springcloud.dao;


import com.dm.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    //插入
    public int create(Payment payment);

    //查找
    public Payment getPaymentById(@Param("id")Long id);

}
