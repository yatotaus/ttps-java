<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="<c:url value="/index.jsp"/>">Cartelera Virtual</a>
     <!--  <img src="<c:url value="/assets/img/unlp.png"/>" alt="Logo de la UNLP">	-->
    </div>
    <ul class="nav navbar-nav">
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Carteleras <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li class="dropdown-submenu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Primer Año</a>
                              <ul class="dropdown-menu">
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 1</a></li>
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 1.1</a></li>
                              </ul>
                          </li>
                          <li class="dropdown-submenu">
                              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Segundo Año</a>
                              <ul class="dropdown-menu">
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 2</a></li>
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 2.1</a></li>
                              </ul>
                          </li>
                          <li class="dropdown-submenu">
                              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Tercer Año</a>
                              <ul class="dropdown-menu">
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 3</a></li>
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 3.1</a></li>
                              </ul>
                          </li>
                          <li class="dropdown-submenu">
                              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Cuarto Año</a>
                              <ul class="dropdown-menu">
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 4</a></li>
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 4.1</a></li>
                              </ul>
                          </li>
                          <li class="dropdown-submenu">
                              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Quinto Año</a>
                              <ul class="dropdown-menu">
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 5</a></li>
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 5.1</a></li>
                              </ul>
                          </li>  
                          <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Otros</li>
                  <li><a href="#">Otra cartelera</a></li>                
        </ul>
    </li>
	<c:if test="${rol < 3}">
		<li>
	        <a href="<c:url value="/publicacion/publicaciones.jsp"/>"><b>Mis Publicaciones</b></a>
        </li>
    </c:if>
    <c:if test="${rol > 0 and rol < 2}">
		<ul class="nav navbar-nav">
      		<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Opciones <span class="caret"></span></a>
        		<ul class="dropdown-menu">
          			<li><a onclick="usuarios();" class="dropdown-toggle" data-toggle="dropdown">Administrar Usuarios</a></li>
          			<li><a onclick="carteleras();" class="dropdown-toggle" data-toggle="dropdown">Administrar Carteleras</a></li>
          			<li><a href="#" class="dropdown-toggle" data-toggle="dropdown">Administrar Templates</a></li>
          			<li><a onclick="ultimasPublicaciones();" class="dropdown-toggle" data-toggle="dropdown">Últimas publicaciones</a></li>
          		</ul>
          	</li>
          </ul>
    </c:if>
    </ul>
    <ul class="nav navbar-nav navbar-right">
    	<li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      	<c:choose>
					<c:when test="${ empty usuario}" >
						 <li>
			                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-log-in"></span> <b>Iniciar Sesión</b></a>
			                <ul id="login-dp" class="dropdown-menu">
			                  <li>
			                     <div class="row">
			                        <div class="col-md-12">
			                           <form class="form" role="form" method="post" action="<c:url value="/Login"/>" accept-charset="UTF-8" id="login-nav">
			                              <div class="form-group">
			                                 <label class="sr-only" for="dni">DNI</label>
			                                 <input type="number" class="form-control" id="dni" name="dni" placeholder="Ingrese su DNI" required>
			                              </div>
			                              <div class="form-group">
			                                 <label class="sr-only" for="password">Contraseña</label>
			                                 <input type="password" class="form-control" id="password" name="password" placeholder="Contraseña" required>
			                              </div>
			                              <div class="form-group">
			                                 <button type="submit" class="btn btn-primary btn-block" style="background:#009688">Ingresar</button>
			                              </div>
			                           </form>
			                        </div>
			                     </div>
			                  </li>	       
			                </ul>
			              </li>
					</c:when>
					<c:when test="${not empty usuario}" >
						<li>
	                		<a href="<c:url value="/Salir"/>"><b>Cerrar Sesion</b></a>
	              		</li>
					</c:when>
					</c:choose>
					
    </ul>
  </div>
</nav>

<!-- 


<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Abrir menú</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="<c:url value="/index.jsp"/>" title="Ir al inicio" class="navbar-brand">
                <img src="<c:url value="/assets/img/unlp.png"/>" alt="Logo de la UNLP">
                <div>
                    <h1>Cartelera Virtual</h1>
                    <small>Facultad de Informática UNLP</small>
                </div>
            </a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-left">
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><b>Carteleras</b> <span class="caret"></span></a>
                <ul class="dropdown-menu  multi-level">
                  <li class="dropdown-submenu">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown">Educativa</a>
                      <ul class="dropdown-menu">
                          <li class="dropdown-submenu">
                              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Primer Año</a>
                              <ul class="dropdown-menu">
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 1</a></li>
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 1.1</a></li>
                              </ul>
                          </li>
                          <li class="dropdown-submenu">
                              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Segundo Año</a>
                              <ul class="dropdown-menu">
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 2</a></li>
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 2.1</a></li>
                              </ul>
                          </li>
                          <li class="dropdown-submenu">
                              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Tercer Año</a>
                              <ul class="dropdown-menu">
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 3</a></li>
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 3.1</a></li>
                              </ul>
                          </li>
                          <li class="dropdown-submenu">
                              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Cuarto Año</a>
                              <ul class="dropdown-menu">
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 4</a></li>
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 4.1</a></li>
                              </ul>
                          </li>
                          <li class="dropdown-submenu">
                              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Quinto Año</a>
                              <ul class="dropdown-menu">
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 5</a></li>
                                  <li><a href="<c:url value="/cartelera/cartelera.jsp"/>">materia de 5.1</a></li>
                              </ul>
                          </li>
                      </ul>
                  </li>
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Otros</li>
                  <li><a href="#">hola jaja</a></li>
                </ul>
              </li>
              <c:if test="${rol < 3}">
	              <li>
	                <a href="<c:url value="/publicacion/publicaciones.jsp"/>"><b>Mis Publicaciones</b></a>
	              </li>
              </c:if>
            </ul>
            <ul class="nav navbar-nav navbar-right">
            	<c:choose>
					<c:when test="${ empty usuario}" >
						 <li class="dropdown">
			                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><b>Iniciar Sesión</b> <span class="caret"></span></a>
			                <ul id="login-dp" class="dropdown-menu">
			                  <li>
			                     <div class="row">
			                        <div class="col-md-12">
			                           <form class="form" role="form" method="post" action="<c:url value="/Login"/>" accept-charset="UTF-8" id="login-nav">
			                              <div class="form-group">
			                                 <label class="sr-only" for="dni">DNI</label>
			                                 <input type="number" class="form-control" id="dni" name="dni" placeholder="Ingrese su DNI" required>
			                              </div>
			                              <div class="form-group">
			                                 <label class="sr-only" for="password">Contraseña</label>
			                                 <input type="password" class="form-control" id="password" name="password" placeholder="Contraseña" required>
			                              </div>
			                              <div class="form-group">
			                                 <button type="submit" class="btn btn-primary btn-block">Ingresar</button>
			                              </div>
			                           </form>
			                        </div>
			                     </div>
			                  </li>	       
			                </ul>
			              </li>
					</c:when>
					<c:when test="${not empty usuario}" >
						<li>
	                		<a href="<c:url value="/Salir"/>"><b>Cerrar Sesion</b></a>
	              		</li>
					</c:when>
					</c:choose>
            </ul>
        </div>
    </div>
</nav>

-->