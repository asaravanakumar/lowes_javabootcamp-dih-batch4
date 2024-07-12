package com.examples.empapp.dao;

import com.examples.empapp.model.Employee;

import java.util.Collection;

public interface EmployeeDao {

    public boolean add(Employee employee);
    public boolean update(Employee employee);
    public Employee get(int id);
    public Collection<Employee> getAll();
    public boolean delete(Employee employee);
}
