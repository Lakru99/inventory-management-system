package org.example.service;

import org.example.dto.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Integer productId);
    List<Product> getAll();
    void addProduct(Product product);
    void deleteProduct(Integer id);
    Product searchProduct(Integer id);
    void updateProduct(Product product);
}
