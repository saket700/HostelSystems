<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
String user =(String)session.getAttribute("uname");
System.out.print(user);


if(	user == null)
{
	response.sendRedirect("index.jsp");
}
%>