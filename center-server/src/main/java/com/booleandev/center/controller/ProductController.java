package com.booleandev.center.controller;

import com.booleandev.center.common.ResponseHelper;
import com.booleandev.center.common.ResponseModel;
import com.booleandev.center.entity.Product;
import com.booleandev.center.entity.vo.ProductVO;
import com.booleandev.center.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProductController
 *
 * @author Jiantao Yan
 * @title: ProductController
 * @date 2020/3/24 10:09
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public ResponseModel<Product> get(@PathVariable("id") Integer id) {
        Product product = productService.getById(id);
        ProductVO productVO = new ProductVO();
        BeanUtils.copyProperties(product, productVO);
        return ResponseHelper.buildResponseModel(product);
    }

    @GetMapping("/{id}")
    public ResponseModel<Boolean> save(@RequestBody ProductVO productVO) {
        Product product = new Product();
        BeanUtils.copyProperties(productVO, product);
        boolean isSuccess = productService.save(product);
        return ResponseHelper.buildResponseModel(isSuccess);
    }
}
