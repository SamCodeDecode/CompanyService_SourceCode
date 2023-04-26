package com.company.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.service.entity.Company;
import com.company.service.entity.Contact;
import com.company.service.services.CompanyService;
import com.company.service.services.ContactServices;

@RestController
@RequestMapping("/company/contact")
public class ContactController {
	
	@Autowired
	private ContactServices csrv;
	
	@GetMapping("/getall")
	public void getContact() {
		
		
	}
	
	@PostMapping("/setcontact")
	public void setContact(@RequestBody Contact con) {
		csrv.addContact(con);
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Contact> UpdateCompany(@PathVariable int id , @RequestBody Contact c ){
		Contact cnt=this.csrv.update(id, c);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(cnt);
	}

}
	
	
