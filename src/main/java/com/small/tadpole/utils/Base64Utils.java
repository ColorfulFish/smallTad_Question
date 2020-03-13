package com.small.tadpole.utils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/*
 * @Author xu.chenyang
 * @Email chenyang.xu@linkkids.cn
 * @Description
 * @Date 18:08 2020/3/13
 **/
public class Base64Utils {
    private final Base64.Decoder decoder = Base64.getDecoder();
    private final Base64.Encoder encoder = Base64.getEncoder();

    /**
     * 解密
     * @param text
     * @return
     */
    public String enCode(String text) {
        try {
            final byte[] textByte = text.getBytes("UTF-8");
            return encoder.encodeToString(textByte);
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    /**
     * 加密
     * @param text
     * @return
     */
    public String deCode(String text) {
        try {
            return new String(decoder.decode(text), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }
}
