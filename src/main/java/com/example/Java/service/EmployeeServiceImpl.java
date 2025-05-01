package com.example.Java.service;

import com.example.Java.Dao.EmployeeRepository;
import com.example.Java.modal.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public String addEmployee(Employee employee) {
        return employeeRepository.addEmployee(employee);
    }

    @Override
    public Employee getEmployee(int employeeId) {
        return employeeRepository.getEmployee(employeeId);
    }

    @Override
    public String updateEmployee(Employee employee) {
        return employeeRepository.updateEmployee(employee);
    }

    @Override
    public String deleteEmployee(int employeeId) {
        return employeeRepository.deleteEmployee(employeeId);
    }

    @Override
    public ArrayList<Employee> getEmployees() {
        return employeeRepository.getEmployees();
    }
}
