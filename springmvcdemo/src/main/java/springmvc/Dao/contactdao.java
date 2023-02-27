package springmvc.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.Contact;
@Repository
public class contactdao 
{
	@Autowired
	private HibernateTemplate hibernatetemplate;
	@Transactional
	public int addcontact(Contact contact)
	{
		int id = (Integer) this.hibernatetemplate.save(contact);
		return id;
	}
}
