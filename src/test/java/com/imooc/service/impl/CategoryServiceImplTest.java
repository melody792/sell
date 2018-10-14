package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import com.imooc.service.CategoryService;
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
 * 描述:
 *
 * @author pzb
 * @create 2018-10-14 2:58 AM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1), productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategories = categoryService.findAll();
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> productCategory = categoryService.findByCategoryTypeIn(Arrays.asList(1, 2, 10));

    }

    @Test
    public void save() {
        ProductCategory productCategory = categoryService.findOne(1);
        productCategory.setCategoryType(3);
        categoryService.save(productCategory);
    }
}