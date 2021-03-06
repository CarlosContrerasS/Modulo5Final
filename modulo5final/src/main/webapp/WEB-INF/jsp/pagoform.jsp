    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    </head>
	<body style="background-image: url(<c:url value="/resources/img/fondo.svg" />); background-position: center center; margin: 0%;">
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
                
                 <li><a href="#">Check List</a>
                <ul>
                    <li><a href="nuevochequeo">Ingreso Check List</a></li>
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
 <div class="html-content">
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
                <a><img src="<c:url value="/resources/img/invoices.svg"/>" title="Ingreso Accidentes" style="width: 10%;"></img></a>
                    <h1>Ingreso Pagos Clientes</h1>
                    
				<br><br>              
       			<h3><c:if test="${ccmensaje != null}">
				<h3><c:out value="${ccmensaje}"></c:out></h3>
				</c:if></h3>
				</div>

<h1 id ="titulo">Ingrese el rut del cliente por favor</h1><br>
<form method="get" action="findrut" style="margin-bottom: 3%;">
              Busqueda Rut del Cliente: <input type="search" name="rut" placeholder="Escriba el rut sin puntos ni gui�n.">
              
          
              <input type="submit" value="Buscar"><br><br>
              
<h1 id ="titulo">Verifique los datos por favor</h1><br>
    <label for="Rut">Rut Cliente :</label>
    <input type="text" class="campo_formulario" name="rut" value="${cliente.getRut()}"/><br/>
    <label for="nombre">Nombre Cliente :</label>
    <input type="text" class="campo_formulario" name="nombre" value="${cliente.getNombre()}"/><br/>

<h1 id ="titulo">Complete los datos del formulario por favor</h1><br>
</form>

        <div class="formulario_Agregar_pago">
            <form method="post" action="guardarpago">
                
                
                <label for="MontoRegular">Monto Regular </label>
                <input type="text" class="campo__Agregar_pago" name="MontoRegular"/><br>
                <label for="Monto Adicional">Monto Adicional </label>
                <input type="text" class="campo__Agregar_pago" name="MontoAdicional"/><br>
                <label for="fechavencimiento">Fecha Vencimiento </label>
                <input type="text" class="campo__Agregar_pago" name="fechavencimiento"/><br>
                
                <input type="hidden" name="rut" value="${cliente.getRut()}" />
                <br>
                <input type="submit" value="Ingresar Pago" style="margin: 5%;"/>
            </form>
        </div>
           

 
    <footer>
        <p>Dise�o - Talentosos Desarrolladores Jr - 2020</p>
    </footer>  
    </div> 
</body>