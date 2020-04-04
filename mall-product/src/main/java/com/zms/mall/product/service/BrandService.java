package com.zms.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zms.common.utils.PageUtils;
import com.zms.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author zms
 * @email 751007878@qq.com
 * @date 2020-04-03 18:23:27
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

