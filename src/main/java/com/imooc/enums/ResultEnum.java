package com.imooc.enums;

import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * User: macbook
 * Date: 18/6/14
 * Time: 下午11:21
 * Description: No Description
 */
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(10,"商品不存在"),
    PRODUCT_STOCK_ERROR(11,"商品库存不正确");
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}


