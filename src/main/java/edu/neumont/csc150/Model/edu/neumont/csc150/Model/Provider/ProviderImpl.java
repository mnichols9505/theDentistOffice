package edu.neumont.csc150.Model.edu.neumont.csc150.Model.Provider;

public class ProviderImpl implements Provider {

    private String lastName;
    private String firstName;
    private String title;
    private int id;

    public ProviderImpl() {}

    public ProviderImpl(String ln, String fn, String ti, int id){

        this.setFirstName(fn);
        this.setLastName(ln);
        this.setId(id);
        this.setTitle(ti);

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
