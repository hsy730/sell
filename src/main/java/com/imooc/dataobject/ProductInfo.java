package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-20 21:44
 */
@Data
@Entity
public class ProductInfo {

    @Id
    private String productId;
    /**商品名*/
    private String productName;
    /**商品价格*/
    private BigDecimal productPrice;
    /**商品库存*/
    private Integer productStock;
    /**商品描述*/
    private String productDescription;
    /**商品小图*/
    private String productIcon;
    /**商品状态，0-正常|1-下架*/
    private Integer productStatus;
    /**类目编号*/
    private Integer categoryType;
}
