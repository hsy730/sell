package com.imooc.enums;

import lombok.Getter;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-22 20:28
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"已上架"),
    DOWN(1,"已下架")
    ;
    /**状态码*/
    private Integer code;
    /**状态信息*/
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
