<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href= "<c:url value= "/resources/css/stylesheet.css"/>">
    <link rel="stylesheet" href= "<c:url value= "/resources/css/menu.css"/>">
    <link rel="stylesheet" href= "<c:url value= "/resources/css/fontello.css"/>">
    <link rel="stylesheet" href="<c:url value="https://cdn.datatables.net/v/dt/dt-1.10.21/b-1.6.3/b-colvis-1.6.3/b-html5-1.6.3/b-print-1.6.3/cr-1.5.2/r-2.2.5/sc-2.0.2/sl-1.3.1/datatables.css"/>">
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.js"></script>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.21/b-1.6.3/b-colvis-1.6.3/b-html5-1.6.3/b-print-1.6.3/cr-1.5.2/r-2.2.5/sc-2.0.2/sl-1.3.1/datatables.js"></script>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Segurimax - Seguridad Laboral</title> 
    <script>
			$(".submenu").click(function(){
	  $(this).children("ul").slideToggle();
	})
	
	$("ul").click(function(ev){
	  ev.stopPropagation();
	})
		</script>
		
	<body  style="background-image: url(<c:url value="/resources/img/fondo.svg" />)); background-position: center center; margin: 0%;">
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
<div id="titulo">
<h1>Visualización de actividades por empleado</h1>


 <form method="get" action="veractividades" style="margin-bottom: 3%;">
              Busqueda Empleado por Rut: <input type="search" name="rutempleado" placeholder="Coloque el RUT sin puntos ni guion.">
              
          
              <input type="submit" value="Buscar">
 </form>

 <form>
 <label for="rutempleado">Rut:  </label>
    <input type="text" class="campo_formulario" name="RutEmpleado" value="${empleado.getRutEmpleado()}"/><br/>
 </form>
  </div>
 <div style="margin:3% 0%; text-align: center;">
<table id="example" class="row-border" style="width:70%; margin: 0% 25%">
    <thead>
        <tr>
            <th>Nombre</th>
		<th>Especialidad</th>
        </tr>
    </thead>
    <tbody>
		<tr>
        	<td>${empleado.getNombreEmpleado()}</td>
			<td>${empleado.getEspecialidad()}</td>
		</tr>
	   </tbody>
</table>
<br/>
</div>

<div style="margin:3% 0%; text-align: center;">
<h1 id="titulo">Clientes atendidos por el Profesional</h1>
<br><br>
<table id="example" class="row-border" style="width:70%; margin: 0% 25%">
	<thead>
	<tr>
		<th> Rut Cliente</th>
		<th>Nombre</th>

	</tr>
</thead>
	<c:forEach items="${lcliente}" var="cliente">
	<tbody>
	<tr>
		<td>${cliente.getRut()}</td>
		<td>${cliente.getNombre()}</td>

		<td>
	</tr>
	</tbody>
</c:forEach>
</table>
</div>


<div style="margin:3% 0%; text-align: center;">          
<h1 id="titulo">Visitas Realizadas y Agendadas por el Profesional</h1>
<br><br>

<table id="example" class="row-border" style="width:70%; margin: 0% 25%">
	<tr>
		<th>Fecha</th>
		<th>Resumen</th>
		<th>Observaciones</th>
	</tr>
	<c:forEach items="${lvisitas}" var="visitas">
	<tr>
		<td>${visitas.getFecha()}</td>
		<td>${visitas.getResumen()}</td>
		<td>${visitas.getObservaciones()}</td>
		
	</tr>
	</c:forEach>
</table>
</div>


<div style="margin:3% 0%; text-align: center;">  
<h1 id="titulo">Listado de capacitaciones atendidas por el Profesional</h1>
<br><br>
<table id="example" class="row-border" style="width:70%; margin: 0% 25%">
	<thead>
	<tr>
		<th>Fecha</th>
		<th>Hora</th>
		<th>Numero de Asistentes</th>
	</tr>
</thead>
	<c:forEach items="${lcapacitaciones}" var="capacitaciones">
	<tbody>
	<tr>
		<td>${capacitaciones.getFecha()}</td>
		<td>${capacitaciones.getHora()}</td>
		<td>${capacitaciones.getNumAsistentes()}</td>
	</tr>
	</tbody>
</c:forEach>
</table>
</div>
<div style="margin:3% 0%; text-align: center;">  
<h1 id="titulo">Listado de Asesorias Atendidas por el Profesional</h1>

<table id="example" class="row-border" style="width:70%; margin: 0% 25%">
	<thead>
	<tr>
		<th>Detalle</th>
		<th>Gestion</th>
		<th>Propuestas</th>
		<th>Fecha</th>
		<th>Pagada</th>

	</tr>
	</thead>
	<tbody>
	<c:forEach items="${lasesorias}" var="asesorias">
	<tr>
		<td>${asesorias.getDetalle()}</td>
		<td>${asesorias.getGestion()}</td>
		<td>${asesorias.getPropuestas()}</td>
		<td>${asesorias.getFecha()}</td>
		<td>${asesorias.getPagada()}</td>
	</tr>
	</c:forEach>
</tbody>
</table>
</div>

<div style="margin:3% 0%; text-align: center;">  
<h1 id="titulo">Mostrar Chek List Ingresados Por el Profesional</h1>
<br><br>
<table id="example" class="row-border" style="width:70%; margin: 0% 25%">
	<tr>
		<th>Detalle</th>
		<th>Estado</th>
		
	</tr>
	<c:forEach items="${lchequeos}" var="chequeo">
	<tr>
		<td>${chequeo.getDetalle()}</td>
		<td>${chequeo.getEstado()}</td>
		
	</tr>
	</c:forEach>
</table>
</div>
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