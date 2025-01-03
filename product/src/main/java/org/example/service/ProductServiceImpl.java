package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.Product;
import org.example.entity.ProductEntity;
import org.example.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;
    private final ModelMapper mapper;
    @Override
    public Product getProductById(Integer productId) {
        Product product = repository.getProductById(productId);
        return mapper.map(product, Product.class);
    }

    @Override
    public List<Product> getAll() {
        List<Product> productList = new ArrayList<>();
        repository.findAll().forEach(entity ->{
            productList.add(mapper.map(entity, Product.class));
        });
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        repository.save(mapper.map(product, ProductEntity.class));
    }

    @Override
    public void deleteProduct(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Product searchProduct(Integer id) {
        return mapper.map(repository.findById(id), Product.class);
    }

    @Override
    public void updateProduct(Product product) {
        repository.save(mapper.map(product, ProductEntity.class));
    }
}
