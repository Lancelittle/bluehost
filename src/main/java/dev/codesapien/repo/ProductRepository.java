package dev.codesapien.repo;


import dev.codesapien.model.products.Product;

import java.util.List;

public interface ProductRepository {
    public void create(Product product);
    public List<Product> get();
    public List<Product> getByType(String type);
}
