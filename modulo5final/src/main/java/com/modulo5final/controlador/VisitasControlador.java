package com.modulo5final.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.modulo5final.modelo.Cliente;
import com.modulo5final.modelo.Empleado;
import com.modulo5final.modelo.Visitas;
import com.modulo5final.servicio.ClienteServicio;
import com.modulo5final.servicio.EmpleadoServicio;
import com.modulo5final.servicio.VisitasServicio;



@Controller
public class VisitasControlador {
	@Autowired
	VisitasServicio vs;
	@Autowired
	ClienteServicio cs;
	
	@Autowired
	EmpleadoServicio es;
	
	@RequestMapping("/listavisitas")
	public String vervisitas(Model m) {
		List<Visitas> listavisitas = vs.listarVisitas();
		m.addAttribute("lvisitas", listavisitas);
		return "listadovisitas";
	}
	
	@RequestMapping("/nuevavisitas")
	public String crearvisitas(Model m) {
		m.addAttribute("command", new Visitas());
		return "visitasform";
	}
	
	@RequestMapping(value="/guardarvisitas", method = RequestMethod.POST)
    public String nuevotest(@RequestParam("rut") int rut, @RequestParam("rutempleado") int rutempleado, 
    		Cliente c, Empleado e, Visitas vis, Model m){  
		
		c = cs.findclienteByrut(rut);
	    e = es.findEmpleadoByrutempleado(rutempleado);
	    vis.setRutfk(c);
	    vis.setEmpleadorutfk(e);
	    
		vs.agregarVisitas(vis);
        return "redirect:/listavisitas";
    }
	
	@RequestMapping(value="/buscarrutes",method = RequestMethod.GET) //PARA BUSCAR EL IDVISITA DE LA ASESORIA
    public String updatedatos(@RequestParam("rut") int rut, @RequestParam("rutempleado") int rutempleado, Cliente c, Empleado e, Model m){    
    c = cs.findclienteByrut(rut);
    e = es.findEmpleadoByrutempleado(rutempleado);
    
    m.addAttribute("cliente", c);
    m.addAttribute("empleado", e);
    return "visitasform";
    }

}
