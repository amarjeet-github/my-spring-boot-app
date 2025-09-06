package com.payroll.employeeservice.repository;

import com.payroll.employeeservice.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees, Long> {
}
