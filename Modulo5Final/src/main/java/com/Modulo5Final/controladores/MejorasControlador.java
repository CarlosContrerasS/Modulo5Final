package com.Modulo5Final.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;

import com.Modulo5Final.dao.Mejoras;
import com.Modulo5Final.servicio.MejorasServicio;

import java.util.List;

@Controller
public class MejorasControlador {

	@Autowired
	MejorasServicio mej;
	
	
	@RequestMapping("/listamejorasC")
	public String vermejoras(Model m) {
		List<Mejoras> listamejoras = mej.listarMejoras();
		m.addAttribute("lmejoras",listamejoras);
		return "ListarMejorasV";
	}
	
	@RequestMapping("/agregarmejoras")
	public String agregarMejoras(Model m) {
		m.addAttribute("command",new Mejoras());
		return "mejorasform";
	}
	
	@RequestMapping(value="/guardarmejoras", method = RequestMethod.POST)
    public String nuevomejoras(Mejoras m){
        mej.agregarMejoras(m);
        return "redirect:/listamejorasC";
    }
	
	@RequestMapping("/eliminarmejoras/{IDMejora}")
    public String delete(@PathVariable int IDMejora) {
    	mej.eliminarMejoras(IDMejora);
        return "redirect:/listaamejorasC";
    }
	
	@RequestMapping(value="/editarmejoras/{IDMejora}")    
    public String edit(@PathVariable int IDMejora, Model m){    
        Mejoras me= mej.findMejorasById(IDMejora);
        m.addAttribute("command",me);
        return "Mejoraseditform";
    }
	
	@RequestMapping(value="/guardareditmejoras",method = RequestMethod.POST)    
    public String editsave(Mejoras me){
        mej.editarMejoras(me);
        return "redirect:/listamejorasC";
    }
	
	@RequestMapping("/detallemejoras/{IDMejora}")
    public String analizardatos(@PathVariable int IDMejora, Model m) {
    Mejoras me = mej.findMejorasById(IDMejora);
    m.addAttribute("ase",me);
    return "detallemejoras";
    }

}

	
	
	

