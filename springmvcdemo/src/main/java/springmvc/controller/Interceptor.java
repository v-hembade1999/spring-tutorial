package springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class Interceptor implements HandlerInterceptor
{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws java.lang.Exception 
	{
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		if(name.startsWith("d"))
		{
			response.setContentType("text/html");
			response.getWriter().println("Invalid name...");
			return false;
		}
		return true;

	}
	
}
