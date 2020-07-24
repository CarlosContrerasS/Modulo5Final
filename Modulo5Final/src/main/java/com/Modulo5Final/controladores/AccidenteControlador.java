package com.Modulo5Final.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Modulo5Final.dao.Accidentes;
import com.Modulo5Final.servicio.AccidenteServicio;

@Controller
public class AccidenteControlador {

	@Autowired
	AccidenteServicio as;
	
	@RequestMapping("/listaaccidenteC")
	public String verempleados(Model m) {
		List<Accidentes> listaaccidente = as.listarAccidentes();
		m.addAttribute("laccidente",listaaccidente);
		return "listaaccidenteV";
	}
	
	@RequestMapping("/nuevoaccidente")
	public String crearaccidente(Model m) {
		m.addAttribute("command",new Accidentes());
		return "accidenteform";
	}
	
	@RequestMapping(value="/guardaraccidente", method = RequestMethod.POST)
    public String nuevotest(Accidentes acc){
        as.agregarAccidente(acc);
        return "redirect:/listaaccidenteC";
    }
	
	@RequestMapping("/eliminaraccidente/{IdAccidente}")
    public String eliminarAccidente(@PathVariable int IdAccidente) {
    	as.eliminarAccidente(IdAccidente);
        return "redirect:/listaaccidenteC";
    }
	
	@RequestMapping(value="/editareaccidente/{IdAccidente}")    
    public String edit(@PathVariable int IdAccidente, Model m){    
        Accidentes ac = as.findAccidenteById(IdAccidente);
        m.addAttribute("command",ac);
        return "Accidenteeditform";
    }
	
	@RequestMapping(value="/guardareditaccidente",method = RequestMethod.POST)    
    public String editsave(Accidentes acc){
        as.editarAccidente(acc);
        return "redirect:/listaaccidente";
    }
	
	@RequestMapping("/detalleaccidente/{IdAccidente}")
    public String analizardatos(@PathVariable int IdAccidente, Model m) {
    Accidentes a = as.findAccidenteById(IdAccidente);
    m.addAttribute("acc",a);
    return "detalleaccidente";
    }

}
