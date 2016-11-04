<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Administración cartelera virtual</title>
<jsp:include page="common/head.jsp" flush="true" >
		<jsp:param name="titulo" value="Login"/>
	</jsp:include>
</head>
<body>
	<jsp:include page="common/navbar.jsp" flush="true" ></jsp:include>
	
	<h3>Administrar carteleras</h3>
	<table class="table table-hover">
		<tr>
			<th>Título</th>
			<th>Sección</th>
			<th>Acciones</th>
		</tr>
		<tr>
			<td>2° Año</td>
			<td>Información Académica</td>
			<td><a>Modificar</a><a>Borrar</a></td>
		</tr>
		<tr>
			<td>3° Año</td>
			<td>Información Académica</td>
			<td><a>Modificar</a><a>Borrar</a></td>
		</tr>
		<tr>
			<td>4° Año</td>
			<td>Información Académica</td>
			<td><a>Modificar</a><a>Borrar</a></td>
		</tr>
		<tr>
			<td>5° Año</td>
			<td>Información Académica</td>
			<td><a>Modificar</a><a>Borrar</a></td>
		</tr>
		<tr>
			<td>Posgrado</td>
			<td>Información Académica</td>
			<td><a>Modificar</a><a>Borrar</a></td>
		</tr>
			
	
	</table>
	
</body>
</html>