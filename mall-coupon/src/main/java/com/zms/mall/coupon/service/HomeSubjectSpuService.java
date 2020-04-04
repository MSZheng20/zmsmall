package com.zms.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zms.common.utils.PageUtils;
import com.zms.mall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author zms
 * @email 751007878@qq.com
 * @date 2020-04-04 14:59:32
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

