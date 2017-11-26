package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


@Entity
@NamedQueries({
        @NamedQuery(
                name = "Employee.retrieveEmployeesByLastName",
                query = "FROM Employee WHERE lastname = :LASTNAME"),
        @NamedQuery(
                name = "Employee.retrieveEmployeesByPartOfName",
                query = "FROM Employee WHERE (lower(firstname) like lower(:ARG)) OR (lower(lastname) like lower(:ARG))")
})
@Table(name = "EMPLOYEES")
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private Set<Company> companies = new HashSet<>();

    public Employee() {
    }

    public Employee(final String firstname, final String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void addCompany(final Company company) {
        companies.add(company);
        company.getEmployees().add(this);
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "JOIN_COMPANY_EMPLOYEE",
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID",
                    referencedColumnName = "EMPLOYEE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "COMPANY_ID",
                    referencedColumnName = "COMPANY_ID")})
    public Set<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(final Set<Company> companies) {
        this.companies = companies;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "EMPLOYEE_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }

    @NotNull
    @Column(name = "LASTNAME")
    public String getLastname() {
        return lastname;
    }

    private void setId(final int id) {
        this.id = id;
    }

    private void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    private void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Employee employee = (Employee) o;

        if (!firstname.equals(employee.firstname)) {
            return false;
        }
        return lastname.equals(employee.lastname);
    }

    @Override
    public int hashCode() {
        int result = firstname.hashCode();
        result = 31 * result + lastname.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" + "firstname='" + firstname + '\'' + ", lastname='" + lastname + '\'' + '}';
    }
}