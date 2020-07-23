package com.Modulo5Final.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Modulo5Final.dao.Cliente;
import com.Modulo5Final.servicio.ClienteServicio;



@Controller
public class ClienteControlador {
	
	@Autowired
	ClienteServicio cs;
	
	@RequestMapping("/listaclientes")
	public String verclientes(Model m) {
		List<Cliente> listacliente = cs.listarCliente();
		m.addAttribute("lclientes",listacliente);
		return "listadocliente";
	}
	
	@RequestMapping("/nuevocliente")
	public String crearcliente(Model m) {
		m.addAttribute("command",new Cliente());
		return "clienteform";
	}
	
	@RequestMapping(value="/guardarcliente", method = RequestMethod.POST)
    public String nuevotest(Cliente cli){
        cs.agregarCliente(cli);
        return "redirect:/listaclientes";
    }
	
	@RequestMapping("/eliminarcliente/{rut}")
    public String deletecliente(@PathVariable int rut) {
    	cs.eliminarCliente(rut);
        return "redirect:/listaclientes";
    }
	
	@RequestMapping(value="/editarcliente/{rut}")    
    public String edit(@PathVariable int rut, Model m){    
        Cliente cli = cs.findclienteByrut(rut);
        m.addAttribute("command",cli);
        return "Clienteeditform";
    }
	
	@RequestMapping(value="/guardareditcliente",method = RequestMethod.POST)    
    public String editsave(Cliente cli){
        cs.editarCliente(cli);
        return "redirect:/listaclientes";
    }
	
	@RequestMapping("/detallecliente/{rut}")
    public String analizardatos(@PathVariable int rut,Model m) {
    Cliente c = cs.findclienteByrut(rut);
    m.addAttribute("cli",c);
    return "detallecliente";
    }

}
