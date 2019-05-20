<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/EstiloStats.css">
</head>
<body>

<div class="tab">
  <button class="buttons" onclick="openCity(event, 'Weather')" id="defaultOpen">Weather</button>
  <button class="buttons" onclick="openCity(event, 'Maps')">Maps</button>
  <button class="buttons" onclick="openCity(event, 'Activities')">Activities</button>
</div>

<div id="Weather" class="tabcontent">
  <h3>Weather</h3>
  <p>Some stuff about weather.</p>
  <span>Sensación térmica: <c:out value="${current}"/></span><br/>
  <span>Viento: <c:out value="${wind}"/></span><br/>
  <span>Tiempo atmosférico: <c:out value="${tiempoAt}"/></span><br/> 
  <img src="${urlImagen}" width="100" height="100"><br>
  <c:set var="temp" value="${current}"/>
  <c:choose>
  	<c:when test="${temp>=12}">
  		<span>Lets get Fit! Today is a good day to practice sport!</span>
  	</c:when>
  	<c:otherwise>
  		<span>Today is not a good day, bad weather.  Stay home, rest and eat healthy !</span>
  	</c:otherwise>
  </c:choose>
  
</div>

<div id="Maps" class="tabcontent">
  <h3>Maps</h3>
  <p>Some stuff about maps.</p>
  <iframe width="600" height="450" frameborder="0" style="border:0" src="${url}" allowfullscreen></iframe>
  <c:forEach items="${requestScope.places}" var="place">
  	<span>Place name: <c:out value="${place.name}"/></span><br/>
  	<span>Place rating: <c:out value="${place.rating}"/></span><br/>
  	<img src="https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&photoreference=${place.photos.get(0).photoReference}&key=AIzaSyDZoKEdcapvOACB9iE95Qnxi8vukkqmjDM" width="100" height="100">

</c:forEach>
</div>

<div id="Activities" class="tabcontent">
  <h3>Activities</h3>
<iframe src="https://calendar.google.com/calendar/embed?src=o93alktt41dkc7dp1r1ktaisrc@group.calendar.google.com&ctz=Europe
/Madrid"style="border: 0" width="400" height="240" frameborder="0" scrolling="no"></iframe>

    <a href="https://www.google.es/" class="button" style="vertical-align:middle"><span>Fit! </span></a>


</div>

<script>
function openCity(evt, cityName) {
  var i, tabcontent, buttons;
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  buttons = document.getElementsByClassName("buttons");
  for (i = 0; i < buttons.length; i++) {
    buttons[i].className = buttons[i].className.replace(" active", "");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " active";
}

// Get the element with id="defaultOpen" and click on it
document.getElementById("defaultOpen").click();
</script>

</body>
</html>
