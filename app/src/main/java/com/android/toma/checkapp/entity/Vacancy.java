package com.android.toma.checkapp.entity;

public class Vacancy {

    private String mPosition;
    private long mSalary;

    public Vacancy(String position, long salary) {
        mPosition = position;
        mSalary = salary;
    }

    public String getPosition() {
        return mPosition;
    }

    public void setPosition(String position) {
        mPosition = position;
    }

    public long getSalary() {
        return mSalary;
    }

    public void setSalary(long salary) {
        mSalary = salary;
    }
}
