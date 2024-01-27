package com.humber.j2ee.Week3Demo.services;

import com.humber.j2ee.Week3Demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmoloyees();

    public void addEmployee(Employee employee);

    public Employee getEmployeeById(int id);

    public void updateEmployee(Employee employee);

    public void deleteEmployee(int id);
}
