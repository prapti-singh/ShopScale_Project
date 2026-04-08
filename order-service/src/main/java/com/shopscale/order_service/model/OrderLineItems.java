package com.shopscale.order_service.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_order_line_items")

public class OrderLineItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
    //Getters
    public String getSkuCode(){
        return skuCode;
    }
    public BigDecimal getPrice(){
        return price;
    }
    public Integer getQuantity(){
        return quantity;
    }
    //Setters
    public void setPrice(BigDecimal price){
        this.price = price;
    }
    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }
    public void setSkuCode(String skuCode){
        this.skuCode = skuCode;
    }
}
