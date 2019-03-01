package com.cg.hr;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*the context paramteres: are accessible to all web components in an application.
 * 	Get them from ServletContext(one object per application)
 * 	Servlets,JSP, Filters, Listeners
 * 	Declare common values like : company Name,URLs of other applications.
 * 
 * The config parameters:
 * 	Get them from ServletConfig(one object per Servlet/JSP)
 * 	Accessible to only a parent webcomponent
 * 	not accessible to any other web component
 * 
 */
@WebServlet("/MyServlet02")
public class MyServlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx= getServletContext();
		String companyName=ctx.getInitParameter("companyName");
		System.out.println(companyName);
		
		ServletConfig config= super.getServletConfig();// comes from super class i.e. GenericServlet
		String pageTitle= config.getInitParameter("pageTitle");
		System.out.println("page title"+pageTitle);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
