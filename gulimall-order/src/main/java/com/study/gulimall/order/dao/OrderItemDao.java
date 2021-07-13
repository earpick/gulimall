package com.study.gulimall.order.dao;

import com.study.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-07-13 16:03:01
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
