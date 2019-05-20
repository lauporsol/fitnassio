<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina Inicio</title>
<link rel="stylesheet" href="/../css/EstiloStart.css">
<style>

.logo{
  display: block;
  margin-left: auto;
  margin-right: auto;
  border-radius: 8px;
  width:500px;
  height: 120px;

}
.texto{
  background-color: rgba(255, 99, 71,0.8);
  text-align: center;

  border: 2px solid #B9B9BA;
  border-radius: 8px;
  margin-left: 352px;
  margin-right: 352px;
}

.texto:hover{
  background-color: rgba(255, 99, 71,0.9);
  transition: all 0.5s;
}

  .boton{
    display: flex;
    justify-content: center;
    align-items: center;
  }

  .btn{

    height: 100px;
  }

.boton1 {
  display: inline-block;
  border-radius: 4px;
  background-color: tomato;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 28px;
  padding: 20px;
  width: 200px;
  transition: all 0.5s;
  cursor: pointer;


}

.boton1 span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.boton1 span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.boton1:hover span {
  padding-right: 25px;
}

.boton1:hover span:after {
  opacity: 1;
  right: 0;
}
</style>
</head>
<body>

<img class="logo" src="/../images/FitnassioLogo.jpeg" alt="Logo de Fitnassio">
<br>
<br>
<br>
<br>
<br>

<div class="texto">
  <p> Fitnassio es una aplicacion que surge con el objetivo de facilitar la experiencia<br>
      del ejercicio fisico de los usuarios.<br>
      Nuestra aplicacion sugiere tanto rutas interesantes para correr por las ciudades<br>
      como diferentes y personalizadas rutinas y ejercicios para mejorar la forma fisica<br>
      Ademas ofrece la posibilidad de consultar el clima y el observar el progreso.</p>
</div>





<br>
<br>
<br>
<br>
<br>
<br>

<div class="boton">
  <form id="searchForm" action="GetStartedController" method="post">
		<button type="submit" name="boton1" value="button">GET STARTED</button>		
  </form>
</div>


</body>
</html>
