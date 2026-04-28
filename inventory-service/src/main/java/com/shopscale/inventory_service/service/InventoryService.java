package com.shopscale.inventory_service.service;

import com.shopscale.inventory_service.dto.InventoryResponse;
import com.shopscale.inventory_service.model1.Inventory;
import com.shopscale.inventory_service.repository.InventoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @Transactional(readOnly = true)
    public List<InventoryResponse> isInStock(List<String> skuCode) {
        // Ensure Repository returns List<Inventory>, not List<Object>
        List<Inventory> inventoryList = inventoryRepository.findBySkuCodeIn(skuCode);

        return inventoryList.stream()
                .map(inventory -> InventoryResponse.builder()
                        .skuCode(inventory.getSkuCode())
                        .isInStock(inventory.getQuantity() > 0)
                        .build()
                ).toList();
    }
}