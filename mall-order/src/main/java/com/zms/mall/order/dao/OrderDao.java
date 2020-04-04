package com.zms.mall.order.dao;

import com.zms.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zms
 * @email 751007878@qq.com
 * @date 2020-04-04 15:16:47
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
