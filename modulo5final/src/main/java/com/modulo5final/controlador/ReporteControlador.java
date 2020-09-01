package com.modulo5final.controlador;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.modulo5final.modelo.Accidentes;
import com.modulo5final.modelo.Asesorias;
import com.modulo5final.modelo.Capacitaciones;
import com.modulo5final.modelo.Cliente;
import com.modulo5final.modelo.Empleado;
import com.modulo5final.modelo.Pagos;
import com.modulo5final.modelo.Reporte;
import com.modulo5final.modelo.ReporteCliente;
import com.modulo5final.modelo.Visitas;
import com.modulo5final.servicio.ReporteServicio;

@Controller
public class ReporteControlador {
	
	@Autowired
	ReporteServicio rcs;
	

	@RequestMapping("/listareportecliente") 
	public String iniciar() {
		return "listadoreportecliente";
	}
	
	@RequestMapping(value="/verreportecliente", method = RequestMethod.GET)
	public String verreporteclientes(@RequestParam("rut") int rut, Cliente c, ReporteCliente rcl, Model m) {
		
		
		List<Accidentes> laccidentes = rcs.ListarAccidentes();
		List <Capacitaciones> lcapacitaciones = rcs.ListarCapacitaciones();
		List <Pagos> lpagos = rcs.ListarPagos();
		

		int diasperdidos = 0;
		int numtrab = 0;
		long CantidadDeAccidentes = rcs.ContarAccidentes();
		int TotalDiasPerdidos = 0;
		long CantidadVisitas = rcs.ContarVisitas();
		long CantidadAsesorias = rcs.ContarAsesorias();
		long CantidadMejoras = rcs.ContarMejoras();
		long CantidadCapacitaciones = rcs.ContarCapacitaciones();
		int cantidadasistentes = 0;
		int TotalRegular=0;
		int TotalAdicional=0;
		
		for(int i=0; i<laccidentes.size(); i++) {
			if(rut==laccidentes.get(i).getRutfk().getRut()) {
				diasperdidos += laccidentes.get(i).getDiasperdidos();
				numtrab += laccidentes.get(i).getNumtrab();
				TotalDiasPerdidos += laccidentes.get(i).getDiasperdidos();
				
			}
		}
		
		for (int i=0; i<lcapacitaciones.size(); i++ ) {
			if(rut==lcapacitaciones.get(i).getVisitasfk().getRutfk().getRut()) {
				cantidadasistentes += lcapacitaciones.get(i).getNumAsistentes();
			}
		}
		
		Date fechapago = null;
		java.util.Date fechavencimiento=null;
		
		for (int i = 0; i< lpagos.size(); i++) {
			if ( rut == lpagos.get(i).getRutfk().getRut()) {
				TotalRegular += lpagos.get(i).getMontoRegular();
				TotalAdicional += lpagos.get(i).getMontoAdicional();
				fechapago = lpagos.get(i).getFechaPago();
				fechavencimiento = lpagos.get(i).getFechaVencimiento();
				
			}
		}
		float Accidentabilidad =  TotalDiasPerdidos / numtrab;
		
		String msg ="";	
		if(fechapago.before(fechavencimiento)){
			rcl.setCheq2("Si");
			
		} else if(fechapago.after(fechavencimiento)){
			 rcl.setCheq2("No");
			 msg="alert('El Cliente se encuentra con Atraso del Pago')";
		} else {
			rcl.setCheq2("Si");
		}
		
		
		
		c = rcs.findClienteByRut(rut);
		
		rcl.setRut(c.getRut());
		rcl.setNombre(c.getNombre());
		rcl.setRubro(c.getRubro());
		rcl.setDiasperdidos(diasperdidos);
		rcl.setNumtrab(numtrab);
		rcl.setCantidadDeAccidentes(CantidadDeAccidentes);
		rcl.setAccidentabilidad(Accidentabilidad);
		rcl.setCantidadDeAccidentes(CantidadDeAccidentes);
		rcl.setCantidadDeAsesorias(CantidadAsesorias);
		rcl.setCantidadDeCapacitaciones(CantidadCapacitaciones);
		rcl.setCantidadDeMejoras(CantidadMejoras);
		rcl.setCantidadDeVisitas(CantidadVisitas);
		rcl.setAsistentesaCapacitaciones(cantidadasistentes);
		rcl.setTotalRegular(TotalRegular);
		rcl.setTotalAdicional(TotalAdicional);
		
		
		m.addAttribute("reportecliente", rcl);
		m.addAttribute("atraso", msg);

		
		return "listadoreportecliente";
	}
	
	@RequestMapping("/listareporte") 
	public String verreporteclientes(Reporte re, Model m) {
		
		int TotalDiasPerdidos=0;
		int TotalTrabajadoresAccidentados=0;
		int CantidadDeAsistentesCapacitaciones=0;
		long TotalRegular = 0;		
		long TotalAdicional = 0;
		
		List<Accidentes> laccidentes = rcs.ListarAccidentes();
		List <Capacitaciones> lcapacitaciones = rcs.ListarCapacitaciones();
		List <Pagos> lpagos = rcs.ListarPagos();
				
		long CantidadClientes = rcs.ContarClientes();
		long CantidadDeAccidentes = rcs.ContarAccidentes();
		long CantidadVisitas = rcs.ContarVisitas();
		Long CantidadDeAsesorias = rcs.ContarAccidentes();
		Long CantidadDeCapacitaciones = rcs.ContarCapacitaciones();
		Long CantidadDeMejoras = rcs.ContarMejoras();
		
		
		for (int i= 0; i<laccidentes.size(); i++) {
			TotalDiasPerdidos += laccidentes.get(i).getDiasperdidos();
			TotalTrabajadoresAccidentados += laccidentes.get(i).getNumtrab();
			
		}
		 
		float Accidentabilidad = TotalDiasPerdidos / TotalTrabajadoresAccidentados;
		
		for(int i=0; i<lcapacitaciones.size(); i++ ) {
			CantidadDeAsistentesCapacitaciones += lcapacitaciones.get(i).getNumAsistentes();
		}
		 
		for(int i = 0; i<lpagos.size(); i++) {
			TotalRegular += lpagos.get(i).getMontoRegular();
			TotalAdicional += lpagos.get(i).getMontoAdicional();
		}
		
		re.setCantidadClientes(CantidadClientes);
		re.setTotalDiasPerdidos(TotalDiasPerdidos);
		re.setTotalTrabajoresAccidentados(TotalTrabajadoresAccidentados);
		re.setCantidadDeAccidentes(CantidadDeAccidentes);
		re.setAccidentabilidad(Accidentabilidad);
		re.setCantidadDeVisitas(CantidadVisitas);
		re.setCantidadDeAsesorias(CantidadDeAsesorias);
		re.setCantidadDeCapacitaciones(CantidadDeCapacitaciones);
		re.setCantidadDeMejoras(CantidadDeMejoras);
		re.setCantidadDeAsistentesCapacitaciones(CantidadDeAsistentesCapacitaciones);
		re.setTotalRegular(TotalRegular);
		re.setTotalAdicional(TotalAdicional);
		
		
		m.addAttribute("lreporte", re);
		
		return "listadoreporte";

	
	}
	
	@RequestMapping("/revisarcliente") 
	public String revisar() {
		return "vercliente";
	}
	
	@RequestMapping(value="/vercliente", method = RequestMethod.GET)
	public String vercliente(@RequestParam("rut") int rut, @RequestParam("rutempleado") int rutempleado, 
			Cliente c, Empleado e, Model m) {
		
		c = rcs.findClienteByRut(rut);
		e = rcs.findEmpleadoByRut(rutempleado);
		
		List <Visitas> lvisitas = rcs.ListarVisitas();
		int cantidadVisitas = 0;
		List<Integer> idVisitas = new ArrayList<Integer>();
		List <Asesorias> lasesorias = rcs.ListarAsesorias();
		int cantidadAsesorias = 0;
		List <Capacitaciones> lcapacitaciones = rcs.ListarCapacitaciones();
		int cantidadCapacitaciones = 0;
		
		
		List<String> visitasfechas = new ArrayList<String>();
		List<String> asesoriasfechas = new ArrayList<String>();
		List<String> capacitacionesfechas = new ArrayList<String>();
		
		for(int i= 0; i< lvisitas.size(); i++) {
			if(rut == lvisitas.get(i).getRutfk().getRut()) {
				if (rutempleado == lvisitas.get(i).getEmpleadorutfk().getRutEmpleado()) {
						cantidadVisitas ++;
						idVisitas.add(lvisitas.get(i).getIdvisita());
						visitasfechas.add(lvisitas.get(i).getFecha());
				}
			}
		}
		
		
		for(int i= 0; i<idVisitas.size() ; i++) {
			for(int j= 0; j< lasesorias.size(); j++) {
				if(idVisitas.get(i) == lasesorias.get(j).getVisitasfk().getIdvisita()) {
					
					cantidadAsesorias ++;
					asesoriasfechas.add(lasesorias.get(j).getFecha());
				}
			}
			
		}
		
		for(int i= 0; i<idVisitas.size() ; i++) {
			for(int j= 0; j< lcapacitaciones.size(); j++) {
				if(idVisitas.get(i) == lcapacitaciones.get(j).getVisitasfk().getIdvisita()) {
					
					cantidadCapacitaciones ++;
					capacitacionesfechas.add( lcapacitaciones.get(j).getFecha());
				}
			}
			
		}
		
		m.addAttribute("cliente", c);
		m.addAttribute("empleado", e);
		m.addAttribute("visitasfechas", visitasfechas);
		m.addAttribute("asesoriasfechas", asesoriasfechas);
		m.addAttribute("capacitacionesfechas", capacitacionesfechas);
		m.addAttribute("cantidadvisitas", cantidadVisitas);
		m.addAttribute("cantidadasesorias", cantidadAsesorias);
		m.addAttribute("cantidadCapacitaciones", cantidadCapacitaciones);
		
		
		return "vercliente";
	}
}
