package com.android.toma.checkapp.dao;

import com.android.toma.checkapp.entity.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeDAO implements AbstractDAO<Employee> {
    private static List<Employee> sEmployees = new ArrayList<>();
    private static long sNextId = 0;

    private static EmployeeDAO instance;

    public static EmployeeDAO getInstance(){
        if (instance == null){
            instance = new EmployeeDAO();
        }
        return instance;
    }

    @Override
    public Employee save(Employee employee) {
        if (sEmployees.size() == 0){
            employee.setId(++sNextId);
            sEmployees.add(employee);
        }
        for (int i = 0; i < sEmployees.size(); i++) {
            if (!sEmployees.contains(employee)){
                employee.setId(++sNextId);
                sEmployees.add(employee);
            }
        }
        return employee;
    }

    @Override
    public void delete(Employee item) {

    }

    @Override
    public void saveAll(List<Employee> list) {

    }

    @Override
    public void deleteAll(List<Employee> list) {

    }

    @Override
    public List<Employee> getAll() {
        Set<Employee> userSet = new HashSet<>(sEmployees);
        List<Employee> resultList = new ArrayList<>(userSet);
        if (resultList.isEmpty()){
            return null;
        }
        return resultList;
    }

    @Override
    public Employee getById(long id) {
        return null;
    }
}
