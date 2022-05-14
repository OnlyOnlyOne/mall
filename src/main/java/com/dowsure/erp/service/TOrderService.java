package com.dowsure.erp.service;

import com.dowsure.erp.model.pojo.TOrder;
import com.github.pagehelper.PageInfo;

public interface TOrderService {
    PageInfo listForCustomer(Integer pageNum, Integer pageSize);

    TOrder selectById(Long id);
}
