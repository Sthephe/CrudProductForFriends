<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- Librería Spring Form -->
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit</title>
</head>
<body>
	<h3>¡Producto - Editar!</h3>
	
	<!-- Formulario Spring -->
	<form:form method="post" modelAttribute="producto">
		Producto ID: <form:input type="text" path="productoId" readonly="true"/> <br>
		Nombre: <form:input type="text" path="nombre"/> <br>
		Marca: <form:input type="text" path="marca"/> <br>
		Precio: <form:input type="number" step="any" path="precio"/> <br>
		Fecha vencimiento: <form:input type="date" path="fvencimiento"/> <br><br>
		
		<button type="submit">Guardar</button>
		<button type="button" onclick="location.href='/idat/producto/listar'">Cancelar</button>
	</form:form>
	
</body>
</html>