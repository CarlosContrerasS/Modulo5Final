package com.modulo5final.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.modulo5final.modelo.Cliente;
import com.modulo5final.modelo.Mejoras;
import com.modulo5final.servicio.ClienteServicio;
import com.modulo5final.servicio.MejorasServicio;

import java.util.List;

@Controller
public class MejorasControlador {

	@Autowired
	MejorasServicio mej;
	@Autowired
	ClienteServicio cs;
	
	@RequestMapping("/listamejorasC")
	public String vermejoras(Model m) {
		List<Mejoras> listamejoras = mej.listarMejoras();
		m.addAttribute("lmejoras", listamejoras);
		return "listadomejoras";
	}
	
	@RequestMapping("/agregarmejoras")
	public String agregarMejoras(Model m) {
		m.addAttribute("command",new Mejoras());
		return "mejorasform";
	}
	
	@RequestMapping(value="/guardarmejoras", method = RequestMethod.POST)
    public String nuevomejoras(@RequestParam("rut") int rut, Cliente c, Mejoras m){
		c = cs.findclienteByrut(rut);
		m.setRutfk(c);
		mej.agregarMejoras(m);
        return "redirect:/listamejorasC";
    }
	
	@RequestMapping(value="/findbuscaridv",method = RequestMethod.GET) //PARA BUSCAR EL IDVISITA DE LA ASESORIA
    public String updatedatos(@RequestParam("rut") int rut, Cliente c, Model m){    
    c = cs.findclienteByrut(rut);
      
    m.addAttribute("cliente", c);
    return "mejorasform";
    }

}