package dev.codesapien.model.products.domain;

import dev.codesapien.model.products.Product;

import java.util.ArrayList;

public class Domain extends Product {
    public static final String type = "domain";

    @Override
    public String getType() {
        return type;
    }

    @Override
    protected void setEmailDaysFromExpiration() {
        emailDaysFromExpiration = new ArrayList<>();
        emailDaysFromExpiration.add(-2);
    }

    @Override
    public boolean validCustomerId() {
        return true;
    }

    @Override
    protected boolean validDomain() {
        return domain.toLowerCase().contains(".com") || domain.toLowerCase().contains(".org");
    }

    @Override
    protected boolean validDurationMonths() {
        return durationMonths >= 12 && durationMonths % 12 == 0;
    }

    @Override
    protected boolean validStartDate() {
        return true;
    }
}
