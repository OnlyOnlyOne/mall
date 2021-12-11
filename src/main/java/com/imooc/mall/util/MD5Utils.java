package com.imooc.mall.util;


import com.imooc.mall.common.Constant;
import org.apache.tomcat.util.codec.binary.Base64;

import javax.annotation.processing.Messager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * The type Md 5 utils.
 * MD5工具
 */
public class MD5Utils {
    public static String getMD5String(String strValue) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        return Base64.encodeBase64String(md5.digest((strValue + Constant.SALT).getBytes()));//所接受的类型是bytes
    }


    //用这个方法测试生成的MD5的值
    public static void main(String[] args) {
        String md5 = null;

        try {
            md5 = getMD5String("1234");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        System.out.println(md5);
    }

}
