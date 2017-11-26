package com.kodilla.hibernate.manytomany.repository;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> {

    @Query(nativeQuery = true)
    List<Company> retrieveCompanyWhoseNameBegins(@Param("STRING") String string);

    @Query
    List<Company> retrieveCompany(@Param("ARG") String string);
}