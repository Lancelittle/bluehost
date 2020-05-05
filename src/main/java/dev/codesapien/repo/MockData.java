package dev.codesapien.repo;

import dev.codesapien.model.products.Product;

import java.util.ArrayList;
import java.util.List;

public class MockData {
    private static List<Product> products;

    public static List<Product> getProducts() {
        return products;
    }

    public static void createProducts(Product product) {
        if(products == null) {
            products = new ArrayList<>();
        }
        products.add(product);
    }
}
