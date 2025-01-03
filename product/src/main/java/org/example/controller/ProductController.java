package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Product;
import org.example.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
@RequiredArgsConstructor
@CrossOrigin
public class ProductController {
    final ProductService productService;
    @GetMapping("/get-all")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/get-product/{productId}")
    public Product getProductById(@PathVariable Integer productId){
        return productService.getProductById(productId);
    }
    @PostMapping("/add-product")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }
    @DeleteMapping("/delete-product/{id}")
    public void deleteProductById(@PathVariable Integer id){
        productService.deleteProduct(id);
    }
    @GetMapping("/search-product/{id}")
    public Product searchProductById(@PathVariable Integer id){
        return productService.searchProduct(id);
    }
    @PutMapping("/update-product")
    public void updateProductById(@RequestBody Product product){
        productService.updateProduct(product);
    }

}
