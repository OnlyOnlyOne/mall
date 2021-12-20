package com.imooc.mall.service;

import com.imooc.mall.model.vo.CartVO;

import java.util.List;

public interface CartService {

//    List<CartVO> list(Integer userId);

    List<CartVO> list(Integer userId);

    List<CartVO> add(Integer userId, Integer productId, Integer count);

    //更新购物车
    List<CartVO> update(Integer userId, Integer productId, Integer count);

    //删除购物车
    List<CartVO> delete(Integer userId, Integer productId);

    //全选和选择一个逻辑有很大的相似，所以要考虑复用
    List<CartVO> selectOrNot(Integer userId, Integer productId, Integer selected);

    List<CartVO> selectAllOrNot(Integer userId, Integer selected);
}
