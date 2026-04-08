package com.shopscale.order_service.dto;

import java.math.BigDecimal;

public class OrderLineItemsDto {
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;

    public String getSkuCode(){
        return skuCode;
    }
    public BigDecimal getPrice(){
        return price;
    }
    public Integer getQuantity(){
        return quantity;
    }
}
