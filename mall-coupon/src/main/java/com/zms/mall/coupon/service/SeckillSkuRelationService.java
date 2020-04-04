package com.zms.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zms.common.utils.PageUtils;
import com.zms.mall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author zms
 * @email 751007878@qq.com
 * @date 2020-04-04 14:59:32
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

