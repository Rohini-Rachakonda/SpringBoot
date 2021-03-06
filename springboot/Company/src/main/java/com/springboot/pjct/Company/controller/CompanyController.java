package com.springboot.pjct.Company.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.pjct.Company.JSONCompanyClient;
import com.springboot.pjct.Company.dao.CompanyRepository;
import com.springboot.pjct.Company.pojos.Company;


@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
@RequestMapping("Company")
public class CompanyController {
	@Autowired
	JSONCompanyClient jcompany;
	@Autowired
	private CompanyRepository companyRepository;
	@RequestMapping("/getAllcompany")
	public Iterable<Company> getAllcompany() {
		return companyRepository.findAll();
	}

	@PostMapping("/saveCompany")
	public Company saveCompany(@RequestBody Company company) {
		System.out.println(company);
		companyRepository.save(company);
		return company;
	}

	@PutMapping("/updateCompany/{companyname}")
	public Company updateCompany(@RequestBody Company company,@PathVariable("companyname") String name)
     {
		company.setCompanyname(name);
	 System.out.println(name);
	 companyRepository.save(company);
	 return company;

	 }

	@DeleteMapping("/deleteCompany/{companyname}")

	public boolean deleteCompany(@PathVariable("companyname") String name) {
		

		companyRepository.deleteById(name);

		return true;

	}

	@GetMapping("/find/{companyname}")

	public Company find(@PathVariable("companyname") String companyname) {

		Optional<Company> company = companyRepository.findById(companyname);
		Company cmp=company.get();
		cmp.setIpoList(jcompany.findByCompanyname(companyname));

		return company.get();
	}



}
