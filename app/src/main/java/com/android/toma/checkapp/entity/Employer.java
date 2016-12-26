package com.android.toma.checkapp.entity;

public class Employer implements Identity{

    private String mName;
    private String mLastName;
    private String mCompany;
    private long mId;
    private boolean mIsRegistered;

    public Employer(String name, String lastName, String company) {
        mName = name;
        mLastName = lastName;
        mCompany = company;
    }

    public String getName() {
        return mName;
    }

    public String getLastName() {
        return mLastName;
    }

    public String getCompany() {
        return mCompany;
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
}
