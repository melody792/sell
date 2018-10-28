package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * 描述:
 *
 * @author pzb
 * @create 2018-10-28 3:00 PM
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
