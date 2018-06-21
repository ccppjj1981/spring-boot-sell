package com.imooc.enums;

import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * User: macbook
 * Date: 18/6/10
 * Time: 下午11:52
 * Description: No Description
 */
@Getter
public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功");

    private Integer code;
    private String message;
    PayStatusEnum(Integer code,String message){
        this.code=code;
        this.message = message;
    }
}
