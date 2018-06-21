package com.imooc.dto;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: macbook
 * Date: 18/6/15
 * Time: 上午6:32
 * Description: No Description
 */
@Data
public class CartDto {
    private String productId;
    private  Integer productQuantity;

    public CartDto(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}