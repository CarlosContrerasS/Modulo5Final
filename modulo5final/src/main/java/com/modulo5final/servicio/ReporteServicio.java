package com.modulo5final.servicio;

import java.util.List;
import com.modulo5final.modelo.Accidentes;
import com.modulo5final.modelo.Asesorias;
import com.modulo5final.modelo.Capacitaciones;
import com.modulo5final.modelo.Cliente;
import com.modulo5final.modelo.Empleado;
import com.modulo5final.modelo.Mejoras;
import com.modulo5final.modelo.Pagos;
import com.modulo5final.modelo.Visitas;

public interface ReporteServicio {
	
	long ContarClientes();
	List <Cliente> ListarClientes();
	List <Accidentes> ListarAccidentes();
	List <Visitas>  ListarVisitas();
	List <Asesorias> ListarAsesorias();
	List <Capacitaciones> ListarCapacitaciones();
	List <Mejoras> ListarMejoras();
	List<Pagos> ListarPagos();
	
	Cliente findClienteByRut(int rut);
	
	Empleado findEmpleadoByRut(int rutempleado);
	
	Long ContarAccidentes();
	
	Long ContarVisitas();
	Long ContarAsesorias();
	Long ContarCapacitaciones();
	Long ContarMejoras();

}
