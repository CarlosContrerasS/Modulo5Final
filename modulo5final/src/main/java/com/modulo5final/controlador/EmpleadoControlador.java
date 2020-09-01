package com.modulo5final.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.modulo5final.modelo.Empleado;
import com.modulo5final.servicio.EmpleadoServicio;



@Controller
public class EmpleadoControlador {
	
	@Autowired
	EmpleadoServicio es;
	
	//MOSTRAR LOS EMPLEADOS EN UNA LISTA
	
	@RequestMapping("/listaempleadosC")
	public String verempleados(Model m) {
		List<Empleado> listaempleados = es.listarEmpleado();
		m.addAttribute("lempleados", listaempleados);
		return "listadoempleadosV";
	}
	
	// AGREGAR EMPLEADO:
	
	//Manda al formulario
	@RequestMapping("/nuevoempleado")
	public String crearempleado(Model m) {
		m.addAttribute("empleado", new Empleado());
		return "empleadoform";
	}
	
	//Trae del Formulario de la creación, lo guarda y la manda a mostrar en una lista.
	
	@RequestMapping(value="/guardarempleado", method = RequestMethod.POST)
    public String nuevotest(Empleado emp){
        es.agregarEmpleado(emp);
        return "redirect:/listaempleadosC";
    }
	
	//ELIMINAR EMPLEADO:
	
	//Viene del nav y manda al forumulario para eliminar
	
	@RequestMapping("/deleteempleado")
    public String deletedatos( Model m){     
	m.addAttribute("empleado", new Empleado());
    return "Empleadodelete";
    }
	
	//Viene del formulario y de la lista para eliminar. Finalmente manda a la lista para mostrar
	
	@RequestMapping(value="/eliminarempleado", method = RequestMethod.GET)
    public String deleteempleado(@RequestParam("RutEmpleado") int RutEmpleado) {
    	es.eliminarEmpleado(RutEmpleado);
        return "redirect:/listaempleadosC";
    }
	
	//Es usado para buscar el rut en el formulario y entregar los datos del cliente a editar
	
		@RequestMapping(value= "/detalleempleado" , method = RequestMethod.GET)  
	    public String analizardatos(@RequestParam("RutEmpleado") int RutEmpleado, Model m){
	    Empleado e = es.findEmpleadoByrutempleado(RutEmpleado);
	    m.addAttribute("empleado", e);
	    return "Empleadodelete";
	    }
	
	//EDITAR EMPLEADO:
	
	//Viene del nav y lo lleva al formulario para editar
	@RequestMapping("/editempleado")
    public String actualizardatos( Model m){     
	m.addAttribute("empleado", new Empleado());
    return "Empleadoeditform";
    }
	
	// Viene del listado y lo lleva al formulario para editar
	
	@RequestMapping(value="/editarempleado", method = RequestMethod.GET)   
    public String edit(@RequestParam("RutEmpleado") int RutEmpleado, Model m){    
        Empleado emp = es.findEmpleadoByrutempleado(RutEmpleado);
        m.addAttribute("empleado", emp);
        return "Empleadoeditform";
    }
	
	//Guarda los datos editados y los manda al listado para mostrar
	
	@RequestMapping(value="/guardareditempleado",method = RequestMethod.POST)    
    public String editsave(Empleado emp){
        es.editarEmpleado(emp);
        return "redirect:/listaempleadosC";
    }
	
}