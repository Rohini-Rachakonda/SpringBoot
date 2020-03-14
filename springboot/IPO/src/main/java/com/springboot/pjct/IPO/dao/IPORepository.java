package com.springboot.pjct.IPO.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.pjct.IPO.pojos.IPO;



public interface IPORepository extends CrudRepository<IPO,Integer>{

	List<IPO> findByCompanyname(String companyname);

}
