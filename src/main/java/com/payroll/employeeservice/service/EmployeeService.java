package com.payroll.employeeservice.service;

import com.payroll.employeeservice.model.Employees;
import com.payroll.employeeservice.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employees> getAllEmployees() {
        return repository.findAll();
    }

    public Employees saveEmployee(Employees employee) {
        return repository.save(employee);
    }
}
