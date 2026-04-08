package com.shopscale.order_service.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_orders")
public class Order{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderNumber;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderLineItems>orderLineItemsList;
    public String getOrderNumber(){
        return orderNumber;
    }
    public void setOrderNumber(String orderNumber){
        this.orderNumber = orderNumber;
    }
    public List<OrderLineItems>getOrderLineItemsList(){
        return orderLineItemsList;
    }
    public void setOrderLineItemsList(List<OrderLineItems>list){
        this.orderLineItemsList = list;
    }
} 
