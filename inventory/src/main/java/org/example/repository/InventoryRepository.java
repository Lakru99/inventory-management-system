package org.example.repository;

import org.example.dto.Inventory;
import org.example.entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryEntity, Integer> {
    @Query(value = "SELECT * FROM inventory WHERE id=?1", nativeQuery = true)
    Inventory getInventoryById(Integer inventoryId);
}
