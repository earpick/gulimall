package com.study.gulimall.coupont.dao;

import com.study.gulimall.coupont.entity.SmsCouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-07-13 17:11:35
 */
@Mapper
public interface SmsCouponSpuRelationDao extends BaseMapper<SmsCouponSpuRelationEntity> {
	
}
