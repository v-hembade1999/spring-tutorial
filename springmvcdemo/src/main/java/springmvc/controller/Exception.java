package springmvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class Exception 
{
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandlenull()
	{
		return "nullpage";
	}
}
