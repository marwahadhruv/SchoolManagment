<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="com.Model.SelectClassModel"%>       
       

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<form method="GET" id="selClass" name="selClass"
			action="/SchoolManagement/SelectClass/select" modelAttribute="teacherAttribute">
<table>
<tr>
<td>
	<label>User Name:</label>
</td>
<td>
<input type="text" id ="teacherUserName" name="teacherUserName"/>
<td>
<c:set var="welcomeModel.teacherUserName" scope="session"  value="${param.teacherUserName}" />
</tr>
<tr>
<td>
	<label>Password:</label>
</td>
<td>
<input type="text" id ="teacherPassword" name="teacherPassword"/>
<td>
<c:set var="welcomeModel.teacherPassword" scope="session"  value="${param.teacherPassword}" />
</tr>
<tr>
<td><input type="submit" id="loginTeacher" name = "loginTeacher" />
</td>
<td><input type="button" id="loginTeacher" name = "loginTeacher"/></td>
</tr>
</table>
</form>
</body>
</html>