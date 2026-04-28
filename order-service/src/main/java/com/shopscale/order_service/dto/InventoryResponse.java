package com.shopscale.order_service.dto;

public class InventoryResponse {
    private String skuCode;
    private boolean inStock;

    // Default Constructor (Needed for JSON mapping)
    public InventoryResponse() {}

    public InventoryResponse(String skuCode, boolean inStock) {
        this.skuCode = skuCode;
        this.inStock = inStock;
    }

    // Getters and Setters
    public String getSkuCode() { return skuCode; }
    public void setSkuCode(String skuCode) { this.skuCode = skuCode; }

    public boolean isInStock() { return inStock; }
    public void setInStock(boolean inStock) { this.inStock = inStock; }
}
