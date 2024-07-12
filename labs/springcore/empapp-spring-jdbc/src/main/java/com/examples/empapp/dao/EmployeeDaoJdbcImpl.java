package com.examples.empapp.dao;

import com.examples.empapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EmployeeDaoJdbcImpl implements EmployeeDao {

    @Autowired
    private Connection con;
    private PreparedStatement pstmt;
    private Statement stmt;
    private ResultSet rs;

    @Override
    public boolean add(Employee employee) {
// INSERT employee data
        boolean status = false;
        try {
//			stmt = conn.createStatement();
//			String query = "INSERT INTO employee(name, age, designation, department, country) values(\""
//					+ employee.getName() + "\"," + employee.getAge() + ",\"" + employee.getDesignation() + "\",\""
//					+ employee.getDepartment() + "\",\"" + employee.getCountry() + "\")";

            String query = "INSERT INTO employee(name, age, designation, department, country) values(?,?,?,?,?)";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, employee.getName());
            pstmt.setInt(2, employee.getAge());
            pstmt.setString(3, employee.getDesignation());
            pstmt.setString(4, employee.getDepartment());
            pstmt.setString(5, employee.getCountry());

//			status = pstmt.execute(query);
//			pstmt.execute();
            status = pstmt.executeUpdate() > 0 ? true : false;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public boolean update(Employee employee) {
        return false;
    }

    @Override
    public Employee get(int id) {
        return null;
    }

    @Override
    public Collection<Employee> getAll() {
// SELECT All employees
        List<Employee> employees = new ArrayList<>();
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM employee");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String designation = rs.getString("designation");
                String department = rs.getString("department");
                String country = rs.getString("country");
                employees.add(new Employee(id, name, age, designation, department, country));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;    }

    @Override
    public boolean delete(Employee employee) {
        return false;
    }
}
