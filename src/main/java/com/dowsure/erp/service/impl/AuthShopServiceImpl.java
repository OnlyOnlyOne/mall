package com.dowsure.erp.service.impl;

import com.dowsure.erp.model.dao.baseSource.TAuthShopMapper;
import com.dowsure.erp.model.pojo.TAuthShop;
import com.dowsure.erp.service.AuthShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthShopServiceImpl implements AuthShopService {
    @Autowired
    TAuthShopMapper tAuthShopMapper;


    @Override
    public TAuthShop selectById(Long id) {
        return tAuthShopMapper.selectByPrimaryKey(id);
    }
}
