package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-24 15:22
 */
@Data
public class ProductVO {
    @JsonProperty("code")
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
