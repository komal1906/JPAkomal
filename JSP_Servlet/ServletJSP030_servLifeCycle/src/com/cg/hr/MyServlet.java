package com.cg.hr;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*Life Cycle Methods:
 * init(ServletConfig): Its for initialization.--life cycle method
 * 			Initialization , resource allocation are done here.
 * 			init(): Its for initialization and overriding.-- not the life cycle method
 * service(): it called on every request.
 * 			Controlling and transformation
 * destory(): it called while un-deploying the servlet.
 * 			resource deallocation
 * 
 * 
 * Eager : created at the time of starting the server. 
 * 			Consumes memory resources right from beginning .
 * 			Normally used for the servlets which are always used by all users.
 * 			Load on startup is +ve.
 * 			Home, login ,mainMenu -eg
 * Lazy : created only when first request comes in.
 * 			Normally used for the servlets which may be instantiated optionally.
 * 			ListAllEmps, AddNewEmps -eg
 * 
 * 
 * 
 * Servlet API:
 * 
 *  			
*/
@WebServlet(urlPatterns="/MyServlet", loadOnStartup=1)
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//
	public void init() throws ServletException {
		
		System.out.println("In init (ServletConfig)");
	}

	public void destroy() {
		System.out.println("In destroy ()");
	}
 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In doGet ()");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
