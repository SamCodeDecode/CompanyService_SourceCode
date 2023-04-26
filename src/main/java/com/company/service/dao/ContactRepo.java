package com.company.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.service.entity.Company;
import com.company.service.entity.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer>{

}
