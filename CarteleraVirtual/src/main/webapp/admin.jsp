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
	
		<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#agregarCartelera"> Agregar cartelera</button>
		
	<table class="table table-hover">
		<tr>
			<th>Título</th>
			<th>Sección</th>
			<th>Acciones</th>
		</tr>
		<tr>
			<td>1° Año</td>
			<td>Información Académica</td>
			<td><a>Modificar</a><a>Borrar</a></td>			
		</tr>
		<tr>
			<td>2° Año</td>
			<td>Información Académica</td>
			<td><a>Modificar</a><a>Borrar</a></td>
		</tr>
		<tr>
			<td>3° Año</td>
			<td>Información Académica</td>
			<td><a><button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#modificarCartelera"> Modificar cartelera</button></a><a>Borrar</a></td>
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
			<td>Eventos</td>
			<td>Información Institucional</td>
			<td><a>Modificar</a><a>Borrar</a></td>
		</tr>
		<tr>
			<td>Posgrado</td>
			<td>Información Académica</td>
			<td><a>Modificar</a><a>Borrar</a></td>
		</tr>
		<tr>
			<td>Ofertas Laborales</td>
			<td>Anuncios externos</td>
			<td><a>Modificar</a><a>Borrar</a></td>
		</tr>
		<tr>
			<td>Anuncios administrativos</td>
			<td>Información Institucional</td>
			<td><a>Modificar</a><a>Borrar</a></td>
		</tr>		
	
	</table>
	
	
	
<div class="modal fade" id="modificarCartelera" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">Modificar Cartelera</h4>
      </div>
      <div class="modal-body">
      <form action="#" method="POST" class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="ejemplo_email_1" class="col-sm-3 control-label">Nombre de la cartelera</label>
                            <div class="col-sm-9">
                                <input type="email" class="form-control" id="ejemplo_email_1" placeholder="Secretaría Académica" required="required">
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label for="usuario" class="col-sm-3 control-label">Usuarios:</label>
                            <div class="col-sm-9">
                                <select id="usuario" name="usuario" class="form-control" required>
                                    <option value="value3">Selecciona una opcion</option>
                                    <option value="value3">Ivana Harari</option>
                                    <option value="value1">Laura Fava</option> 
                                    <option value="value2">Jorge Rosso</option>
                                    <option value="value3">Pablo Thomas</option>
                                    <option value="value3">Rodolfo Bertone</option>
                                    <option value="value3">Otros...</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="cartelera"  class="col-sm-3 control-label">Ubicación de la cartelera:</label>
                            <div class="col-sm-9">
                                <select  id="cartelera" name="cartelera" class="form-control" required>
                            	    <option value="value3">General</option>
                              		<option value="value3">1 Año</option>
                              		<option value="value3">2 Año</option>
                          			<option value="value1">3 Año</option> 
                        			<option value="value2">4 Año/</option>
                        			<option value="value3">5 Año</option>
                        			<option value="value3">Administrativa</option>  			
                          		</select>
                            </div>
                        </div>
                    </form>
      
      
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">agregarCartelera</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div>



<div class="modal fade" id="agregarCartelera" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">Agregar Cartelera</h4>
      </div>
      <div class="modal-body">
   <form action="#" method="POST" class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="ejemplo_email_1" class="col-sm-3 control-label">Nombre de la cartelera</label>
                            <div class="col-sm-9">
                                <input type="email" class="form-control" id="ejemplo_email_1" placeholder="Secretaría Académica" required="required">
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label for="usuario" class="col-sm-3 control-label">Usuarios:</label>
                            <div class="col-sm-9">
                                <select id="usuario" name="usuario" class="form-control" required>
                                    <option value="value3">Selecciona una opcion</option>
                                    <option value="value3">Ivana Harari</option>
                                    <option value="value1">Laura Fava</option> 
                                    <option value="value2">Jorge Rosso</option>
                                    <option value="value3">Pablo Thomas</option>
                                    <option value="value3">Rodolfo Bertone</option>
                                    <option value="value3">Otros...</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="cartelera"  class="col-sm-3 control-label">Ubicación de la cartelera:</label>
                            <div class="col-sm-9">
                                <select  id="cartelera" name="cartelera" class="form-control" required>
                            	    <option value="value3">General</option>
                              		<option value="value3">1 Año</option>
                              		<option value="value3">2 Año</option>
                          			<option value="value1">3 Año</option> 
                        			<option value="value2">4 Año/</option>
                        			<option value="value3">5 Año</option>
                        			<option value="value3">Administrativa</option>  			
                          		</select>
                            </div>
                        </div>
                    	<button type="submit" class="pull-right btn btn-primary">Aceptar
                        </button>
                    </form>
      
      
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">AgregarCartelera</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div>

	
</body>
</html>