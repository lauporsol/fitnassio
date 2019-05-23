<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html> 
<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <title>Laboratorio de OAuth</title>
    </head>

    <body>
        <h1>Laboratorio de OAuth</h1>

        <h2>Servlets disponibles:</h2>
        <ul>
            <li><a href="/googleDriveFileList">Listado de ficheros de Google Drive</a></li>
            
        </ul>

        <h2> Tokens de OAuth </h2>
        <ul>
            <li><strong>Google Drive:</strong>
                <ul>
                    <li><c:out value='${sessionScope["GoogleDrive-token"]}' /> </li>
                </ul>
            </li>
           
        </ul>
    </body>
</html>
