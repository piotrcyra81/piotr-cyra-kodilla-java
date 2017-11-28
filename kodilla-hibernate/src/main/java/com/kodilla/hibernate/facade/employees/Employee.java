package com.kodilla.hibernate.facade.employees;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@NamedQuery(
        name = "Employee.searchEmployeeByLastname",
        query = "FROM Employee WHERE lastname LIKE :fragmentOfEmplyeeLastName"
)

@Entity
@Table(name = "EMPLOYEES")
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private List<Company> companies = new ArrayList<>();
    private String fragmentOfEmplyeeLastName;

    public Employee() {
    }

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
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

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
            name = "JOIN_COMPANY_EMPLOYEE",
            joinColumns = @JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID"),
            inverseJoinColumns = @JoinColumn(name = "COMPANY_ID", referencedColumnName = "COMPANY_ID")
    )
    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFragmentOfEmplyeeLastName() {
        return fragmentOfEmplyeeLastName;
    }

    public void setFragmentOfEmplyeeLastName(String fragmentOfEmplyeeLastName) {
        this.fragmentOfEmplyeeLastName = fragmentOfEmplyeeLastName;
    }
}
