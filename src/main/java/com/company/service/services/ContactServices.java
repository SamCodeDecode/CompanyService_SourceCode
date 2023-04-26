package com.company.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.service.dao.ContactRepo;
import com.company.service.entity.Contact;

@Service
public class ContactServices {

	@Autowired
	private ContactRepo crepo;

	public boolean addContact(Contact c) {
		crepo.save(c);
		return true;
	}

	public Contact update(int id, Contact c) {

		return c;
	}

}
