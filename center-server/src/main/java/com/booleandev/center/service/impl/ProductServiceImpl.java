package com.booleandev.center.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.booleandev.center.entity.Product;
import com.booleandev.center.mapper.ProductMapper;
import com.booleandev.center.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * ProductServiceImpl
 *
 * @author Jiantao Yan
 * @title: ProductServiceImpl
 * @date 2020/3/24 10:15
 */

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {


}
