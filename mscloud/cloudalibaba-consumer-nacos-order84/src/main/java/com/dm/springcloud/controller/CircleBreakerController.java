package com.dm.springcloud.controller;


import com.dm.springcloud.entities.CommonResult;
import com.dm.springcloud.entities.Payment;
import com.dm.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CircleBreakerController {
    //==================OpenFeign
    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/openfeign/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        if (id == 4) {
            throw new RuntimeException("没有该id");
        }
        return paymentService.paymentSQL(id);
    }

    @GetMapping(value = "/a")
    public int paymentSQL() {

        return paymentService.i;
    }

}
