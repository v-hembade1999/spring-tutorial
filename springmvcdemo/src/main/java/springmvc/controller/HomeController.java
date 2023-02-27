package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController 
{
	    @RequestMapping("/home")
		public String demo()
		{
			return "index";			
		}
	    @RequestMapping("/hi")
	    @ResponseBody
	    public String hi()
	    {
	    	return "hi hello";
	    }
	    @RequestMapping(path="/welcome",method=RequestMethod.POST)
	    public String welcome(@RequestParam("name") String name , Model m)
	    {
	    	m.addAttribute("name",name);
	    	return "welcome";
	    }
		
		@RequestMapping("/info/{id}")
		public String info(@PathVariable("id") int id)
		{
			System.out.println(id);
		    return "info";
		}
		
		//@ExceptionHandler(value=NullPointerException.class)
		//public String exceptionHandlenull()
		//{
			//return "nullpage";
		//}
}

