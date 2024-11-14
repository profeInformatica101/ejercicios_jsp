<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Saludo</title>
</head>
<body>
<%
String nombre = (String) request.getAttribute("nombre");
System.out.println("Hola" + nombre);
%>
    <h1>Hola <%=nombre%></h1>
    
    <button onclick="window.history.back()">Atrás</button>
</body>
</html>