package com.android.toma.checkapp.entity;

public class Employee implements Identity {

    private String mName;
    private String mLastName;
    private long mId;
    private boolean mIsRegistered;
    private String login;
    private String password;

    public Employee(String name, String lastName) {
        this.mName = name;
        this.mLastName = lastName;
    }

    public String getName() {
        return mName;
    }

    public String getLastName() {
        return mLastName;
    }

    public boolean isRegistered() {
        return mIsRegistered;
    }

    @Override
    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public void setRegistered(boolean registered) {
        mIsRegistered = registered;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
