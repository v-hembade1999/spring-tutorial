<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<link href="<c:url value="/resources/css/style.css"/>">
<script src="<c:url value="/resources/js/script.js"/>"></script>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hello</h1>
<form action="welcome" method="post">
   Name:<input type="text" name="name"/>
   <input type="submit"/>
</form>
</body>
</html>