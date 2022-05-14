package com.dowsure.erp.controller;


import com.dowsure.erp.common.ApiRestResponse;
import com.dowsure.erp.model.pojo.TShopDataDistribution;
import com.dowsure.erp.service.ShopDataDistributionService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopDataDistributionController {

    @Autowired
    ShopDataDistributionService shopDataDistributionService;

    @GetMapping("shopDistribu/test")
    @ApiOperation("获取店铺后缀")
    public ApiRestResponse getDistribu(@RequestParam Long shopId) throws Exception {

        TShopDataDistribution shop = shopDataDistributionService.getOne(shopId);

        return ApiRestResponse.success(shop);
    }
}
