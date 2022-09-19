package com.dm.springcloud.service;


import com.dm.springcloud.entities.CommonResult;
import com.dm.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@Service
@FeignClient("nacos-payment-provider")
public interface PaymentService {

    int i = 1;

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}

