package com.zms.mall.product.dao;

import com.zms.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zms
 * @email 751007878@qq.com
 * @date 2020-04-03 18:23:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
