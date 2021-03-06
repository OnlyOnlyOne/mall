package com.dowsure.erp.model.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
    * 商品表
    */
public class AddProductReq {


    /**
    * 商品名称
    */
    @NotNull(message = "名字不能为null")
    private String name;

    /**
    * 产品图片,相对路径地址
    */
    @NotNull(message = "图片不能为null")
    private String image;

    /**
    * 商品详情
    */
    private String detail;

    /**
    * 分类id
    */
    @NotNull(message = "分类不能为null")
    private Integer categoryId;

    /**
    * 价格,单位-分
    */
    @NotNull(message = "价格不能为null")
    @Min(value = 1,message = "价格不能小于1分")
    private Integer price;

    /**
    * 库存数量
    */
    @NotNull(message = "库存不能为null")
    @Max(value = 10000,message = "库存不能大于10000")
    private Integer stock;

    /**
    * 商品上架状态：0-下架，1-上架
    */
    private Integer status;





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AddProductReq{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", detail='" + detail + '\'' +
                ", categoryId=" + categoryId +
                ", price=" + price +
                ", stock=" + stock +
                ", status=" + status +
                '}';
    }
}