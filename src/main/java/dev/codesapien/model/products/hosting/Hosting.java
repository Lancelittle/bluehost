package dev.codesapien.model.products.hosting;

import dev.codesapien.model.products.Product;

import java.util.ArrayList;

public class Hosting extends Product {
    public static final String type = "hosting";

    @Override
    public String getType() {
        return type;
    }

    @Override
    protected void setEmailDaysFromExpiration() {
        emailDaysFromExpiration = new ArrayList<>();
        emailDaysFromExpiration.add(-3, 1);
    }

    @Override
    protected boolean validCustomerId() {
        return true;
    }

    @Override
    protected boolean validDomain() {
        return true;
    }

    @Override
    protected boolean validDurationMonths() {
        return durationMonths >= 1;
    }

    @Override
    protected boolean validStartDate() {
        return true;
    }
}
