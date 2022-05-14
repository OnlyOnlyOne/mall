package com.dowsure.erp.service;


import com.dowsure.erp.model.pojo.TAuthShop;
import com.dowsure.erp.model.pojo.TOrder;

public interface AuthShopService {
    TAuthShop selectById(Long id);
}
