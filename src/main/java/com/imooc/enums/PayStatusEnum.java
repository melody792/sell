package com.imooc.enums;

import lombok.Getter;

/**
 * 描述:
 *
 * @author pzb
 * @create 2018-10-14 6:54 PM
 */
@Getter
public enum PayStatusEnum implements CodeEnum{

    WAIT(0,"等待"),
    SUCCESS(1, "成功");

    private Integer code;
    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
