<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Search results</title>
</head>
<body>


<fieldset id="apixu">
<legend>Apixu search for <c:out value="${param.searchQuery}"/></legend>
<c:forEach items="${requestScope.current}" var="current">
	<span>Movie title: <c:out value="${current.feelslikeC}"/></span><br/>
</c:forEach>
</fieldset>



</body>
</html>