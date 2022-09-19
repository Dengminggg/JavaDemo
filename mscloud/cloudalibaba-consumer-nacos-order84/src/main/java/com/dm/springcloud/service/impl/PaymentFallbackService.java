package com.dm.springcloud.service.impl;

import com.dm.springcloud.entities.CommonResult;
import com.dm.springcloud.entities.Payment;
import com.dm.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

//@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回,没有该流水信息", new Payment(id, "errorSerial......"));
    }
}
