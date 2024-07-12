package com.examples.empapp.service;

import com.examples.empapp.dao.EmployeeDao;
import com.examples.empapp.dao.EmployeeDaoJdbcImpl;
import com.examples.empapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class EmployeeServiceJdbcImpl implements EmployeeService{

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public boolean add(Employee employee) {
        return employeeDao.add(employee);
    }

    @Override
    public boolean update(Employee employee) {
        return employeeDao.update(employee);
    }

    @Override
    public Employee get(int id) {
        return employeeDao.get(id);
    }

    @Override
    public Collection<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    public boolean delete(Employee employee) {
        return employeeDao.delete(employee);
    }
}
