package fpt.aptech.projectbe.service;

import fpt.aptech.projectbe.entites.Product;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Product findById(Integer id);
    Product save(Product product);
    void deleteById(Integer id);
    Product update(Product product);
    List<Product> findByCategoryId(Integer categoryId);
    List<Product> findRelatedProducts(Integer categoryId, Integer productId);
    List<Product> filterProducts(String category, java.math.BigDecimal minPrice, java.math.BigDecimal maxPrice, java.util.List<String> sizes);
} 