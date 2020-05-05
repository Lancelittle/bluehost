package dev.codesapien.usecase.product;

import dev.codesapien.model.products.Product;
import dev.codesapien.repo.ProductRepository;

public class LoadProduct {
    public static boolean exec(ProductRepository repo, String type, String customerId, String domain, String startDate, int durationMonths) {
        Product product = CreateProduct.exec(type, domain);
        if (product == null) {
            return false;
        }

        boolean valid = product.load(customerId, domain, startDate, durationMonths);
        if (valid) {
            repo.create(product);
            ProcessProduct.exec(product);
            return true;
        }
        return false;
    }
}
