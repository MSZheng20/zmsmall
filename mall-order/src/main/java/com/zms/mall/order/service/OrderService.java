package com.zms.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zms.common.utils.PageUtils;
import com.zms.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author zms
 * @email 751007878@qq.com
 * @date 2020-04-04 15:16:47
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

