package com.company.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.service.entity.Company;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Integer>{

}
