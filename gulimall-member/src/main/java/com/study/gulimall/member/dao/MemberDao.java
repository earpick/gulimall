package com.study.gulimall.member.dao;

import com.study.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-07-13 15:39:20
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
