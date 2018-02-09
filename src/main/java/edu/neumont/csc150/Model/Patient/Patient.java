package edu.neumont.csc150.Model.Patient;

public interface Patient {


    public String getFirstName();

    public void setFirstName(String firstName);

    public String getLastName();

    public void setLastName(String lastName);

    public int getId();

    public void setId(int id);

    public String getInsuranceProvider();

    public void setInsuranceProvider(String insuranceProvider);

    public String getInsuranceGroupId();

    public void setInsuranceGroupId(String insuranceGroupId);

    public String getProcedure();

    public void setProcedure(String procedure);

    public double getAccount();

    public void setAccount(double account);

    public double getProcedureCost();

    public void setProcedureCost(double procedureCost);

    public String getProviderName();

    public void setProviderName(String providerName);

}
