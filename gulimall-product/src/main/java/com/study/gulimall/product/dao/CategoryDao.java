package com.study.gulimall.product.dao;

import com.study.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-07-12 20:50:51
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
