package com.company.service.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.company.service.entity.Company;
import com.company.service.services.CompanyService;

@RestController
@EnableCaching
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	private CompanyService serv;
	
	
	@GetMapping("/getall")
	//@Cacheable("mycache")
	//@CachePut(value = "myCache")
	@Cacheable
	public ResponseEntity<List<Company>> getCompany(){
		List<Company> cmp=this.serv.getCompServ();
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(cmp);
	}
	
	@PostMapping("/setComp")
	public ResponseEntity<Company>  addCompany(@RequestBody Company comp ) {
			
		return ResponseEntity.ok().body(this.serv.SaveCompany(comp));
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<Company> getCompany(@PathVariable int id ){
		Company cmp=this.serv.getCmp(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(cmp);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Company> UpdateCompany(@PathVariable int id , @RequestBody Company c ){
		Company cmp=this.serv.update(id, c);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(cmp);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Company> DeleteCompany(@PathVariable int id ){
		this.serv.delCmp(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
	

}
