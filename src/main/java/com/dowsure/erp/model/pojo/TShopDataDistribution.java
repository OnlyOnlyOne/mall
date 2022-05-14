package com.dowsure.erp.model.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
    * 店铺数据存储位置分配表
    */
@TableName("t_shop_data_distribution")
public class TShopDataDistribution {
    /**
    * 主键编号
    */
    private Long id;

    /**
    * 店铺编号
    */
    private Long shopId;

    /**
    * 数据库后缀
    */
    private String databaseSuffix;

    /**
    * 表后缀
    */
    private String tableSuffix;

    /**
    * 创建时间
    */
    private Date createTime;

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

    public String getDatabaseSuffix() {
        return databaseSuffix;
    }

    public void setDatabaseSuffix(String databaseSuffix) {
        this.databaseSuffix = databaseSuffix;
    }

    public String getTableSuffix() {
        return tableSuffix;
    }

    public void setTableSuffix(String tableSuffix) {
        this.tableSuffix = tableSuffix;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}