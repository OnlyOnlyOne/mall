package com.dowsure.erp.service.impl;

import com.dowsure.erp.model.dao.dataSource.TOrderMapper;
import com.dowsure.erp.model.pojo.TOrder;
import com.dowsure.erp.service.TOrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TOrderServiceImpl implements TOrderService {
    @Autowired
    TOrderMapper orderMapper;


    @Override
    public PageInfo listForCustomer(Integer pageNum, Integer pageSize) {
////        Integer userId = UserFilter.currentUser.getId();
//        PageHelper.startPage(pageNum, pageSize);
//        List<TOrder> orderList = TOrderMapper.selectForCustomer(9);
////        List<OrderVO> orderVOList = orderListToOrderVOList(orderList);
//        PageInfo pageInfo = new PageInfo<>(orderList);
//        pageInfo.setList(orderList);
//        return pageInfo;
        return null;
    }

    @Override
    public TOrder selectById(Long id) {
        return orderMapper.selectByPrimaryKey(id);
    }
}
