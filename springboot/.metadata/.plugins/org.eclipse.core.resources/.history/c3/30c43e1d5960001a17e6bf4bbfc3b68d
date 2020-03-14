package com.springboot.pjct.Company;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
@FeignClient(value="jcompany", url="http://localhost:8084/ipo/")
public interface JSONCompanyClient {
	@GetMapping("findByCompanyname/{companyname}")
	public List<Ipo> findByCompanyname(@PathVariable("companyname") String companyname);

}
