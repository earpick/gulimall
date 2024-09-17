package com.study.gulimall.ware.dao;

import com.study.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-07-13 16:17:10
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
