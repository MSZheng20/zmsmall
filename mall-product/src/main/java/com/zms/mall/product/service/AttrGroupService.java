package com.zms.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zms.common.utils.PageUtils;
import com.zms.mall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author zms
 * @email 751007878@qq.com
 * @date 2020-04-03 18:23:27
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

