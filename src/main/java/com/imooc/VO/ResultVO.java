package com.imooc.VO;

import lombok.Data;

/**
 * 描述:
 *    http请求返回的最外层对象 view object
 * @author pzb
 * @create 2018-10-14 3:43 PM
 */
@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private T data;
}
