package com.dowsure.erp.service.impl;

import com.dowsure.erp.model.dao.baseSource.TShopDataDistributionMapper;
import com.dowsure.erp.model.pojo.TShopDataDistribution;
import com.dowsure.erp.service.ShopDataDistributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopDataDistributionServiceImpl  implements ShopDataDistributionService {
    @Autowired
    TShopDataDistributionMapper distributionMapper;


    @Override
    public TShopDataDistribution getOne(Long shopId) {
        return distributionMapper.selectById(shopId);
    }
}
