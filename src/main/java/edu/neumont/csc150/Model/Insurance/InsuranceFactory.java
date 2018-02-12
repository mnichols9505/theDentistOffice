package edu.neumont.csc150.Model.Insurance;

public class InsuranceFactory {

    public static Insurance getInstance(){

        return new InsuranceImpl();

    }

    public static InsuranceImpl getInstance(String cn){

        return new InsuranceImpl(cn);

    }

}
