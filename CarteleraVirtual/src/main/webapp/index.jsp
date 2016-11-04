<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="common/head.jsp" flush="true" >
		<jsp:param name="titulo" value="Login"/>
	</jsp:include>
	<link rel="stylesheet" href="<c:url value="/assets/css/carousel.css"/>">
	<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
	<link rel="stylesheet" href="http://www.w3schools.com/lib/w3-theme-black.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
	
</head>
<body>
	<jsp:include page="common/navbar.jsp" flush="true" ></jsp:include>
	  
<div class="w3-card-2 w3-white">
  <img src="<c:url value="/assets/img/fotoinfo.JPG"/>" alt="Facultad de Informatica" style="width:100%;">
</div>
	 
<!-- News Row -->
<div class="w3-row-padding w3-center w3-padding-64" id="pricing">
    <h2>INFORMACION GENERAL</h2>
    <p>Mira las ultimas novedades de nuestra facultad aquí</p>
    
    <div class="w3-third w3-margin-bottom">
      <ul class="w3-ul w3-border w3-hover-shadow">
        <li class="w3-theme">
          <p class="w3-xlarge">Novedad 1</p>
        </li>
        <li class="w3-padding-16"><b>Novedad</b> novedad 1</li>
        <div class="w3-container">
			  <p>Blablabla</p>
			  <p>Blablabla</p>
			  <p>Blablabla</p>
		</div>
        <li class="w3-theme-l5 w3-padding-24">
          <button class="w3-btn w3-teal w3-padding-large"><i class="fa fa-check"></i> Ver más</button>
        </li>
      </ul>
    </div>

    <div class="w3-third w3-margin-bottom">
      <ul class="w3-ul w3-border w3-hover-shadow">
        <li class="w3-theme-l2">
          <p class="w3-xlarge">Novedad 2</p>
        </li>
        <li class="w3-padding-16"><b>Novedad</b> novedad 2</li>
        <div class="w3-container">
			  <p>Blablabla</p>
			  <p>Blablabla</p>
			  <p>Blablabla</p>
		</div>
        <li class="w3-theme-l5 w3-padding-24">
          <button class="w3-btn w3-teal w3-padding-large"><i class="fa fa-check"></i> Ver más</button>
        </li>
      </ul>
    </div>

    <div class="w3-third w3-margin-bottom">
      <ul class="w3-ul w3-border w3-hover-shadow">
        <li class="w3-theme">
          <p class="w3-xlarge">Novedad 3</p>
        </li>
        <li class="w3-padding-16"><b>Novedad</b> novedad 3</li>
       <div class="w3-container">
			  <p>Blablabla</p>
			  <p>Blablabla</p>
			  <p>Blablabla</p>
		</div>
        <li class="w3-theme-l5 w3-padding-24">
          <button class="w3-btn w3-teal w3-padding-large"><i class="fa fa-check"></i> Ver más</button>
        </li>
      </ul>
    </div>
</div>  

<!-- Events Row -->
<div class="w3-row-padding w3-padding-64 w3-theme-l1" id="work">

<div class="w3-quarter">
<h2>PROXIMOS EVENTOS</h2>
<p>Detalles a cerca de los últimos y más innovadores eventos que ocurrirán en las instalaciones. No te quedes con las ganas de formar parte de lo mejor</p>
</div>

<div class="w3-quarter">
<div class="w3-card-2 w3-white">
  <div class="w3-container">
  <h3>Evento 1</h3>
  <h4>Congreso de Software Libre</h4>
  <p>Blablabla</p>
  <p>Blablabla</p>
  <p>Blablabla</p>
  <p>Blablabla</p>
  </div>
  </div>
</div>

<div class="w3-quarter">
<div class="w3-card-2 w3-white">
  <div class="w3-container">
 
  <h3>Evento 2</h3>
  <h4>Inteligencia Artificial - Realidad Virtual</h4>
  <p>Blablabla</p>
  <p>Blablabla</p>
  <p>Blablabla</p>
  </div>
  </div>
</div>

<div class="w3-quarter">
<div class="w3-card-2 w3-white">
  <div class="w3-container">
  <h3>Evento 3</h3>
  <h4>Energias Verdes</h4>
  <p>Blablabla</p>
  <p>Blablabla</p>
  <p>Blablabla</p>
  <p>Blablabla</p>
  </div>
  </div>
</div>

</div>

<!-- Container -->
<div class="w3-container" style="position:relative">
  <a onclick="w3_open()" class="w3-btn-floating-large w3-teal" style="position:absolute;top:-28px;right:24px;z-index:0;">
  <i class="fa fa-plus"></i></a>
</div>

<!-- Work Row -->
<div class="w3-row-padding w3-center w3-padding-64" id="pricing">
    <h2>LABORALES</h2>
    <p>En ésta sección podrás encontrar tu próximo lugar de trabajo.</p><br>
    <div class="w3-third w3-margin-bottom">
      <ul class="w3-ul w3-border w3-hover-shadow">
        <li class="w3-theme">
          <p class="w3-xlarge">Laboral 1</p>
        </li>
        <li class="w3-padding-16"><b>Empresa</b> Storage</li>
        <li class="w3-padding-16"><b>empresa@java.ttps.com</b> Emails</li>
        <li class="w3-padding-16"><b>10</b> puestos disponibles</li>
        <li class="w3-padding-16"><b>ttps java</b> Support</li>
        <li class="w3-padding-16">
          <h2 class="w3-wide"><i class="fa fa-usd"></i> 10.000</h2>
          <span class="w3-opacity">por mes</span>
        </li>
        <li class="w3-theme-l5 w3-padding-24">
          <button class="w3-btn w3-teal w3-padding-large"><i class="fa fa-check"></i> Enviar cv</button>
        </li>
      </ul>
    </div>

    <div class="w3-third w3-margin-bottom">
      <ul class="w3-ul w3-border w3-hover-shadow">
        <li class="w3-theme-l2">
          <p class="w3-xlarge">Laboral 2</p>
        </li>
        <li class="w3-padding-16"><b>Empresa</b> Storage</li>
        <li class="w3-padding-16"><b>empresa@java.ttps.com</b> Emails</li>
        <li class="w3-padding-16"><b>2</b> puestos disponibles</li>
        <li class="w3-padding-16"><b>ttps java</b> Support</li>
        <li class="w3-padding-16">
          <h2 class="w3-wide"><i class="fa fa-usd"></i> 15.000</h2>
          <span class="w3-opacity">por quincena</span>
        </li>
        <li class="w3-theme-l5 w3-padding-24">
          <button class="w3-btn w3-teal w3-padding-large"><i class="fa fa-check"></i> Enviar cv</button>
        </li>
      </ul>
    </div>

    <div class="w3-third w3-margin-bottom">
      <ul class="w3-ul w3-border w3-hover-shadow">
        <li class="w3-theme">
          <p class="w3-xlarge">Laboral 3</p>
        </li>
         <li class="w3-padding-16"><b>Pasantía</b> Empresa </li>
        <li class="w3-padding-16"><b>empresa@java.ttps.com</b> Emails</li>
        <li class="w3-padding-16"><b>4</b> puestos disponibles</li>
        <li class="w3-padding-16"><b>ttps java</b> Support</li>
        <li class="w3-padding-16">
          <h2 class="w3-wide"><i class="fa fa-usd"></i> 5000</h2>
          <span class="w3-opacity">por mes</span>
        </li>
        <li class="w3-theme-l5 w3-padding-24">
          <button class="w3-btn w3-teal w3-padding-large"><i class="fa fa-check"></i> Enviar cv</button>
        </li>
      </ul>
    </div>
<<<<<<< HEAD
</div>
    <div class="col-sm-8 col-sm-offset-2 ">
        <p>Usuario Admin</p>
        <p>Dni : 1</p>
        <p>Pass: 1234</p>
        <p>Usuario Docente</p>
        <p>Dni : 2</p>
        <p>Pass: 1234</p>
        <p>Usuario Alumno</p>
        <p>Dni : 3</p>
        <p>Pass: 1234</p>
        <p>Usuario Otro</p>
        <p>Dni : 4</p>
        <p>Pass: 1234</p>
    </div>

=======
    <div class="col-sm-8 col-sm-offset-2 ">
        <p>Usuario Admin</p>
        <p>Dni : 1</p>
        <p>Pass: 1234</p>
        <p>Usuario Docente</p>
        <p>Dni : 2</p>
        <p>Pass: 1234</p>
        <p>Usuario Alumno</p>
        <p>Dni : 3</p>
        <p>Pass: 1234</p>
        <p>Usuario Otro</p>
        <p>Dni : 4</p>
        <p>Pass: 1234</p>
    </div>
</div>
>>>>>>> branch 'master' of https://github.com/Pablo03/taller.git
  	<jsp:include page="common/footer.jsp" flush="true" ></jsp:include>
</body>
</html>