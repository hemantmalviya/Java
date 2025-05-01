package com.example.Java.service;

import com.example.Java.modal.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface EmployeeService {

    public String addEmployee(Employee employee);

    public Employee getEmployee(int employeeId);

    public String updateEmployee(Employee employee);

    public String deleteEmployee(int employeeId);

    ArrayList<Employee> getEmployees();
}
