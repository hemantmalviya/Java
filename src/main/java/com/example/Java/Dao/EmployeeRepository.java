package com.example.Java.Dao;


import com.example.Java.modal.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class EmployeeRepository {

    public String addEmployee(Employee employee) {
        return "Employee data is saved in the DB with Employee Id : " + employee.getEmployee_id();
    }


    public Employee getEmployee(int employeeId) {
        Employee employee = null;
        if (employeeId == 123) {
            employee = new Employee("Hemant", "IT", 123, 100.00);
        }
        return employee;
    }


    public String updateEmployee(Employee employee) {
        return "Employee data is updated in the DB with employee Id : " + employee.getEmployee_id();
    }


    public String deleteEmployee(int employeeId) {
        return "Employee data is Deleted from the DB with employee Id : " + employeeId;
    }


    public ArrayList<Employee> getEmployees() {
        ArrayList<Employee> employeesList = new ArrayList<>();
        Employee employee1 = new Employee("Hemant", "IT", 123, 100.00);
        Employee employee2 = new Employee("Akash", "EC", 125, 100.00);
        employeesList.add(employee1);
        employeesList.add(employee2);
        return employeesList;
    }
}
