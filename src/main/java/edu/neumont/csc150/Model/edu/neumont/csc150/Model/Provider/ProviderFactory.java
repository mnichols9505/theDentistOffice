package edu.neumont.csc150.Model.edu.neumont.csc150.Model.Provider;

public class ProviderFactory {

    public static Provider getInstance() {

        return new ProviderImpl();

    }

    public static ProviderImpl getInstance(String fn, String ln, String t, int id) {

        return new ProviderImpl(ln, fn, t, id);

    }

}
