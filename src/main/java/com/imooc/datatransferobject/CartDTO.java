package com.imooc.datatransferobject;

import lombok.Data;

/**
 * 前端返回给后端的数据格式
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-27 20:19
 */
@Data
public class CartDTO {

    private String productId;
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
