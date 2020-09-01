package com.modulo5final.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.modulo5final.modelo.Capacitaciones;
import com.modulo5final.modelo.Visitas;
import com.modulo5final.servicio.CapacitacionesServicio;
import com.modulo5final.servicio.VisitasServicio;


@Controller
public class CapacitacionesControlador {
		
		@Autowired
		CapacitacionesServicio caps;
		
		@Autowired
		VisitasServicio vs;
		
		@RequestMapping("/listacapacitaciones")
		public String vercapacitaciones(Model m) {
			List<Capacitaciones> listaCapacitaciones = caps.listarCapacitaciones();
			m.addAttribute("lcapacitaciones", listaCapacitaciones);
			return "listadocapacitaciones";
		}
		
		@RequestMapping("/nuevacapacitaciones")
		public String crearcapacitaciones(Model m) {
			m.addAttribute("command", new Capacitaciones());
			return "capacitacionesform";
		}
		
		@RequestMapping(value="/guardarcapacitaciones", method = RequestMethod.POST)
	    public String nuevotest(@RequestParam("Idvisita") int Idvisita, Visitas vis, Capacitaciones cap){
			vis = vs.findVisitasByIDVisita(Idvisita);
			cap.setVisitasfk(vis);
			caps.agregarCapacitaciones(cap);
	        
	        return "redirect:/listacapacitaciones";
	    }
		
		@RequestMapping(value="/buscaridvisita",method = RequestMethod.GET) //PARA BUSCAR EL IDVISITA DE LA ASESORIA
	    public String updatedatos(@RequestParam("Idvisita") int Idvisita, Visitas vis, Model m){    
	    vis = vs.findVisitasByIDVisita(Idvisita);
	    
	    m.addAttribute("visitas", vis);
	    return "capacitacionesform";
	    }
		
		

	}



