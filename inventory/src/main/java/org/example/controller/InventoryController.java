package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Inventory;
import org.example.service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/order")
@RequiredArgsConstructor
@CrossOrigin
public class InventoryController {
    final InventoryService service;
    @GetMapping("/get-all")
    public List<Inventory> getAll(){
        return service.getAll();
    }
    @GetMapping("/get-inventory/{inventoryId}")
    public Inventory getInventoryById(@PathVariable Integer inventoryId){
        return service.getInventoryById(inventoryId);
    }
    @PostMapping("/add-inventory")
    public void addInventory(@RequestBody Inventory inventory){
        service.addInventory(inventory);
    }
    @DeleteMapping("/delete-inventory/{id}")
    public void deleteInventoryById(@PathVariable Integer id){
        service.deleteInventory(id);
    }
    @GetMapping("/search-inventory/{id}")
    public Inventory searchInventoryById(@PathVariable Integer id){
        return service.searchInventory(id);
    }
    @PutMapping("/update-inventory")
    public void updateInventoryById(@RequestBody Inventory inventory){
        service.updateInventory(inventory);
    }

}
