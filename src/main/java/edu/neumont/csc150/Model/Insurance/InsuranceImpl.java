package edu.neumont.csc150.Model.Insurance;

public class InsuranceImpl implements Insurance{

    private String companyName;

    public InsuranceImpl() {
    }

    public InsuranceImpl (String cn) {

        this.setCompanyName(cn);

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
