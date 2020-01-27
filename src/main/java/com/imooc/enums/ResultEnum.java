package com.imooc.enums;

import lombok.Getter;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-27 17:00
 */
@Getter
public enum ResultEnum {
    /**商品不存在*/
    PRODUCT_NOT_EXIST(10,"商品不存在"),
    PRODUCT_OUT_OF_STOCK(9, "商品库存不够")
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
