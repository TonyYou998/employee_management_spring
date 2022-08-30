package com.example.employee_management.controller;

import com.example.employee_management.DTO.AddEmployeeDto;
import com.example.employee_management.Service.EmployeeService;
import com.example.employee_management.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl  implements EmployeeService {
    private EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }
    @Override
    public Employee add(AddEmployeeDto dto) {
        Employee e=new Employee();
        e.setName(dto.getName());
        e.setPassword(dto.getPassword());
        e.setMsnv(dto.getMaNv());
        e.setEmail(dto.getEmail());
        employeeRepository.save(e);
        return e;
    }

    @Override
    public List<Employee> get() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByName(name);

    }

    @Override
    public Object deleteById(String id) {
        Employee e= employeeRepository.findById(Long.parseLong(id)).get();
        if(e ==null)
            return "ko cos";
        employeeRepository.deleteById(Long.parseLong(id));
        return e;


    }
}
