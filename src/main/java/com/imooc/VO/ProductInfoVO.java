package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 描述:
 * 已经有ProductInfo，why还创建这个类？
 * 安全考虑 隐私考虑 这个是返回前端的字段 不会把数据库里的所有字段都返回出来
 * @author pzb
 * @create 2018-10-14 3:52 PM
 */
@Data
public class ProductInfoVO {
    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
