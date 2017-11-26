package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Set;


@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    Set<Employee> retrieveEmployeesByLastName(@Param("LASTNAME") String lastname);

    @Query
    Set<Employee> retrieveEmployeesByPartOfName(@Param("ARG") String partOfName);
}