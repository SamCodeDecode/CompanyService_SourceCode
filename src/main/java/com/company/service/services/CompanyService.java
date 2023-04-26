package com.company.service.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.company.service.dao.CompanyRepo;
import com.company.service.entity.Company;


@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepo crepo;
	
	//@Cacheable(cacheNames="company" ,key="#id" )
	public List<Company> getCompServ() {
		 return crepo.findAll();	
	}
	
	
	public Company SaveCompany(Company cmp) {
		return crepo.save(cmp);
	}
	
	@Cacheable(cacheNames="company" ,key="#id" )
	public Company getCmp(int id) {	
		  Optional<Company> c= crepo.findById(id);
		  System.out.println("Get CMP has called ");
		  
		 return  c.get();	
	}
	
	@CachePut(cacheNames="company", key="#id")
	public Company update(int id, Company cm) {
		Optional<Company> c= crepo.findById(id);
		Company cc=c.get();
		cc.setCeo(cm.getCeo());
		crepo.save(cc);
		return cc;
		
	}
	
	@CacheEvict(cacheNames="company",key="#id")
	public void delCmp(int id) {	
		  crepo.deleteById(id);	
	}
	
	
	
	

}
