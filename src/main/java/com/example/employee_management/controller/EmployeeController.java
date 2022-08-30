package com.example.employee_management.controller;

import com.example.employee_management.DTO.AddEmployeeDto;
import com.example.employee_management.Service.EmployeeService;
import com.example.employee_management.entities.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/v1/employee")
public class EmployeeController {
    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;

    }
    @CrossOrigin
    @PostMapping("/add")
    public Object addEmployee(@RequestBody AddEmployeeDto dto){
        return employeeService.add(dto);


    }
    @CrossOrigin
    @GetMapping("/get")
    public Object getEmployee(){
          List<Employee> lstEmloyee=employeeService.get();
            return  lstEmloyee;
    }

    @GetMapping("/get/{name}")
    public Object getEmployeeByName( @PathVariable String name){
        return employeeService.getEmployeeByName(name);

    }

    @DeleteMapping("/delete/{id}")
    public Object deleteEmployee(@PathVariable String id){
       return employeeService.deleteById(id);

    }


}
