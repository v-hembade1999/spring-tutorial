package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.Contact;
import springmvc.service.serviceuser;

@Controller
public class Contactcontroller 
{
	@Autowired
	private serviceuser user;
	@RequestMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	
	@RequestMapping(path="/form",method=RequestMethod.POST)
	public String form(@ModelAttribute Contact contact)
	{
		this.user.createcontact(contact);
		return "success";
	}
}
