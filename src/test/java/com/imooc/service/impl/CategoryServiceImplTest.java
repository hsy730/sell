package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-17 21:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        ProductCategory productCategory = categoryService.findOne(1);
        assertEquals(new Integer(1), productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategoryList = categoryService.findAll();
        assertNotEquals(0, productCategoryList.size());
    }

    @Test
    public void findByCategoryIn() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<ProductCategory> productCategoryList = categoryService.findByCategoryIn(list);
        assertNotEquals(0, productCategoryList.size());

    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("故宫", 3);
        ProductCategory result = categoryService.save(productCategory);
        assertNotNull(result);
    }
}