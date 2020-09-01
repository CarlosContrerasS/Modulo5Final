package com.modulo5final.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.modulo5final.modelo.Asesorias;
import com.modulo5final.modelo.Visitas;
import com.modulo5final.servicio.AsesoriasServicio;
import com.modulo5final.servicio.VisitasServicio;

import java.util.List;



@Controller
public class AsesoriasControlador {

	@Autowired
	AsesoriasServicio ase;
	
	@Autowired
	VisitasServicio vs;
	
	
	@RequestMapping("/listaasesoriasC")
	public String verasesorias(Model m) {
		List<Asesorias> listaasesorias = ase.listarAsesorias();
		m.addAttribute("lasesorias", listaasesorias);
		return "listadoasesoria";
	}
	
	@RequestMapping("/agregarasesoria") //LINK PARA IR AL FORMULARIO DE LA ASESORIA
	public String agregarAsesorias(Model m) {
		m.addAttribute("command",new Asesorias());
		return "asesoriaform";
	}
	
	@RequestMapping("/agregarasesoriaespecial") // LINK PARA IR AL FORMULARIO DE LA ASESORIA ESPECIAL
	public String agregarAsesoriasespecial(Model m) {
		m.addAttribute("command",new Asesorias());
		return "asesoriaformespecial";
	}
	
	@RequestMapping(value="/guardarasesoria", method = RequestMethod.POST)//GUARDAR LA ASESORIA 
    public String nuevoasesoria(@RequestParam("id") int id, Asesorias as, Visitas vis){
		vis = vs.findVisitasByIDVisita(id);
		as.setPagada("No");
		as.setVisitasfk(vis);
        ase.agregarAsesorias(as);
        return "./index.jsp";
    }
	
	@RequestMapping(value="/guardarasesoriaespecial", method = RequestMethod.POST)//GUARDAR LA ASESORIA ESPECIAL
    public String nuevoasesoriaespecial(@RequestParam("id") int id, Asesorias as, Visitas vis){
		
		vis = vs.findVisitasByIDVisita(id);
		as.setVisitasfk(vis);
		as.setPagada("Si");
	    ase.agregarAsesorias(as);
        
        return "redirect:/listaasesoriasC";
    }
	
	//Es usado para buscar el rut en el formulario y entregar los datos del cliente a editar
	
	@RequestMapping(value="/buscarid",method = RequestMethod.GET) //PARA BUSCAR EL IDVISITA DE LA ASESORIA
    public String updatedatos(@RequestParam("Idvisita") int Idvisita, Visitas vis, Model m){    
    vis = vs.findVisitasByIDVisita(Idvisita);
    m.addAttribute("visitas", vis);
    return "asesoriaform";
    }
	
	@RequestMapping(value="/buscaridespecial",method = RequestMethod.GET) //PARA BUSCAR EL RUT DE LA ASESORIA ESPECIAL
    public String updatedatosespecial(@RequestParam("Idvisita") int Idvisita, Visitas vis, Model m){    
    vis = vs.findVisitasByIDVisita(Idvisita);
    m.addAttribute("visitas", vis);
    return "asesoriaformespecial";
    }
	

}
