package com.Modulo5Final.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Modulo5Final.dao.Chequeo;
import com.Modulo5Final.servicio.ChequeoServicio;



@Controller
public class ChequeoControlador {
	
	@Autowired
	ChequeoServicio ches;
	
	@RequestMapping("/listachequeosC")
	public String verchequeos(Model m) {
		List<Chequeo> listachequeos = ches.listarChequeo();
		m.addAttribute("lchequeo",listachequeos);
		return "listachequeosV";
	}
	
	@RequestMapping("/nuevochequeo")
	public String crearchequeo(Model m) {
		m.addAttribute("command",new Chequeo());
		return "chequeoform";
	}
	
	@RequestMapping(value="/guardarchequeo", method = RequestMethod.POST)
    public String nuevotest(Chequeo che){
        ches.agregarChequeo(che);
        return "redirect:/listachequeosC";
    }
	
	@RequestMapping("/eliminarchequeo/{idchequeo}")
    public String deleteempleado(@PathVariable int idchequeo) {
    	ches.eliminarChequeo(idchequeo);
        return "redirect:/listachequeosC";
    }
	
	@RequestMapping(value="/editarchequeo/{idchequeo}")    
    public String edit(@PathVariable int idchequeo, Model m){    
        Chequeo che = ches.findChequeoById(idchequeo);
        m.addAttribute("command", che);
        return "Chequeoeditform";
    }
	
	@RequestMapping(value="/guardareditchequeo",method = RequestMethod.POST)    
    public String editsave(Chequeo che){
        ches.editarChequeo(che);
        return "redirect:/listachequeosC";
    }
	
	@RequestMapping("/detallechequeo/{idchequeo}")
    public String analizardatos(@PathVariable int idchequeo, Model m) {
    Chequeo che = ches.findChequeoById(idchequeo);
    m.addAttribute("che",che);
    return "detallechequeo";
    }

}
