package com.company.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
