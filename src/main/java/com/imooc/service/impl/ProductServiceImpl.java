package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDto;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import com.imooc.repository.ProductInfoReposittory;
import com.imooc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: macbook
 * Date: 18/6/5
 * Time: 上午6:25
 * Description: No Description
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductInfoReposittory reposittory;
    @Override
    public ProductInfo findOne(String productId) {
        return reposittory.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return reposittory.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return reposittory.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return reposittory.save(productInfo);
    }

    @Override
    public void increaseStock(List<CartDto> cartDtos) {

    }

    @Override
    @Transactional
    public void decreaseStock(List<CartDto> cartDtos) {
        for (CartDto cartDto:cartDtos){
            ProductInfo productInfo = reposittory.findOne(cartDto.getProductId());
            if(productInfo == null){
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            Integer result = productInfo.getProductStock() - cartDto.getProductQuantity();
            if (result < 0){
                throw new SellException(ResultEnum.PRODUCT_STOCK_ERROR);
            }
            productInfo.setProductStock(result);
            reposittory.save(productInfo);
        }
    }
}