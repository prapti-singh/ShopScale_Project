package com.shopscale.inventory_service.dto;

public class InventoryResponse {
    private String skuCode;
    private boolean isInStock;

    public InventoryResponse() {}

    public InventoryResponse(String skuCode, boolean isInStock) {
        this.skuCode = skuCode;
        this.isInStock = isInStock;
    }

    public String getSkuCode() { return skuCode; }
    public void setSkuCode(String skuCode) { this.skuCode = skuCode; }
    public boolean isInStock() { return isInStock; }
    public void setInStock(boolean inStock) { isInStock = inStock; }

    // Manual Builder Pattern
    public static InventoryResponseBuilder builder() {
        return new InventoryResponseBuilder();
    }

    public static class InventoryResponseBuilder {
        private String skuCode;
        private boolean isInStock;

        public InventoryResponseBuilder skuCode(String skuCode) {
            this.skuCode = skuCode;
            return this;
        }

        public InventoryResponseBuilder isInStock(boolean isInStock) {
            this.isInStock = isInStock;
            return this;
        }

        public InventoryResponse build() {
            return new InventoryResponse(skuCode, isInStock);
        }
    }
}