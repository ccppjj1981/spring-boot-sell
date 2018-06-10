package com.imooc.untils;

import com.imooc.VO.ResultVO;

/**
 * Created with IntelliJ IDEA.
 * User: macbook
 * Date: 18/6/10
 * Time: 下午3:18
 * Description: No Description
 */
public class ResultVOUtil {
    public static ResultVO sucess(Object objects){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(objects);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
    public static ResultVO success(){
        return sucess(null);
    }
    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;

    }
}