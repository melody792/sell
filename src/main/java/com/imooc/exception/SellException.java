package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * 描述:
 *
 * @author pzb
 * @create 2018-10-28 2:11 PM
 */
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
