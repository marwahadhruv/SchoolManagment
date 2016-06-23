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
<link href="<c:url value="/resources/style/main.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/login.js" />"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<!-- <style>

body {
background: #C70039;
}

.a {
position:absolute;
top:10%; 
left:80%;
color: Black;
}

@font-face {
font-family: 'Bebas Neue';
font-style: normal;
font-weight: normal;
src: local('Bebas Neue'), url('BebasNeue.woff') format('woff');
}

.maintext{
font-family: 'Bebas Neue'
}


</style> -->
</head>
<body>
<label class="a">MY SCHOOL ROSTER</label> 
<img src="<c:url value="/resources/images/Education.jpg" />" alt="EDUCATION View" style="width:100%;height:60%;">
<form method="GET" id="school" name="school"
			action="/SchoolManagement/Welcome" modelAttribute="schoolAttribute" class ="a" >
<table>
<tr>
<td>
	<label >School:</label>
</td>
<td>
<select id="schoolId" name="schoolId" onchange="" style="height:80% ;width: 300%" >
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