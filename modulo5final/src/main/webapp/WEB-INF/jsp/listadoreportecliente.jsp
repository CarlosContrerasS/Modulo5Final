<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
	<html lang="es">
    	 <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" href= "<c:url value= "/resources/css/stylesheet.css"/>">
	    <link rel="stylesheet" href= "<c:url value= "/resources/css/menu.css"/>">
	    <link rel="stylesheet" href= "<c:url value= "/resources/css/fontello.css"/>">
	    <link rel="stylesheet" href="<c:url value="https://cdn.datatables.net/v/dt/dt-1.10.21/b-1.6.3/b-colvis-1.6.3/b-html5-1.6.3/b-print-1.6.3/cr-1.5.2/r-2.2.5/sc-2.0.2/sl-1.3.1/datatables.css"/>">
	    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
		<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.css">
		<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.js"></script>
		<script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script> 
		
		<title>Segurimax - Seguridad Laboral</title>
			<script>
			$(".submenu").click(function(){
	  $(this).children("ul").slideToggle();
	})
	
	$("ul").click(function(ev){
	  ev.stopPropagation();
	})
	
		
		</script>
	<script>
		function MiAlerta(){
	${atraso}
}
</script>
    </head>
	<body style="background-image: url(<c:url value="/resources/img/fondo.svg" />); background-position: center center; margin: 0%;" onload="MiAlerta()">
        <header>
        <input type="checkbox" id="btn-menu" />
<label for="btn-menu"><i class="fa fa-bars"></i></label>
 <nav class="menu" style="z-index: 4;">
        <ul>
            <li><a href="./index.jsp">Inicio</a></li>
            <li class="submenu"><a href="#">Clientes <i class="fa fa-caret-down"></i></a>
              <ul>
                <li><a href="nuevocliente">Crear Cliente</a></li>
                <li><a href="editcliente">Editar Cliente</a></li>
                <li><a href="deletecliente">Eliminar Cliente</a></li>
                <li><a href="listaclientes">Listado de Clientes</a></li>
                 <li><a href="nuevousuario"> nuevo usuario</a> </li>
              </ul>
            </li>
            <li class="submenu"><a href="#">Profesionales<i class="fa fa-caret-down"></i></a>
              <ul>
                  <li><a href="nuevoempleado">Ingresar Profesional</a></li>
                  <li><a href="editempleado">Editar Profesional</a></li>
                  <li><a href="deleteempleado">Eliminar Profesional</a></li>
                  <li><a href="listaempleadosC">Listado de Profesionales</a></li>
              </ul>
              
              
            </li>
            <li><a href="#">Accidentes</a>
                <ul>
                    <li><a href="nuevoaccidente">Ingreso Accidente</a></li>
                    <li><a href="listaaccidenteC">Listado Accidentes</a></li>
                </ul></li>
                 <li><a href="#">Visitas</a>
                <ul>
                    <li><a href="nuevavisitas">Agregar Visita</a></li>
                    <li><a href="listavisitas">Listar Visitas</a></li>
                </ul></li>
            
            <li><a href="#">Pagos</a>
                <ul>
                    <li><a href="nuevopago">Ingreso Pago</a></li>
                    <li><a href="listapagos">Mostrar Pagos</a></li>
                </ul></li>
                
                <li><a href="#">Asesorias</a>
                <ul>
                    <li><a href="agregarasesoria">Ingreso Asesoria</a></li>
                    <li><a href="agregarasesoriaespecial">Ingreso Asesoria Especial</a></li>
                    <li><a href="listaasesoriasC">Listado de Asesorias</a></li>
                </ul></li>
                
                 <li><a href="#">Capacitaciones</a>
                <ul>
                    <li><a href="nuevacapacitaciones">Ingreso Capacitaciones</a></li>
                    <li><a href="listacapacitaciones">Listado de Capacitaciones</a></li>
                </ul></li>
                
                 <li><a href="#">Chek List</a>
                <ul>
                    <li><a href="nuevochequeo">Ingreso Chek List</a></li>
                    <li><a href="listachequeosC">Listado de Check List</a></li>
                </ul></li>
                
                 <li><a href="#"> Mejoras</a>
                <ul>
                    <li><a href="agregarmejoras ">Ingreso Mejoras</a></li>
                    <li><a href="listamejorasC">Listado de Mejoras</a></li>
                </ul></li>
                
                 <li><a href="#">Informes</a>
                <ul>
                    <li><a href="listareporte">Reporte Global</a></li>
                    <li><a href="listareportecliente">Reporte Global de un cliente</a></li>
                    <li><a href="listaactividades">Visualizar Actividades</a></li>
                    <li><a href="revisarcliente">Revisar Cliente</a></li>
                </ul></li>
                    
            </ul>
        </nav>
</header>
		<div id="header_img">
			
			<img src="<c:url value="/resources/img/img_header_admin.png"/>" style="width: 100%;">
		</div>
		
		    <div id="pdf-login" style="text-align: end; background-color: dimgrey; padding:2%; margin:-1% 0% 5% 0%;">
    <a>  Bienvenido  </a><c:if test="${nombre != null}">
	<h2 style="margin:0% 3% 0% 0%"><c:out value="${nombre}"></c:out></h2>
</c:if>
<a style="margin:0% 1%">Cerrar Sesion</a> <input type=image src="<c:url value="/resources/img/exit.svg"/>" onclick="logout" style="margin:0% 10% 0% 0%; width: 2%;">
</div>
	<div id="titulo">
	         <a><img src="<c:url value="/resources/img/dashboard.svg"/>" title="Ingreso Accidentes" style="width: 10%;"></img></a>
			<h1>Reporte Cliente</h1>
<c:if test="${ccmensaje != null}">
	<h3><c:out value="${ccmensaje}"></c:out></h3>
</c:if>
<h3 style="text-align: center; margin: 0% 0% 3% 0%">Ingresa los datos de la busqueda por favor.</h3>
<h3 id ="titulo">Ingrese el Rut de Un Cliente</h3>

<form method="get" action="verreportecliente" style="margin-bottom: 3%;">
              Busqueda por Rut: <input type="search" name="rut" placeholder="Rut sin puntos ni guión.">
              
          
              <input type="submit" name = "Buscar" value="Buscar">
</form>
</div>
<table id="example" class="row-border" style="width:50%; margin:2% 25%; text-align: center">
	<tr>
		<th>Rut</th>
		<th>Nombre</th>
		<th>Rubro</th>
	</tr>
	<tr>
		<td>${reportecliente.getRut()}</td>
		<td>${reportecliente.getNombre()}</td>
		<td>${reportecliente.getRubro()}</td>

	</tr>
	</table>
	<table  class="row-border" style="width:50%; margin:2% 25%; text-align: center">
	<tr>
	
		<th>Días Perdidos </th>
		<th>Trabajadores Accidentados</th>
		<th>Total Accidentes</th>
		<th>Accidentabilidad</th>
	</tr>
	
	<tr>
		<td>${reportecliente.getDiasperdidos()}</td>
		<td>${reportecliente.getNumtrab()}</td>
		<td>${reportecliente.getCantidadDeAccidentes()}</td>
		<td>${reportecliente.getAccidentabilidad()}</td>
	</tr>
	<tr>
		<tr>
		<th>Total Visitas </th>
		<th>Total Mejoras</th>
		<th>Total Asesorias</th>

	</tr>
	<tr>
		<td>${reportecliente.getCantidadDeVisitas()}</td>
		<td>${reportecliente.getCantidadDeMejoras()}</td>
		<td>${reportecliente.getCantidadDeAsesorias()}</td>
	</tr>
	</table>
	<table  class="row-border" style="width:50%; margin:2% 25%; text-align: center">
	<tr>

		<th>Total Capacitaciones</th>
		<th>Asistentes Capacitaciones</th>
	</tr>
	
	<tr>
		<td>${reportecliente.getCantidadDeCapacitaciones()}</td>
		<td>${reportecliente.getAsistentesaCapacitaciones()}</td>
	</tr>
	</table>
	<table class="row-border" style="width:50%; margin:2% 25%; text-align: center">
	<tr>
		<th>Total Monto Regular</th>
		<th>Total Monto Adicional</th>
	</tr>
	
	<tr>
		<td>${reportecliente.getTotalRegular()}</td>
		<td>${reportecliente.getTotalAdicional()}</td>
	</tr>
	</table>
	<table class="row-border" style="width:50%; margin:2% 25%; text-align: center">
	<tr>
		<th> Pago al día</th>
	</tr>
	
	<tr>
		<td>${reportecliente.getCheq2()}</td>
	</tr>
</table>


<footer>
	<p>Diseño - Talentosos Desarrolladores Jr - 2020</p>
</footer> 
<script>
	$(document).ready(function() {
		$('#example').DataTable();
	} );
	
	$('#example').DataTable( {
		language: {
			processing:     "Procesando...",
			search:         "Buscar:",
			lengthMenu:    "Mostrar _MENU_ registros",
			info:           "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
			infoEmpty:      "Mostrando registros del 0 al 0 de un total de 0 registros",
			infoFiltered:   "(filtrado de un total de _MAX_ registros)",
			infoPostFix:    "",
			loadingRecords: "Cargando...",
			zeroRecords:    "No se encontraron resultados",
			emptyTable:     "Ningun dato disponible en esta tabla",
			paginate: {
				first:      "Primero",
				previous:   "Anterior",
				next:       "Siguiente",
				last:       "ultimo"
			},
			aria: {
				sortAscending:  ": Activar para ordenar la columna de manera ascendente",
				sortDescending: ": Activar para ordenar la columna de manera descendente"
			}
		}
	} );

</script>
</body>
</html>