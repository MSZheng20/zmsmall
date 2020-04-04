package com.zms.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zms.common.utils.PageUtils;
import com.zms.mall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author zms
 * @email 751007878@qq.com
 * @date 2020-04-04 15:16:47
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

