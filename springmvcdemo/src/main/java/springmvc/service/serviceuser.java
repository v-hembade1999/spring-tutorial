package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.Dao.contactdao;
import springmvc.model.Contact;
@Service
public class serviceuser 
{
	@Autowired
	private contactdao dao;
	public int createcontact(Contact contact)
	{
	   return this.dao.addcontact(contact);
	}
}
