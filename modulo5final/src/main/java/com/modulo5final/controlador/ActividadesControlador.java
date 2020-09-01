package com.modulo5final.controlador;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.modulo5final.modelo.Asesorias;
import com.modulo5final.modelo.Capacitaciones;
import com.modulo5final.modelo.Chequeo;
import com.modulo5final.modelo.Cliente;
import com.modulo5final.modelo.Empleado;
import com.modulo5final.modelo.Visitas;
import com.modulo5final.servicio.ActividadesServicio;

@Controller
public class ActividadesControlador {
	
	@Autowired
	ActividadesServicio acser;
	
	//GENERO LAS LISTAS PARA IR A LA PAGINA INICIAL, EN DONDE BUSCARE UN RUT DE EMPLEADO
	@RequestMapping("/listaactividades") 
	public String iniciar() {
		return "listadoactividades";
		}
	
	//VUELVO CON EL RUT DEL EMPLEADO Y OBTENGO LOS OBJETOS PARA MOSTRAR LOS CAMPOS
	
	@RequestMapping(value="/veractividades", method = RequestMethod.GET)
	public String veractividades(@RequestParam("rutempleado") int rutempleado, Model m) {
		
		List <Empleado> le = acser.ListarEmpleados();
		List <Visitas> lv = acser.ListarVisitas();
		List <Cliente> lc = acser.ListarClientes();
		List <Chequeo> lch = acser.ListarChequeos();
		List <Asesorias> la = acser.ListarAsesorias();
		List <Capacitaciones> lca = acser.ListarCapacitaciones();
		
		Empleado e = new Empleado();
		
		List <Visitas> listavisitas = new ArrayList<Visitas>();
		List <Cliente> listaclientes = new ArrayList<Cliente>();
		List <Chequeo> listachequeos = new ArrayList<Chequeo>();
		List <Asesorias> listaasesorias = new ArrayList<Asesorias>();
		List <Capacitaciones> listacapacitaciones = new ArrayList<Capacitaciones>();
		
		List <Integer> idvisita = new ArrayList<Integer>(); 
		List <Integer> rutcliente = new ArrayList<Integer>();
		
		
		//BUSCO EL EMPLEADO EN LA LISTA CON EL RUT ESCOGIDO PARA MOSTRARLO
		for( int i = 0; i<le.size(); i++) {
			if(rutempleado == le.get(i).getRutEmpleado()) {
				e = le.get(i);
			}
		}

		
		// BUSCO LA LISTA DE VISITAS QUE COINCIDA CON EL RUT DEL EMPLEADO EN EL FK.
		for (int i = 0; i < lv.size(); i++) {
			if (rutempleado == lv.get(i).getEmpleadorutfk().getRutEmpleado()) {
				listavisitas.add(lv.get(i));
				idvisita.add(lv.get(i).getIdvisita());
				rutcliente.add(lv.get(i).getRutfk().getRut());
				
			}
		}

		// BUSCO LA LISTA DE CHEQUEOS QUE COINCIDA CON LA IDVISITA EN EL FK
		for (int i = 0; i < idvisita.size(); i++) {
			for(int j= 0; j <lch.size();j++) {
				if (idvisita.get(i) == lch.get(j).getVisitasfk().getIdvisita()) {
					listachequeos.add(lch.get(j));
				}	
			}
			
		}
		
		// BUSCO LA LISTA DE ASESORIAS QUE COINCIDA CON LA IDVISITA EN EL FK
		for (int i = 0; i < idvisita.size(); i++) {
			for (int j = 0; j < la.size(); j++) {
				if (idvisita.get(i) == la.get(j).getVisitasfk().getIdvisita()) {
					listaasesorias.add(la.get(j));
				}
			}
		}
		
		// BUSCO LA LISTA DE CAPACITACIONES QUE COINCIDA CON LA IDVISITA EN EL FK
		for (int i = 0; i < idvisita.size(); i++) {
			for (int j = 0; j < lca.size(); j++) {
				if (idvisita.get(i) == lca.get(j).getVisitasfk().getIdvisita()) {
					listacapacitaciones.add(lca.get(j));
				}
			}
		}
		
		// BUSCO LA LISTA DE CLIENTES QUE COINCIDA CON EL LA LISTA DE LOS RUT DE CLIENTES EN LAS VISITAS
		for (int i = 0; i < rutcliente.size(); i++) {
			for (int j = 0; j < lc.size(); j++) {
				if (rutcliente.get(i) == lc.get(j).getRut()) {
					listaclientes.add(lc.get(j));
				}
			}
		}

				
		m.addAttribute("empleado", e);
		m.addAttribute("lvisitas", listavisitas);
		m.addAttribute("lcliente", listaclientes);
		m.addAttribute("lchequeos", listachequeos);
		m.addAttribute("lasesorias", listaasesorias);
		m.addAttribute("lcapacitaciones", listacapacitaciones);
		
		return "listadoactividades";
	}
}