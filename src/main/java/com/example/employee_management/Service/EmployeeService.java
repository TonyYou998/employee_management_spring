package com.example.employee_management.Service;

import com.example.employee_management.DTO.AddEmployeeDto;
import com.example.employee_management.entities.Employee;

import java.util.List;

public interface EmployeeService {

    Employee add(AddEmployeeDto dto);

    List<Employee> get();

    Employee getEmployeeByName(String name);


    Object deleteById(String id);
}
