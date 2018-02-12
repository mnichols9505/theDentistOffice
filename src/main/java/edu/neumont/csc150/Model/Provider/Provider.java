package edu.neumont.csc150.Model.Provider;

/**
 * Provider interface
 * @author Matthew Nichols & Hailey Roberts
 */
public interface Provider {

    public String getLastName();

    public void setLastName(String lastName);

    public String getFirstName();

    public void setFirstName(String firstName);

    public String getTitle();

    public void setTitle(String title);

    public int getId();

    public void setId(int id);

}
