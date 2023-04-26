package com.company.service.services;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;
import com.company.service.dao.ContactRepo;
import com.company.service.entity.Contact;

public class ContactserviceTest {
	
	@Autowired
	public ContactServices csrv; 
	
	
	@Test
	public void addContactTest() {
		Contact c=new Contact();
		ContactRepo crepo=Mockito.mock(ContactRepo.class);
		Mockito.when(crepo.save(c)).thenReturn(c);
		Contact c1 =crepo.save(c);
		
		assertThat(c).isEqualTo(c1);
		
	}


}
