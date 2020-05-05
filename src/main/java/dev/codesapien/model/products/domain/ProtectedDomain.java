package dev.codesapien.model.products.domain;

public class ProtectedDomain extends Domain {
    public static final String type = "pdomain";

    @Override
    public String getType() {
        return type;
    }

    @Override
    protected boolean validDomain() {
        return domain.toLowerCase().contains(".edu");
    }
}
