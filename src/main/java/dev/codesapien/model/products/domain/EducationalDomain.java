package dev.codesapien.model.products.domain;

public class EducationalDomain extends Domain {
    public static final String type = "edomain";

    @Override
    public String getType() {
        return type;
    }

    @Override
    protected boolean validDomain() {
        return domain.toLowerCase().contains(".edu");
    }
}
