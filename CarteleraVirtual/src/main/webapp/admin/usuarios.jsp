<div class="administrarUsuarios" style="display: none;">
		<button type="button" class="btn btn-primary btn-lg" onclick="agregarUsuario();"> Agregar usuario</button>
	
	<div id=table>
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
			<td>Johana Taus</td>
			<td>yato@live.com</td>
			<td>13005/7</td>
			<td>Estudiante</td>
			<td><a>Modificar</a><a>Borrar</a></td>			
		</tr>
		<tr>
			<td>Globant</td>
			<td>info@globant.com</td>
			<td>-------</td>
			<td>Publicador</td>
			<td><a>Modificar</a><a>Borrar</a></td>			
		</tr>
	</table>
	</div>
	<div class="elemento" style="display:none;">
	<div class="col-md-4">
		<form action="#">
		<div class="form-group">
                            <label for="ejemplo_email_1" class="col-sm-3 control-label">Nombre completo:</label>
                            <div class="col-sm-9">
                                <input type="email" class="form-control" id="ejemplo_email_1" placeholder="Juan Lopez" required="required">
                            </div>
                        </div>
<div class="form-group">
                            <label for="ejemplo_email_1" class="col-sm-3 control-label">Email:</label>
                            <div class="col-sm-9">
                                <input type="email" class="form-control" id="ejemplo_email_1" placeholder="Juan Lopez" required="required">
                            </div>
                        </div>                        
<div class="form-group">
                            <label for="ejemplo_email_1" class="col-sm-3 control-label">Numero Legajo:</label>
                            <div class="col-sm-9">
                                <input type="email" class="form-control" id="ejemplo_email_1" placeholder="14029/2" required="required">
                            </div>
                        </div>                        
                        <div class="form-group">
                            <label for="usuario" class="col-sm-3 control-label">Rol:</label>
                            <div class="col-sm-9">
                                <select id="usuario" name="usuario" class="form-control" required>
                                    <option value="value3">Selecciona una opcion</option>
                                    <option value="value3">Profesor</option>
                                    <option value="value1">Estudiante</option> 
                                    <option value="value2">Publicador</option>
                                </select>
                            </div>
                        </div>
		</form>
</div>
</div>
</div>
