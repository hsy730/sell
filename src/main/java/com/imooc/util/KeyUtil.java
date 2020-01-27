package com.imooc.util;

import java.util.Random;

/**
 * @author 小黄斯基
 * @version 1.0
 * @date 2020-01-27 17:47
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式：时间 + 随机数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        System.out.println(System.currentTimeMillis());
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
