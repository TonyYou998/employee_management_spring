package com.example.employee_management.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@Entity(name = "employee")
public class Employee extends BaseEntity {
    @Column(name = "employee_name")
    private String name;
    @Column (name = "employee_email")
    private String email;
    @Column(name = "employee_position")
    private String position;
    @Column(name = "employee_password")
    private String password;
    @Column(name="employee_msnv")
    private String msnv;


}
