package org.example.repository;

import org.example.dto.Product;
import org.example.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    @Query(value = "SELECT * from product WHERE id=?1", nativeQuery = true)
    Product getProductById(Integer productId);

}
