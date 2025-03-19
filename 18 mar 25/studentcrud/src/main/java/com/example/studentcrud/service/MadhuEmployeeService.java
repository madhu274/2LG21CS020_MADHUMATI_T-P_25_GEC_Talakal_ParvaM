package com.example.studentcrud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.studentcrud.model.Employee;
import com.example.studentcrud.repository.madhuEmployeeRepository;

@Service
public class madhuEmployeeService {

    @Autowired
    private madhuEmployeeRepository employeeRepository;

    public List<Employee> listAll() {
        return employeeRepository.findAll();
    }

    public void saveemployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee getemployee(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public void deleteemployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
