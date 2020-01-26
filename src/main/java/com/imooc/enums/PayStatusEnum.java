package com.imooc.enums;

import lombok.Getter;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-26 11:21
 */
@Getter
public enum PayStatusEnum {
    /**未支付*/
    UNPAID(0,"未支付"),
    /**已支付*/
    PAID(1, "已支付")
    ;
    /**状态码*/
    private Integer code;
    /**状态信息*/
    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
