package com.imooc.enums;

import lombok.Getter;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-26 11:08
 */
@Getter
public enum OrderStatusEnum {
    /**新订单*/
    NEW(0,"新订单"),
    /**订单完结*/
    FINISH(1,"已完成"),
    /**取消订单*/
    CANCEL(2,"已取消")
    ;
    /**状态码*/
    private Integer code;
    /**状态信息*/
    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
