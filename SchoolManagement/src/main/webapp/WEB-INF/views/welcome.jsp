<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="com.Model.SchoolModel"%>       
       

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form method="GET" id="school" name="school"
			action="/SchoolManagement/Welcome" modelAttribute="schoolAttribute">
<table>
<tr>
<td>
	<label>User Name:</label>
</td>
<td>
<select id="schoolId" name="schoolId" onchange="" >
	<c:forEach var="schoolId" items="${listSchools}">
          <option value="${schoolId.school_Id}" title="${schoolId.school_Name}"><c:out value="${schoolId.school_Name}"/></option>
     </c:forEach>
</select>
<td>
<c:set var="loginModel.schoolId" scope="session"  value="${param.schoolId}" />
</tr>
<tr>
<td>
	<label>Password:</label>
</td>
<td>
<select id="schoolId" name="schoolId" onchange="" >
	<c:forEach var="schoolId" items="${listSchools}">
          <option value="${schoolId.school_Id}" title="${schoolId.school_Name}"><c:out value="${schoolId.school_Name}"/></option>
     </c:forEach>
</select>
<td>
<c:set var="loginModel.schoolId" scope="session"  value="${param.schoolId}" />
</tr>
<tr>
<td><input type="submit" id="loginAdmin" name = "loginAdmin" />
</td>
<td><input type="button" id="loginTeacher" name = "loginTeacher"/></td>
</tr>
</table>
</form>
</body>
</html>