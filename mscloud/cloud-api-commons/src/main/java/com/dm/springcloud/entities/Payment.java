package com.dm.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 主实体类
 */
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
