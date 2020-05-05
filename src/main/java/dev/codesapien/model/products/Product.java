package dev.codesapien.model.products;

import java.util.List;

public abstract class Product {
    protected String customerId;
    protected String domain;
    protected int durationMonths;
    protected String startDate;
    protected List<Integer> emailDaysFromExpiration;

    public Boolean add(String customerId, String domain, int durationMonths) {
        this.customerId = customerId;
        this.domain = domain;
        this.durationMonths = durationMonths;

        setEmailDaysFromExpiration();

        return validCustomerId() && validDomain() && validDurationMonths();
    }

    public Boolean load(String customerId, String domain, String startDate, int durationMonths) {
        this.customerId = customerId;
        this.domain = domain;
        this.startDate = startDate;
        this.durationMonths = durationMonths;

        setEmailDaysFromExpiration();

        return validCustomerId() && validDomain() && validStartDate() && validDurationMonths();
    }

    public abstract String getType();

    protected abstract void setEmailDaysFromExpiration();

    protected abstract boolean validCustomerId();
    protected abstract boolean validDomain();
    protected abstract boolean validDurationMonths();
    protected abstract boolean validStartDate();
}
