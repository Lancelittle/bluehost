package dev.codesapien.repo.impl;

import dev.codesapien.model.products.Product;
import dev.codesapien.repo.MockData;
import dev.codesapien.repo.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImplementation implements ProductRepository {
    @Override
    public void create(Product product) {
        MockData.createProducts(product);
    }

    @Override
    public List<Product> get() {
        return MockData.getProducts();
    }

    @Override
    public List<Product> getByType(String type) {
        List<Product> filteredProducts = new ArrayList<>();
        MockData.getProducts().forEach(product -> {
            if (product.getType().equalsIgnoreCase(type)) {
                filteredProducts.add(product);
            }
        });
        return filteredProducts;
    }
}
