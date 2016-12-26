package com.android.toma.checkapp.dao;

import com.android.toma.checkapp.entity.Employer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployerDAO implements AbstractDAO<Employer> {

    private static List<Employer> sEmployers = new ArrayList<>();
    private static long sNextId = 0;

    private static EmployerDAO instance;

    public static EmployerDAO getInstance(){
        if (instance == null){
            instance = new EmployerDAO();
        }
        return instance;
    }
    @Override
    public Employer save(Employer employer) {
        if (sEmployers.size() == 0){
            employer.setId(++sNextId);
            sEmployers.add(employer);
        }
        for (int i = 0; i < sEmployers.size(); i++) {
            if (!sEmployers.contains(employer)){
                employer.setId(++sNextId);
                sEmployers.add(employer);
            }
        }
        return employer;
    }

    @Override
    public void delete(Employer item) {

    }

    @Override
    public void saveAll(List<Employer> list) {

    }

    @Override
    public void deleteAll(List<Employer> list) {

    }

    @Override
    public List<Employer> getAll() {
        Set<Employer> userSet = new HashSet<>(sEmployers);
        List<Employer> resultList = new ArrayList<>(userSet);
        if (resultList.isEmpty()){
            return null;
        }
        return resultList;
    }

    @Override
    public Employer getById(long id) {
        return null;
    }
}
