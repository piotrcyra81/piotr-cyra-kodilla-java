package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Set;


@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {
    @Query
    Set<Company> retrieveCompaniesByPartOfName(@Param("ARG") String partOfName);

    @Query
    Set<Company> retrieveCompaniesByNameStartsWith(@Param("PARTOFNAME") String partOfName);
}