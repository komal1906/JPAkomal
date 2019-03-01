package com.cg.hr.core.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;

import com.cg.hr.core.exceptions.EmpException;
import com.cg.hr.core.service.EmployeeService;
import com.cg.hr.core.service.EmployeeServiceImpl;


@WebListener
public class CreateServiceResources implements ServletContextListener {
	private EmployeeService services;
    public void contextDestroyed(ServletContextEvent arg0)  { 
        services=null;
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
    	try 
		{
			services= new EmployeeServiceImpl();
			ServletContext ctx=arg0.getServletContext();
			ctx.setAttribute("services", services);
		} 
		catch (EmpException e) 
		{
			e.printStackTrace();
		}
    }
	
}
