<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.ArrayList" %>
 <%@ page session="true" %>
 <%! private int x=10; %>
 <%! public int getValue() 
 	{
	 return 10;
 	}
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
	for (int i=0; i<5;i++)
	{
	%>
	Capgemini solutions<br>
	<%
	}
	%>
	<%=x %>
	page.x;

</body>
</html>
<%-- 
	Directives : <%@ %>
		page :session, import
		taglib
		include:
	Declarations : <%! %> they are content of class. 
		Instance fields , methods.
	Scriptlet :<% %> its a java code to be added inside service().
	Expressions : a single value to print
	Template : its HTML part.
	JSP elements : <jsp:xxx> forward , include
 --%>
 
 
 <%--
 	Implicit objects
	 	1.ServletContext: application
	 	2.ServletConfig: config
	 	3.HttpServletRequest: request
	 	4.HttpServletResponse: response
	 	5.HttpSession: session
	 	6.JSPWriter: out(handle to response)
	 	7.Page: page like 'this'
	 	8.PageContext: pageContext(Bundle of JSP resources)
	 	9.Eception: exception( refers to Exceptions 
	 					Availabe on only those JSP For whom
	 					<%@ page isError=true %>
	 
 --%>
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 