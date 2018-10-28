package com.imooc.utils;

import java.util.Random;

/**
 * 描述:
 *
 * @author pzb
 * @create 2018-10-28 2:24 PM
 */
public class KeyUtil {

    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
