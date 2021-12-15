package com.imooc.mall.service;

import com.github.pagehelper.PageInfo;
import com.imooc.mall.model.pojo.Category;
import com.imooc.mall.model.request.AddProductReq;
import com.imooc.mall.model.request.AddcategoryReq;
import com.imooc.mall.vo.CategoryVO;

import java.util.List;

/**
 * The interface Category service.
 * 商品Service
 */
public interface ProductService {


    void add(AddProductReq addProductReq);
}
