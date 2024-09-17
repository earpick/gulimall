package com.study.gulimall.ware.vo;

import lombok.Data;

import java.util.List;

@Data
public class DoneVo {

    //采购单id
    private Long id;

    //采购项目 完成/失败的需求详情
    private List<OrderDetail> items;
}
