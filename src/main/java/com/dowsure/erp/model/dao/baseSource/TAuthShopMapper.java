package com.dowsure.erp.model.dao.baseSource;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.dowsure.erp.model.pojo.TAuthShop;

@DS("baseSource")
public interface TAuthShopMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TAuthShop record);

    int insertSelective(TAuthShop record);

    TAuthShop selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TAuthShop record);

    int updateByPrimaryKey(TAuthShop record);
}