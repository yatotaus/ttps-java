<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Administrar usuarios cartelera</title>
<jsp:include page="common/head.jsp" flush="true" >
		<jsp:param name="titulo" value="Login"/>
	</jsp:include>
</head>
<body>
		<jsp:include page="common/navbar.jsp" flush="true" ></jsp:include>
	
		<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#agregarCartelera"> Agregar usuario</button>
		
	<table class="table table-hover">
		<tr>
			<th>Nombre completo</th>
			<th>Mail</th>
			<th>Número Legajo</th>
			<th>Rol</th>
			<th>Acciones</th>
			
		</tr>
		<tr>
			<td>Jorge Rosso</td>
			<td>jorge@lidi.com</td>
			<td>10493/3</td>
			<td>Profesor</td>
			<td><a>Modificar</a><a>Borrar</a></td>			
		</tr>
		<tr>
			<td>Laura Fava</td>
			<td>laura@lidi.com</td>
			<td>13123/3</td>
			<td>Profesor</td>
			<td><a>Modificar</a><a>Borrar</a></td>			
		</tr>
		<tr>
			<td>Marcos Matias Bosnic</td>
			<td>marcos@lidi.com</td>
			<td>13047/7</td>
			<td>Estudiante</td>
			<td><a>Modificar</a><a>Borrar</a></td>			
		</tr>
		<tr>
			<td>Johana Tauso</td>
			<td>yato@live.com</td>
			<td>13005/7</td>
			<td>Estudiante</td>
			<td><a>Modificar</a><a>Borrar</a></td>			
		</tr>
	

</body>
</html>