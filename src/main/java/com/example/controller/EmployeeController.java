package com.example.controller;

import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<?> groupEmpByAge(){
        return new ResponseEntity<>(employeeService.groupByAge(), HttpStatus.OK);
    }

    @GetMapping(params = "age")
    public ResponseEntity<?> getEmpAgeLargerThan(@RequestParam int age){
        return new ResponseEntity<>(employeeService.getEmpAgeLargerThan(age), HttpStatus.OK);
    }
}
