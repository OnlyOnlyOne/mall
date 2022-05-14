package com.dowsure.erp.controller;

import com.dowsure.erp.common.ApiRestResponse;
import com.dowsure.erp.model.pojo.TAuthShop;
import com.dowsure.erp.service.AuthShopService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthShopController {
    @Autowired
    AuthShopService authShopService;

    @GetMapping("shop/test")
    @ApiOperation("获取店铺信息")
    public ApiRestResponse shop(@RequestParam Long id){
        TAuthShop shop = authShopService.selectById(id);
        System.out.println("======");
        System.out.println("test");
        return ApiRestResponse.success(shop);
    }
}
