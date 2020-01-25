package com.imooc.util;

import com.imooc.VO.ResultVO;
import com.imooc.enums.ProductStatusEnum;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-25 13:48
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setMsg("成功");
        resultVO.setCode(ProductStatusEnum.UP.getCode());
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
