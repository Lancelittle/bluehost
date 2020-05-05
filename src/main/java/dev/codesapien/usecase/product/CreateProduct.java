package dev.codesapien.usecase.product;

import dev.codesapien.model.products.Product;
import dev.codesapien.model.products.domain.Domain;
import dev.codesapien.model.products.domain.EducationalDomain;
import dev.codesapien.model.products.domain.ProtectedDomain;
import dev.codesapien.model.products.email.Email;
import dev.codesapien.model.products.hosting.Hosting;
import dev.codesapien.usecase.domain.DomainExists;

public class CreateProduct {
    public static Product exec(String type, String domain) {
        Product product;
        switch (type) {
            case Domain.type:
                if (!DomainExists.exec(domain, false)) {
                    return null;
                }
                product = new Domain();
                break;
            case EducationalDomain.type:
                if (!DomainExists.exec(domain, false)) {
                    return null;
                }
                product = new EducationalDomain();
                break;
            case ProtectedDomain.type:
                if (!DomainExists.exec(domain, false)) {
                    return null;
                }
                product = new ProtectedDomain();
                break;
            case Email.type:
                product = new Email();
                break;
            case Hosting.type:
                if (!DomainExists.exec(domain, true)) {
                    return null;
                }
                product = new Hosting();
                break;
            default:
                return null;
        }

        return product;
    }
}
