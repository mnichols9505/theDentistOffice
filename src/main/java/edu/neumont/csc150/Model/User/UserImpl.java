package edu.neumont.csc150.Model.User;

public class UserImpl implements User{

    private long password;
    private String userName;

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName == "null") {
            throw  new IllegalArgumentException("Username cannot equal nul");
        }
        this.userName = userName;
    }
}
