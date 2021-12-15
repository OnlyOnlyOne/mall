package com.imooc.mall.common;

import com.google.common.collect.Sets;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.FileDescriptor;
import java.util.Set;

/**
 * The type Constant.
 * 常量值
 */
@Component
public class Constant {
    public static final String SALT = "4JF3d5;[.49";
    public static final String IMOOC_MALL_USER = "imooc_mall_user";

    public static String FILE_UPLOAD_DIR;
    @Value("${file.upload.dir}")
    public void setFileUploadDir(String fileUploadDir) {
        FILE_UPLOAD_DIR = fileUploadDir;
    }

    public interface ProductListOrderBy{

        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price desc", "price asc");

    }

}
