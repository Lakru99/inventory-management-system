package org.example.service;

import org.example.dto.Inventory;

import java.util.List;

public interface InventoryService {
    Inventory getInventoryById(Integer inventoryId);
    List<Inventory> getAll();
    void addInventory(Inventory order);
    void deleteInventory(Integer id);
    Inventory searchInventory(Integer id);
    void updateInventory(Inventory inventory);
}
