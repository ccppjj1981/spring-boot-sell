package com.imooc.VO;

/**
 * http 请求最外层对象
 * User: macbook
 * Date: 18/6/6
 * Time: 上午6:50
 * Description: No Description
 */

import lombok.Data;

@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private T data;
}