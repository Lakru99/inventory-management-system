package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.Inventory;
import org.example.entity.InventoryEntity;
import org.example.repository.InventoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {
    private final InventoryRepository repository;
    private final ModelMapper modelMapper;
    @Override
    public Inventory getInventoryById(Integer inventoryId) {
        Inventory inventory=repository.getInventoryById(inventoryId);
        return modelMapper.map(inventory, Inventory.class);
    }

    @Override
    public List<Inventory> getAll() {
        List<Inventory> inventoryList =new ArrayList<>();
        repository.findAll().forEach(entity ->{
            inventoryList.add(modelMapper.map(entity, Inventory.class));
        });
        return inventoryList;
    }

    @Override
    public void addInventory(Inventory inventory) {
        repository.save(modelMapper.map(inventory, InventoryEntity.class));
    }

    @Override
    public void deleteInventory(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Inventory searchInventory(Integer id) {
        return modelMapper.map(repository.findById(id), Inventory.class);
    }

    @Override
    public void updateInventory(Inventory inventory) {
        repository.save(modelMapper.map(inventory, InventoryEntity.class));
    }
}
