package com.springboot.pjct.Company.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.pjct.Company.pojos.Company;


public interface CompanyRepository extends CrudRepository<Company, String>{

}
