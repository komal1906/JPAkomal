package com.cg.hr.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.core.exceptions.EmpException;
import com.cg.hr.core.service.EmployeeService;
import com.cg.hr.core.service.EmployeeServiceImpl;

@WebServlet("*.hr")
public class FrontControllerHR extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeService services;
	
	/*//in this place we make listener as createserviceResources
	@Override
	public void init() throws ServletException {
		
		super.init();
		
		try 
		{
			services= new EmployeeServiceImpl();
		} 
		catch (EmpException e) 
		{
			throw new ServletException("Missed service reference.",e);
		}
	}
*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx= super.getServletContext();
		EmployeeService services= (EmployeeService)ctx.getAttribute("services");
		
		
		
		String url= request.getRequestURI();
		String command=getCommand(url);
		RequestDispatcher dispatcher=null;
		String jspName=null;
		String preFix="/WEB-INF/pages/";
		String postFix=".jsp";
		try {
			switch(command)
			{
			case "*" :
			case "HomePage" :
			{
				jspName="Welcome";
				break;
			}
			case "getLoginPage" :
				{
					jspName="Login";
					break;
				}
			case "authenticate" :
			{
				String userName=request.getParameter("userName");
				String password=request.getParameter("password");
				if(userName.equals("aa") && password.equals("aa"))
				{
					HttpSession session=request.getSession(true);//getSession() without parameter is same as getSession(true)
					System.out.println(session.getId());
					session.setAttribute("fullName", "aa aaa aaaa");
					jspName="MainMenu";
				}
				else
				{
					request.setAttribute("message", "Wrong input");
					jspName="Login";
				}
				break;
			}
			case "printList" :
			{
				ArrayList<Employee> empList= services.fetchAllEmp();
				System.out.println(empList);
				request.setAttribute("empList", empList);
				jspName="EmpList";
				break;
			}
			case "viewDetails" :
			{
				String strEmpId=request.getParameter("id");
				int empId= Integer.parseInt(strEmpId);
				Employee emp= services.getEmpbyEid(empId);
				System.out.println(emp);
				request.setAttribute("emp", emp);
				jspName="EmpDetails";
				break;
			}
			case "Logout" :
			{
				HttpSession session=request.getSession(false);
				session.invalidate();
				jspName="Thanks";
				break;
			}
			}
		} catch (EmpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dispatcher=request.getRequestDispatcher(preFix+jspName+postFix);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	private String getCommand(String url)
	{
		int idxSlash=url.lastIndexOf("/");
		int idxDot=url.lastIndexOf(".");
		if(idxDot<0) {
			return "HomePage";
			
		}
		else
		{
		return url.substring(idxSlash+1, idxDot);
		}
	}

}
