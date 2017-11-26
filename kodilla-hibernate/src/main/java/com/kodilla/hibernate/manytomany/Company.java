package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


@NamedNativeQuery(
        name = "Company.retrieveCompaniesByNameStartsWith",
        query = "SELECT * FROM COMPANIES WHERE SUBSTRING(COMPANY_NAME FROM 1 FOR 3) = :PARTOFNAME",
        resultClass = Company.class
)
@NamedQuery(
        name = "Company.retrieveCompaniesByPartOfName",
        query = "FROM Company WHERE lower(name) LIKE lower(:ARG)"
)
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private Set<Employee> employees = new HashSet<>();

    public Company() {
    }

    public Company(final String name) {
        this.name = name;
    }

    public void addEmployee(final Employee employee) {
        employees.add(employee);
        employee.getCompanies().add(this);
    }

    @ManyToMany(
            cascade = CascadeType.ALL,
            mappedBy = "companies"
    )
    public Set<Employee> getEmployees() {
        return employees;
    }

    private void setEmployees(final Set<Employee> employees) {
        this.employees = employees;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setId(final int id) {
        this.id = id;
    }

    private void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Company company = (Company) o;

        return name.equals(company.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Company{" + "name='" + name + '\'' + '}';
    }
}