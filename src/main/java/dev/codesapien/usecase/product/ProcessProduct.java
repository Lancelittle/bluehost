package dev.codesapien.usecase.product;

import dev.codesapien.model.products.Product;
import dev.codesapien.model.products.domain.Domain;
import dev.codesapien.model.products.domain.EducationalDomain;
import dev.codesapien.model.products.domain.ProtectedDomain;
import dev.codesapien.model.products.email.Email;
import dev.codesapien.model.products.hosting.Hosting;
import dev.codesapien.usecase.account.ProvisionAccount;
import dev.codesapien.usecase.billing.BillCustomer;
import dev.codesapien.usecase.domain.RegisterDomain;
import dev.codesapien.usecase.domain.SecureDomain;
import dev.codesapien.usecase.email.CreateEmailRouting;
import dev.codesapien.usecase.email.SendWelcomeEmail;

public class ProcessProduct {
    public static void exec(Product product) {
        switch (product.getType()) {
            case Domain.type:
            case EducationalDomain.type:
                BillCustomer.exec();
                RegisterDomain.exec();
                break;
            case ProtectedDomain.type:
                BillCustomer.exec();
                RegisterDomain.exec();
                SecureDomain.exec();
                break;
            case Email.type:
                BillCustomer.exec();
                CreateEmailRouting.exec();
                break;
            case Hosting.type:
                BillCustomer.exec();
                ProvisionAccount.exec();
                SendWelcomeEmail.exec();
                break;
        }
    }
}
