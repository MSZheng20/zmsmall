package com.zms.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zms.common.utils.PageUtils;
import com.zms.mall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author zms
 * @email 751007878@qq.com
 * @date 2020-04-04 14:59:32
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

