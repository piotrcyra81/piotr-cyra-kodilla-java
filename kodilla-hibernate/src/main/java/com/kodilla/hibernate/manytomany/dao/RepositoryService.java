package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service("repositoryService")
public class RepositoryService {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public Set<Company> retrieveCompaniesByPartOfName(final String partOfName) {
        return companyDao.retrieveCompaniesByPartOfName(String.format("%c%s%c", '%', partOfName, '%'));
    }

    public Set<Employee> retrieveEmployeesByPartOfName(final String partOfName) {
        return employeeDao.retrieveEmployeesByPartOfName(String.format("%c%s%c", '%', partOfName, '%'));
    }
}