package com.kodilla.hibernate.manytomany;

import com.kodilla.hibernate.manytomany.dao.RepositoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Service("companyFacade")
public class CompanyFacade {
    @Autowired
    private RepositoryService repositoryService;

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);

    public Set<Company> retrieveCompaniesByPartOfName(final String partOfName) throws FinderException {
        LOGGER.info(String.format("Searching for companies with argument: %s", partOfName));
        final Set<Company> companies;
        companies = Optional.ofNullable(repositoryService.retrieveCompaniesByPartOfName(partOfName)).orElse(Collections.emptySet());
        LOGGER.info(companies.isEmpty()
                ? "None " + "company has fulfilled the condition."
                : String.format("%d compan%s has fulfilled the condition.", companies.size(), companies.size() == 1 ? "y" : "ies"));
        return companies;
    }

    public Set<Employee> retrieveEmployeesByPartOfName(final String partOfName) throws FinderException {
        LOGGER.info(String.format("Searching for employees with argument: %s", partOfName));
        final Set<Employee> employees;
        employees = Optional.ofNullable(repositoryService.retrieveEmployeesByPartOfName(partOfName)).orElse(Collections.emptySet());
        LOGGER.info(employees.isEmpty()
                ? "None employee has fulfilled the condition."
                : String.format("%d emplyee%s has fulfilled the condition.", employees.size(), employees.size() == 1 ? "" : "s"));
        return employees;
    }
}