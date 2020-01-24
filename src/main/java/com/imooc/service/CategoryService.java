package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-17 20:49
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();
    /** 根据类目编号categoryType查询产品类目信息category*/
    List<ProductCategory> findByCategoryIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
