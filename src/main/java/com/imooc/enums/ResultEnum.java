package com.imooc.enums;

import lombok.Getter;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-27 17:00
 */
@Getter
public enum ResultEnum {
    PARAM_ERROR(1, "参数错误"),
    /**商品不存在*/
    PRODUCT_NOT_EXIST(10,"商品不存在"),
    PRODUCT_OUT_OF_STOCK(11, "商品库存不够"),
    ORDER_NOT_EXIST(12, "订单不存在"),
    ORDER_DETAIL_NOT_EXIST(13, "订单详情不存在"),
    ORDER_STATUS_ERROR(14, "订单状态错误"),
    ORDER_UPDATE_FAIL(15, "订单更新失败"),
    ORDER_DETAIL_EMPTY(16, "订单详情为空"),
    PAY_STATUS_ERROR(17, "支付状态错误"),
    CART_EMPTY(18, "购物车为空"),
    ORDER_OPENID_ERROR(19, "该订单不属于当前用户"),
    WECHAT_MP_ERROR(20,"微信公众号账号授权失败")
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
