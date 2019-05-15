<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Solucion del GET STARTED</title>
</head>
<body>
<fieldset id="btn">
<legend>Ipstack search for <c:out value="${param.searchQuery}"/></legend>

	<span>Localización ciudad: <c:out value="${loc}"/></span><br/>

</fieldset>
</body>
</html>