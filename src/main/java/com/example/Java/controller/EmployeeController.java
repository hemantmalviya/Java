package com.example.Java.controller;

import com.example.Java.modal.Employee;
import com.example.Java.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/app/v1")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "/add")
    public String add(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);

    }

    @PostMapping(value = "/update")
    public String update(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @GetMapping(value = "/employee/{id}")
    public Employee get(@PathVariable(value = "id") int employeeId) {
        Employee employee = employeeService.getEmployee(employeeId);
        System.out.println("Employee : " + employee);
        return employee;
    }

    @GetMapping(value = "/employees")
    public ArrayList<Employee> getAllEmployee() {
        ArrayList<Employee> employeesList =  employeeService.getEmployees();
        System.out.println(employeesList);
        return employeesList;
    }

    @DeleteMapping(value = "/delete/{employeeId}")
    public String delete(@PathVariable(value = "employeeId") int employeeId) {
        return employeeService.deleteEmployee(employeeId);
    }



}
