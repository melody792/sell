package com.imooc.dto;

import lombok.Data;

/**
 * 描述:
 *
 * @author pzb
 * @create 2018-10-28 2:37 PM
 */
@Data
public class CartDTO {
    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
