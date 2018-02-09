package edu.neumont.csc150.Model.Patient;

public class PatientImpl {

    private String firstName;
    private String lastName;
    private long id;
    private String insuranceProvider;
    private String insuranceGroupId;
    private String procedure;
    private double account;
    private double procedureCost;
    private String providerName;

    public long getPaymentCard() {
        return paymentCard;
    }

    public void setPaymentCard(long paymentCard) {
        this.paymentCard = paymentCard;
    }

    private long paymentCard;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == "null") {
            throw new IllegalArgumentException("First Name cannot equal null");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == "null") {
            throw new IllegalArgumentException("Last Name cannot equal null");
        }
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
        if (procedure == "null") {
            throw new IllegalArgumentException("Have to have procedure naem");
        }
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
        if (providerName == "null") {
            throw new IllegalArgumentException("There has to be a provider");
        }
        this.providerName = providerName;
    }
}
