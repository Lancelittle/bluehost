package dev.codesapien.usecase.product;

import dev.codesapien.model.products.Product;
import dev.codesapien.repo.ProductRepository;

public class AddProduct {
    public static boolean exec(ProductRepository repo, String type, String customerId, String domain, int durationMonths) {
        Product product = CreateProduct.exec(type, domain);
        if (product == null) {
            return false;
        }

        boolean valid = product.add(customerId, domain, durationMonths);
        if (valid) {
            repo.create(product);
            ProcessProduct.exec(product);
            return true;
        }
        return false;
    }
}
