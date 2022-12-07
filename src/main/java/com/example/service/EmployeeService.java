package com.example.service;

import com.example.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface EmployeeService {
    Map<Integer, List<Employee>> groupByAge();
    List<Employee> getEmpAgeLargerThan(int age);


}
