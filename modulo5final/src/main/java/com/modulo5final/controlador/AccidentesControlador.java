package com.modulo5final.controlador;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.modulo5final.modelo.Accidentes;
import com.modulo5final.modelo.Cliente;
import com.modulo5final.servicio.AccidentesServicio;
import com.modulo5final.servicio.ClienteServicio;



@Controller
public class AccidentesControlador {

	@Autowired
	AccidentesServicio acs;
	

	@Autowired
	ClienteServicio cs;
	
	@RequestMapping("/listaaccidenteC")
	public String veraccidentes(Model m) {

		List<Accidentes> listaaccidente = acs.listarAccidentes();
		m.addAttribute("laccidente", listaaccidente);
		return "listadoaccidente";
	}
	
	@RequestMapping("/nuevoaccidente")
	public String crearaccidente(Model m) {
		m.addAttribute("command",new Accidentes());
		return "accidenteform";
	}
	
	@RequestMapping(value="/guardaraccidente", method = RequestMethod.POST)
    public String nuevoaccidente(@RequestParam("rut") int rut, Cliente c, Accidentes a, Model model) {
		c = cs.findclienteByrut(rut);
		a.setRutfk(c);
		acs.agregarAccidente(a);
		model.addAttribute("cliente", c);
		model.addAttribute("laccidente", a);
        return "./index.jsp";
    }
	
	
	@RequestMapping(value="/buscarrut",method = RequestMethod.GET) //PARA BUSCAR EL IDVISITA DE LA ASESORIA
    public String updatedatos(@RequestParam("rut") int rut, Cliente c, Model m){ 
		
    c = cs.findclienteByrut(rut);
    m.addAttribute("cliente", c);
    return "accidenteform";
    }


}
