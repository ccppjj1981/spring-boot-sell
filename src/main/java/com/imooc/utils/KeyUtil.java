package com.imooc.utils;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: macbook
 * Date: 18/6/14
 * Time: 下午11:43
 * Description: No Description
 */
public class KeyUtil {
    /**
     * 生成唯一组件
     * @return
     */
    public static synchronized String getUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }

    public static void main(String[] args) {
        Random random = new Random();
        for(int i=0;i<10;i++) {
            Integer a = random.nextInt(9999999) + 100000;
            System.out.println(a);
        }
    }
}