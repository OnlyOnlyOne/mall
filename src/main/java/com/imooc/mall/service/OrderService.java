package com.imooc.mall.service;

import com.github.pagehelper.PageInfo;
import com.imooc.mall.model.request.CreateOrderReq;
import com.imooc.mall.model.vo.CartVO;
import com.imooc.mall.model.vo.OrderVO;
//import com.imooc.mall.model.vo.OrderVO;
import java.util.List;

/**
 * 描述：     订单Service
 */
public interface OrderService {


    String create(CreateOrderReq createOrderReq);

    OrderVO detail(String orderNo);

    PageInfo listForCustomer(Integer pageNum, Integer pageSize);

    void cancel(String orderNo);

    String qrcode(String orderNo);

    PageInfo listForAdmin(Integer pageNum, Integer pageSize);

    //
    //    @Override
    //    public void cancel(String orderNo) {
    //        Order order = orderMapper.selectByOrderNo(orderNo);
    //        //查不到订单，报错
    //        if (order == null) {
    //            throw new ImoocMallException(ImoocMallExceptionEnum.NO_ORDER);
    //        }
    //        //验证用户身份
    //        //订单存在，需要判断所属
    //        Integer userId = UserFilter.currentUser.getId();
    //        if (!order.getUserId().equals(userId)) {
    //            throw new ImoocMallException(ImoocMallExceptionEnum.NOT_YOUR_ORDER);
    //        }
    //        if (order.getOrderStatus().equals(OrderStatusEnum.NOT_PAID.getCode())) {
    //            order.setOrderStatus(OrderStatusEnum.CANCELED.getCode());
    //            order.setEndTime(new Date());
    //            orderMapper.updateByPrimaryKeySelective(order);
    //        } else {
    //            throw new ImoocMallException(ImoocMallExceptionEnum.WRONG_ORDER_STATUS);
    //        }
    //    }
    //
    //    @Override
    //    public String qrcode(String orderNo) {
    //        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder
    //                .getRequestAttributes();
    //        HttpServletRequest request = attributes.getRequest();
    //
    //        String address = ip + ":" + request.getLocalPort();
    //        String payUrl = "http://" + address + "/pay?orderNo=" + orderNo;
    //        try {
    //            QRCodeGenerator
    //                    .generateQRCodeImage(payUrl, 350, 350,
    //                            Constant.FILE_UPLOAD_DIR + orderNo + ".png");
    //        } catch (WriterException e) {
    //            e.printStackTrace();
    //        } catch (IOException e) {
    //            e.printStackTrace();
    //        }
    //        String pngAddress = "http://" + address + "/images/" + orderNo + ".png";
    //        return pngAddress;
    //    }
    //
    void pay(String orderNo);

    //    @Override
    //    public PageInfo listForAdmin(Integer pageNum, Integer pageSize) {
    //        PageHelper.startPage(pageNum, pageSize);
    //        List<Order> orderList = orderMapper.selectAllForAdmin();
    //        List<OrderVO> orderVOList = orderListToOrderVOList(orderList);
    //        PageInfo pageInfo = new PageInfo<>(orderList);
    //        pageInfo.setList(orderVOList);
    //        return pageInfo;
    //    }
    //
        //发货
    void deliver(String orderNo);

    //
    void finish(String orderNo);
//    OrderVO detail(String orderNo);
//
//    PageInfo listForCustomer(Integer pageNum, Integer pageSize);
//
//    void cancel(String orderNo);
//
//    String qrcode(String orderNo);
//
//    void pay(String orderNo);
//
//    PageInfo listForAdmin(Integer pageNum, Integer pageSize);
//
//    void deliver(String orderNo);
//
//    void finish(String orderNo);
}
