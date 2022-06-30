package com.study.gulimall.product.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class AttrGroupRelationVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 属性id
     */
    private Long attrId;

    /**
     * 属性分组id
     */
    private Long attrGroupId;
}
