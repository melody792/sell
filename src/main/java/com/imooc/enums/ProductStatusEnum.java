package com.imooc.enums;

import lombok.Getter;

/**
 * 描述:
 *
 * @author pzb
 * @create 2018-10-14 2:26 PM
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
