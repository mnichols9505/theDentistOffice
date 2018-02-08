package edu.neumont.csc150.Model.Patient;

public class PatientImpl {

    private String firstName;
    private String lastName;
    private int id;
    private String insuranceProvider;
    private String insuranceGroupId;
    private String procedure;
    private double account;
    private double procedureCost;
    private String providerName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public void setInsuranceProvider(String insuranceProvider) {
        this.insuranceProvider = insuranceProvider;
    }

    public String getInsuranceGroupId() {
        return insuranceGroupId;
    }

    public void setInsuranceGroupId(String insuranceGroupId) {
        this.insuranceGroupId = insuranceGroupId;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public double getProcedureCost() {
        return procedureCost;
    }

    public void setProcedureCost(double procedureCost) {
        this.procedureCost = procedureCost;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
}
