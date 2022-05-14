package com.dowsure.erp.model.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
    * 财务组事件
    */
public class TFinancialEventGroup {
    /**
    * 编号
    */
    private Long id;

    /**
    * 店铺编号
    */
    private Long shopId;

    /**
    * 财务组事件编号
    */
    private String financialEventGroupId;

    /**
    * 处理状态
    */
    private String processingStatus;

    /**
    * 资金转移状态
    */
    private String fundTransferStatus;

    /**
    * 原币种金额
    */
    private BigDecimal originalAmount;

    /**
    * 原币种
    */
    private String originalUnit;

    /**
    * 换算币种金额
    */
    private BigDecimal convertedAmount;

    /**
    * 换算币种
    */
    private String convertedUnit;

    /**
    * 资金划转日期
    */
    private String fundTransferDate;

    /**
    * 追踪编号
    */
    private String traceId;

    /**
    * 账户尾号
    */
    private String accountTail;

    /**
    * 初期余额金额
    */
    private BigDecimal beginningBalanceAmount;

    /**
    * 初期余额币种
    */
    private String beginningBalanceUnit;

    /**
    * 财务事件组开始时间
    */
    private String financialEventGroupStart;

    /**
    * 财务事件组结束时间
    */
    private String financialEventGroupEnd;

    /**
    * 是否拉取财务详情事件：默认-0；0-未拉取；1-已拉取
    */
    private Integer isPullEvent;

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

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getFinancialEventGroupId() {
        return financialEventGroupId;
    }

    public void setFinancialEventGroupId(String financialEventGroupId) {
        this.financialEventGroupId = financialEventGroupId;
    }

    public String getProcessingStatus() {
        return processingStatus;
    }

    public void setProcessingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
    }

    public String getFundTransferStatus() {
        return fundTransferStatus;
    }

    public void setFundTransferStatus(String fundTransferStatus) {
        this.fundTransferStatus = fundTransferStatus;
    }

    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
    }

    public String getOriginalUnit() {
        return originalUnit;
    }

    public void setOriginalUnit(String originalUnit) {
        this.originalUnit = originalUnit;
    }

    public BigDecimal getConvertedAmount() {
        return convertedAmount;
    }

    public void setConvertedAmount(BigDecimal convertedAmount) {
        this.convertedAmount = convertedAmount;
    }

    public String getConvertedUnit() {
        return convertedUnit;
    }

    public void setConvertedUnit(String convertedUnit) {
        this.convertedUnit = convertedUnit;
    }

    public String getFundTransferDate() {
        return fundTransferDate;
    }

    public void setFundTransferDate(String fundTransferDate) {
        this.fundTransferDate = fundTransferDate;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getAccountTail() {
        return accountTail;
    }

    public void setAccountTail(String accountTail) {
        this.accountTail = accountTail;
    }

    public BigDecimal getBeginningBalanceAmount() {
        return beginningBalanceAmount;
    }

    public void setBeginningBalanceAmount(BigDecimal beginningBalanceAmount) {
        this.beginningBalanceAmount = beginningBalanceAmount;
    }

    public String getBeginningBalanceUnit() {
        return beginningBalanceUnit;
    }

    public void setBeginningBalanceUnit(String beginningBalanceUnit) {
        this.beginningBalanceUnit = beginningBalanceUnit;
    }

    public String getFinancialEventGroupStart() {
        return financialEventGroupStart;
    }

    public void setFinancialEventGroupStart(String financialEventGroupStart) {
        this.financialEventGroupStart = financialEventGroupStart;
    }

    public String getFinancialEventGroupEnd() {
        return financialEventGroupEnd;
    }

    public void setFinancialEventGroupEnd(String financialEventGroupEnd) {
        this.financialEventGroupEnd = financialEventGroupEnd;
    }

    public Integer getIsPullEvent() {
        return isPullEvent;
    }

    public void setIsPullEvent(Integer isPullEvent) {
        this.isPullEvent = isPullEvent;
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