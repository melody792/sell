package com.imooc.enums;

import lombok.Getter;

/**
 * 描述:
 *
 * @author pzb
 * @create 2018-10-14 6:54 PM
 */
@Getter
public enum PayStatusEnum implements CodeEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
