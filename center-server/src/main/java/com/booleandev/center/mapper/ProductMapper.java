package com.booleandev.center.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.booleandev.center.entity.Product;
import org.apache.ibatis.annotations.Mapper;

/**
 * ProductMapper
 *
 * @author Jiantao Yan
 * @title: ProductMapper
 * @date 2020/3/24 10:17
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}
