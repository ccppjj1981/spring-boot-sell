package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.repository.ProductInfoReposittory;
import com.imooc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: macbook
 * Date: 18/6/5
 * Time: 上午6:25
 * Description: No Description
 */
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductInfoReposittory reposittory;
    @Override
    public ProductInfo findOne(String productId) {
        return reposittory.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return reposittory.findByProductStatus(0);
    }

    @Override
    public List<ProductInfo> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return null;
    }
}