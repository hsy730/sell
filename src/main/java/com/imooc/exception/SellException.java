package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-27 16:58
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }
}
