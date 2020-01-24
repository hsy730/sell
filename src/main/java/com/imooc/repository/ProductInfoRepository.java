package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-20 22:11
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {// <表对应的对象类型，主键类型>
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
