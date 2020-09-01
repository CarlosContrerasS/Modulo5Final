package com.modulo5final.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.modulo5final.modelo.Chequeo;
import com.modulo5final.modelo.Visitas;
import com.modulo5final.servicio.ChequeoServicio;
import com.modulo5final.servicio.VisitasServicio;



@Controller
public class ChequeoControlador {
	
	@Autowired
	ChequeoServicio ches;
	
	@Autowired
	VisitasServicio vs;
	
	@RequestMapping("/listachequeosC")
	public String verchequeos(Model m) {
		List<Chequeo> listachequeos = ches.listarChequeo();
		m.addAttribute("lchequeo", listachequeos);
		return "listadochequeos";
	}
	
	@RequestMapping("/nuevochequeo")
	public String crearchequeo(Model m) {
		m.addAttribute("command", new Chequeo());
		return "chequeoform";
	}
	
	@RequestMapping(value="/guardarchequeo", method = RequestMethod.POST)
    public String nuevotest(@RequestParam("idvisita") int idvisita, Visitas vis, Chequeo che, Model m) {
		vis = vs.findVisitasByIDVisita(idvisita);
		che.setVisitasfk(vis);
        ches.agregarChequeo(che);
        return "redirect:/listachequeosC";
    }
	
	@RequestMapping(value="/findvis",method = RequestMethod.GET) 
    public String updatedatos(@RequestParam("idvisita") int idvisita, Visitas vis, Model m){    
    vis = vs.findVisitasByIDVisita(idvisita);
		
    m.addAttribute("visitas", vis);
    return "chequeoform";
    }

}
