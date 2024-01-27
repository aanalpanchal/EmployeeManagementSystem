package com.humber.j2ee.Week3Demo.services;

import com.humber.j2ee.Week3Demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    Map<Integer,Employee> employeeList = new HashMap<>();

    EmployeeServiceImpl(){
        employeeList.put(101, new Employee(101,"Anu","Panchal","anu@panchal.com"));
        employeeList.put(102,new Employee(102,"Renil","Soni","renil@soni.com"));
    }
    @Override
    public List<Employee> getAllEmoloyees() {
        return employeeList.values().stream().toList();
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.put(employee.getId(),employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        Employee employee = employeeList.get(id);
        return employee;
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeList.replace(employee.getId(),employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeList.remove(id);
    }

}
