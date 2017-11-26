package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.repository.CompanyRepository;
import com.kodilla.hibernate.manytomany.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompanyFacade {
    @Autowired
    CompanyRepository companyRepository;
    @Autowired
    EmployeeRepository employeeRepository;

    List<Company> findCompany(String string){
        return companyRepository.retrieveCompany(string);
    }

    List<Employee> findEmployee(String string){
        return employeeRepository.retrieveEmployee(string);
    }
}