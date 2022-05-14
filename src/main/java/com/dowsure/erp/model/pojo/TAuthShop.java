package com.dowsure.erp.model.pojo;

import java.util.Date;

/**
 * 授权店铺
 */
public class TAuthShop {
    /**
     * 编号
     */
    private Long id;

    /**
     * 用户编号
     */
    private Long userId;

    /**
     * 所属平台：EBAY：ebay平台，AMAZON：亚马逊平台
     */
    private String belongPlatform;

    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 亚马逊店铺唯一编号
     */
    private String sellerId;

    /**
     * 市场编号
     */
    private String marketplaceId;

    /**
     * 所属区域
     */
    private String region;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 是否删除：默认-0；0-未删除；1-已删除；
     */
    private Integer isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getBelongPlatform() {
        return belongPlatform;
    }

    public void setBelongPlatform(String belongPlatform) {
        this.belongPlatform = belongPlatform;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
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

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}