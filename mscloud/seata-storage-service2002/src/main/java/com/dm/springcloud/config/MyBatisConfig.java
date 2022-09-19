package com.dm.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.dm.springcloud.dao"})
public class MyBatisConfig {
}

