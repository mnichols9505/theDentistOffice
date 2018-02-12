package edu.neumont.csc150.Model.User;

public class UserFactory {

    public User getInstance() {

        return new UserImpl();

    }

    public UserImpl getInstance(long pw, String un) {

        return new UserImpl(pw, un);

    }

}
