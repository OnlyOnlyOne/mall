package com.dowsure.erp.controller;

import com.dowsure.erp.common.ApiRestResponse;
import com.dowsure.erp.model.pojo.TOrder;
import com.dowsure.erp.service.TOrderService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TOrderController {
    @Autowired
    TOrderService tOrderService;



    @GetMapping("order/test")
    @ApiOperation("前台订单列表")
    public ApiRestResponse detail(@RequestParam Long id) {
        TOrder order = tOrderService.selectById(id);
        System.out.println("======");
        return ApiRestResponse.success(order);
    }
}
