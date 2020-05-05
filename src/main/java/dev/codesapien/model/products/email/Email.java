package dev.codesapien.model.products.email;

import dev.codesapien.model.products.Product;

import java.util.ArrayList;

public class Email extends Product {
    public static final String type = "email";

    @Override
    public String getType() {
        return type;
    }

    @Override
    protected void setEmailDaysFromExpiration() {
        emailDaysFromExpiration = new ArrayList<>();
        emailDaysFromExpiration.add(-1);
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