package com.study.gulimall.ware.vo;

import lombok.Data;

@Data
public class OrderDetail {

    // 采购项id
    private Long itemId;

    // 采购项状态
    private Integer status;

    // 采购失败的原因
    private String reason;
}
