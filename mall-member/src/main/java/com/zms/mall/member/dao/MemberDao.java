package com.zms.mall.member.dao;

import com.zms.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zms
 * @email 751007878@qq.com
 * @date 2020-04-04 15:05:32
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
