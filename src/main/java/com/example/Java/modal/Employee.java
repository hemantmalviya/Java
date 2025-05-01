package com.example.Java.modal;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
public class Employee {
    private String employeeName;
    private String department;
    private int employee_id;
    private double salary;


    public Employee(String employeeName, String department, int employee_id, double salary) {
        this.department = department;
        this.employee_id = employee_id;
        this.employeeName = employeeName;
        this.salary = salary;
    }

}
