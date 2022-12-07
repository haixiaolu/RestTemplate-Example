package com.example.service;

import com.example.config.EmpURLConfig;
import com.example.domain.Employee;
import com.example.domain.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final RestTemplate restTemplate;

    @Autowired
    public EmployeeServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Map<Integer, List<Employee>> groupByAge() {
        EmployeeDTO employeeDTO = restTemplate.getForObject(EmpURLConfig.url, EmployeeDTO.class);
        return employeeDTO.getData()
                .stream()
                .collect(Collectors.groupingBy(e -> e.getAge()));

    }

    @Override
    public List<Employee> getEmpAgeLargerThan(int age) {
        EmployeeDTO employeeDTO = restTemplate.getForObject(EmpURLConfig.url, EmployeeDTO.class);
        return employeeDTO.getData()
                .stream()
                .filter(e -> e.getAge() > age)
                .collect(Collectors.toList());
    }
}
