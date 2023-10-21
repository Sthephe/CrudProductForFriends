<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- Libreria JSTL Core -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>listar</title>
</head>
<body>
	<h3>¡Productos - Listar!</h3>
	
	<a href="/idat/welcome">Home</a> | 
	<a href="/idat/producto/registrar">Registrar</a> <br><br>
	
	<table>
		<!-- encabezado -->
		<tr>
			<td><b>ID</b></td>
			<td><b>Nombre</b></td>
			<td><b>Marca</b></td>
			<td><b>Precio</b></td>
			<td><b>F.Vencimiento</b></td>
			<td><b>Acción</b></td>
		</tr>
		
		<!-- filas -->
		<c:forEach var="producto" items="${bProductos}">
			<tr>
				<td>${producto.productoId}</td>
				<td>${producto.nombre}</td>
				<td>${producto.marca}</td>
				<td>${producto.precio}</td>
				<td>${producto.fvencimiento}</td>
				<td>
					<a href="/idat/producto/editar/${producto.productoId}">Editar</a> | 
					<a href="/idat/producto/borrar/${producto.productoId}">Borrar</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>