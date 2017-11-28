package com.kodilla.patterns2.facade.employees;

import com.kodilla.patterns2.facade.employees.dao.CompanyDao;
import com.kodilla.patterns2.facade.employees.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;

    public List<Employee> findEmployees(String fragmentOfEmplyeeLastName) {
        return employeeDao.searchEmployeeByLastname("%" + fragmentOfEmplyeeLastName + "%");
    }

    public List<Company> findCompany(String fragmentOfCompanyName) {
        return companyDao.searchCompanyByName("%" + fragmentOfCompanyName + "%");
    }
}