<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Menu</title>
</head>
<body>
<h1>capg</h1>
welcome Mr./Mrs. <%=request.getAttribute("fullName") %><!--JSP Expression  -->
<br>
<a href="">List all employee</a>
<br>
<a href="">view details of an employee</a>


</body>
</html>