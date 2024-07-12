package com.examples.empapp.service;

import com.examples.empapp.model.Employee;

import java.util.Collection;
import java.util.List;

public interface EmployeeService {
    public boolean add(Employee employee);
    public boolean update(Employee employee);
    public Employee get(int id);
    public Collection<Employee> getAll();
    public boolean delete(Employee employee);
}
