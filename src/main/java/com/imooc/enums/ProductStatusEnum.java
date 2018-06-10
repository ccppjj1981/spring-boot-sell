package com.imooc.enums;

import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * User: macbook
 * Date: 18/6/5
 * Time: 上午6:33
 * Description: No Description
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"上架"),DOWN(1,"下架");
    private Integer code;
    private String message;
    ProductStatusEnum(Integer code,String message){
        this.code=code;
        this.message = message;
    }
}


