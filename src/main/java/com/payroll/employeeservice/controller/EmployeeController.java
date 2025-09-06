package com.payroll.employeeservice.controller;

import com.payroll.employeeservice.model.Employees;
import com.payroll.employeeservice.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employees> getAllEmployees() {
        System.out.println("I m in Employee controller class");

        return service.getAllEmployees();
    }

    @PostMapping
    public Employees saveEmployee(@RequestBody Employees employee) {
        return service.saveEmployee(employee);
    }
}
