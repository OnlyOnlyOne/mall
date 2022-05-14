package com.dowsure.erp.model.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
    * 订单
    */
public class TOrder {
    /**
    * 编号
    */
    private Long id;

    /**
    * 店铺主键编号
    */
    private Long shopId;

    /**
    * 市场编号
    */
    private String marketplaceId;

    /**
    * 亚马逊订单编号
    */
    private String amazonOrderId;

    /**
    * 亚马逊卖家订单编号
    */
    private String sellerOrderId;

    /**
    * 订单创建时间
    */
    private String purchaseDate;

    /**
    * 订单最后更新时间
    */
    private String lastUpdateDate;

    /**
    * 订单状态：PENDING， UNSHIPPED， PARTIALLYSHIPPED， SHIPPED， CANCELED， UNFULFILLABLE， INVOICEUNCONFIRMED， PENDINGAVAILABILITY
    */
    private String orderStatus;

    /**
    * 运输渠道：亚马逊（AFN），卖家（MFN）
    */
    private String fulfillmentChannel;

    /**
    * 销售渠道
    */
    private String salesChannel;

    /**
    * 订单渠道
    */
    private String orderChannel;

    /**
    * 运输级别
    */
    private String shipServiceLevel;

    /**
    * 订单总金额币种
    */
    private String orderCurrency;

    /**
    * 订单总金额
    */
    private BigDecimal orderTotalAmount;

    /**
    * 已发货商品数量
    */
    private Integer numberOfItemsShipped;

    /**
    * 未发货商品数量
    */
    private Integer numberOfItemsUnshipped;

    /**
    * 付款方式：COD, CVS, OTHER
    */
    private String paymentMethod;

    private String paymentMethodDetails;

    /**
    * 订单的装运服务级别类别：Expedited, FreeEconomy, NextDay, SameDay, SecondDay, Scheduled, Standard
    */
    private String shipmentServiceLevelCategory;

    /**
    * 订单运输状态
    */
    private String easyShipShipmentStatus;

    /**
    * 亚马逊（CBA）定制发货标签
    */
    private String cbaDisplayableShippingLabel;

    /**
    * 订单类型
    */
    private String orderType;

    /**
    * 最早发货时间
    */
    private String earliestShipDate;

    /**
    * 最晚发货时间
    */
    private String latestShipDate;

    /**
    * 最早交货时间
    */
    private String earliestDeliveryDate;

    /**
    * 最晚交货日期
    */
    private String latestDeliveryDate;

    /**
    * 是否为业务订单
    */
    private String isBusinessOrder;

    /**
    * 是否为主要
    */
    private String isPrime;

    /**
    * 是否为特价订单
    */
    private String isPremiumOrder;

    /**
    * 是否为全球送达
    */
    private String isGlobalExpressEnabled;

    /**
    * 替换的订单Id
    */
    private String replacedOrderId;

    /**
    * 是否为换货单
    */
    private String isReplacementOrder;

    /**
    * 卖家承诺发货日期
    */
    private String promiseResponseDueDate;

    /**
    * 是否已经设置预计发货日期
    */
    private String isEstimatedShipDateSet;

    /**
    * 是否为转售
    */
    private String isSoldByAb;

    /**
    * 是否为ISPU
    */
    private String isIspu;

    /**
    * 卖方显示名称
    */
    private String sellerDisplayName;

    /**
    * 收货地址
    */
    private String shippingAddress;

    /**
    * 履行供应源Id
    */
    private String fulfillmentSupplySourceId;

    /**
    * 是否有退款：默认-0；0-无；1-有；
    */
    private Integer isRefund;

    /**
    * 退款金额
    */
    private BigDecimal refundAmount;

    /**
    * 退款日期
    */
    private String refundDate;

    /**
    * 是否已经拉去订单详情：默认-0；0-未拉；1-已拉；
    */
    private Integer isPullItem;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;

    /**
    * 是否拉取地址信息：默认-0；0-未拉取；1-已拉取
    */
    private Integer isPullAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    public String getSellerOrderId() {
        return sellerOrderId;
    }

    public void setSellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getFulfillmentChannel() {
        return fulfillmentChannel;
    }

    public void setFulfillmentChannel(String fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
    }

    public String getSalesChannel() {
        return salesChannel;
    }

    public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
    }

    public String getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel;
    }

    public String getShipServiceLevel() {
        return shipServiceLevel;
    }

    public void setShipServiceLevel(String shipServiceLevel) {
        this.shipServiceLevel = shipServiceLevel;
    }

    public String getOrderCurrency() {
        return orderCurrency;
    }

    public void setOrderCurrency(String orderCurrency) {
        this.orderCurrency = orderCurrency;
    }

    public BigDecimal getOrderTotalAmount() {
        return orderTotalAmount;
    }

    public void setOrderTotalAmount(BigDecimal orderTotalAmount) {
        this.orderTotalAmount = orderTotalAmount;
    }

    public Integer getNumberOfItemsShipped() {
        return numberOfItemsShipped;
    }

    public void setNumberOfItemsShipped(Integer numberOfItemsShipped) {
        this.numberOfItemsShipped = numberOfItemsShipped;
    }

    public Integer getNumberOfItemsUnshipped() {
        return numberOfItemsUnshipped;
    }

    public void setNumberOfItemsUnshipped(Integer numberOfItemsUnshipped) {
        this.numberOfItemsUnshipped = numberOfItemsUnshipped;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethodDetails() {
        return paymentMethodDetails;
    }

    public void setPaymentMethodDetails(String paymentMethodDetails) {
        this.paymentMethodDetails = paymentMethodDetails;
    }

    public String getShipmentServiceLevelCategory() {
        return shipmentServiceLevelCategory;
    }

    public void setShipmentServiceLevelCategory(String shipmentServiceLevelCategory) {
        this.shipmentServiceLevelCategory = shipmentServiceLevelCategory;
    }

    public String getEasyShipShipmentStatus() {
        return easyShipShipmentStatus;
    }

    public void setEasyShipShipmentStatus(String easyShipShipmentStatus) {
        this.easyShipShipmentStatus = easyShipShipmentStatus;
    }

    public String getCbaDisplayableShippingLabel() {
        return cbaDisplayableShippingLabel;
    }

    public void setCbaDisplayableShippingLabel(String cbaDisplayableShippingLabel) {
        this.cbaDisplayableShippingLabel = cbaDisplayableShippingLabel;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getEarliestShipDate() {
        return earliestShipDate;
    }

    public void setEarliestShipDate(String earliestShipDate) {
        this.earliestShipDate = earliestShipDate;
    }

    public String getLatestShipDate() {
        return latestShipDate;
    }

    public void setLatestShipDate(String latestShipDate) {
        this.latestShipDate = latestShipDate;
    }

    public String getEarliestDeliveryDate() {
        return earliestDeliveryDate;
    }

    public void setEarliestDeliveryDate(String earliestDeliveryDate) {
        this.earliestDeliveryDate = earliestDeliveryDate;
    }

    public String getLatestDeliveryDate() {
        return latestDeliveryDate;
    }

    public void setLatestDeliveryDate(String latestDeliveryDate) {
        this.latestDeliveryDate = latestDeliveryDate;
    }

    public String getIsBusinessOrder() {
        return isBusinessOrder;
    }

    public void setIsBusinessOrder(String isBusinessOrder) {
        this.isBusinessOrder = isBusinessOrder;
    }

    public String getIsPrime() {
        return isPrime;
    }

    public void setIsPrime(String isPrime) {
        this.isPrime = isPrime;
    }

    public String getIsPremiumOrder() {
        return isPremiumOrder;
    }

    public void setIsPremiumOrder(String isPremiumOrder) {
        this.isPremiumOrder = isPremiumOrder;
    }

    public String getIsGlobalExpressEnabled() {
        return isGlobalExpressEnabled;
    }

    public void setIsGlobalExpressEnabled(String isGlobalExpressEnabled) {
        this.isGlobalExpressEnabled = isGlobalExpressEnabled;
    }

    public String getReplacedOrderId() {
        return replacedOrderId;
    }

    public void setReplacedOrderId(String replacedOrderId) {
        this.replacedOrderId = replacedOrderId;
    }

    public String getIsReplacementOrder() {
        return isReplacementOrder;
    }

    public void setIsReplacementOrder(String isReplacementOrder) {
        this.isReplacementOrder = isReplacementOrder;
    }

    public String getPromiseResponseDueDate() {
        return promiseResponseDueDate;
    }

    public void setPromiseResponseDueDate(String promiseResponseDueDate) {
        this.promiseResponseDueDate = promiseResponseDueDate;
    }

    public String getIsEstimatedShipDateSet() {
        return isEstimatedShipDateSet;
    }

    public void setIsEstimatedShipDateSet(String isEstimatedShipDateSet) {
        this.isEstimatedShipDateSet = isEstimatedShipDateSet;
    }

    public String getIsSoldByAb() {
        return isSoldByAb;
    }

    public void setIsSoldByAb(String isSoldByAb) {
        this.isSoldByAb = isSoldByAb;
    }

    public String getIsIspu() {
        return isIspu;
    }

    public void setIsIspu(String isIspu) {
        this.isIspu = isIspu;
    }

    public String getSellerDisplayName() {
        return sellerDisplayName;
    }

    public void setSellerDisplayName(String sellerDisplayName) {
        this.sellerDisplayName = sellerDisplayName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getFulfillmentSupplySourceId() {
        return fulfillmentSupplySourceId;
    }

    public void setFulfillmentSupplySourceId(String fulfillmentSupplySourceId) {
        this.fulfillmentSupplySourceId = fulfillmentSupplySourceId;
    }

    public Integer getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(Integer isRefund) {
        this.isRefund = isRefund;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(String refundDate) {
        this.refundDate = refundDate;
    }

    public Integer getIsPullItem() {
        return isPullItem;
    }

    public void setIsPullItem(Integer isPullItem) {
        this.isPullItem = isPullItem;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsPullAddress() {
        return isPullAddress;
    }

    public void setIsPullAddress(Integer isPullAddress) {
        this.isPullAddress = isPullAddress;
    }
}