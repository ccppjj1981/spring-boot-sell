package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * Created with IntelliJ IDEA.
 * User: macbook
 * Date: 18/6/14
 * Time: 下午11:19
 * Description: No Description
 */
public class SellException extends RuntimeException{
    private Integer code;

    public SellException(ResultEnum resultEnum) {
       super(resultEnum.getMessage());
       this.code = resultEnum.getCode();
    }
}