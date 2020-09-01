package com.modulo5final.servicio;



import java.util.List;

import com.modulo5final.modelo.Asesorias;
import com.modulo5final.modelo.Capacitaciones;
import com.modulo5final.modelo.Chequeo;
import com.modulo5final.modelo.Cliente;
import com.modulo5final.modelo.Empleado;
import com.modulo5final.modelo.Visitas;


public interface ActividadesServicio {

	List <Empleado> ListarEmpleados();
	List <Cliente> ListarClientes();
	List <Chequeo> ListarChequeos();
	List <Capacitaciones> ListarCapacitaciones();
	List <Visitas>  ListarVisitas();
	List <Asesorias> ListarAsesorias();
	
}
