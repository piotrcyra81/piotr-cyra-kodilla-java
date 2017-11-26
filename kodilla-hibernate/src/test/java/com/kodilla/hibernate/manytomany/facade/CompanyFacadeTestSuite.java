package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.CompanyFacade;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTestSuite {
    @Autowired
    private CompanyFacade companyFacade;

    @Test
    public void retrieveCompaniesByPartOfNameTest() throws Exception {
        //Given
        final String partOfCompanyName = "M";

        //When
        final Set<Company> companyResultSet = companyFacade.retrieveCompaniesByPartOfName(partOfCompanyName);

        //Then
        assertEquals(3, companyResultSet.size());
    }

    @Test
    public void retrieveEmployeesByPartOfNameTest() throws Exception {
        //Given
        final String partOfEmployeeName = "o";

        //When
        final Set<Employee> employeeResultSet = companyFacade.retrieveEmployeesByPartOfName(partOfEmployeeName);

        //Then
        assertEquals(3, employeeResultSet.size());
    }
}