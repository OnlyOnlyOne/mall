package com.imooc.mall.service;

import com.github.pagehelper.PageInfo;
import com.imooc.mall.model.pojo.Category;
import com.imooc.mall.model.request.AddcategoryReq;
import com.imooc.mall.vo.CategoryVO;

import java.util.List;

/**
 * The interface Category service.
 * 分类目录Service
 */
public interface CategoryService {

    void add(AddcategoryReq addcategoryReq);

    void update(Category updateUpdate);

    void delete(Integer id);

    PageInfo listForAdmin(Integer pageNum, Integer pageSize);

    List<CategoryVO> listCategoryForCustomer();
}
