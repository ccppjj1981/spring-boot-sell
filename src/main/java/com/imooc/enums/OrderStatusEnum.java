package com.imooc.enums;

import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * User: macbook
 * Date: 18/6/10
 * Time: 下午11:43
 * Description: No Description
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消");

    private Integer code;
    private String message;
    OrderStatusEnum(Integer code,String message){
        this.code=code;
        this.message = message;
    }

}


