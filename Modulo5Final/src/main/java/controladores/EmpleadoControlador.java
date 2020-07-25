package controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import modelos.Empleado;
import servicios.EmpleadoServicio;



@Controller
public class EmpleadoControlador {
	
	@Autowired
	EmpleadoServicio es;
	
	@RequestMapping("/listaempleadosC")
	public String verempleados(Model m) {
		List<Empleado> listaempleados = es.listarEmpleado();
		m.addAttribute("lempleados",listaempleados);
		return "listadoempleadosV";
	}
	
	@RequestMapping("/nuevoempleado")
	public String crearempleado(Model m) {
		m.addAttribute("command",new Empleado());
		return "empleadoform";
	}
	
	@RequestMapping(value="/guardarempleado", method = RequestMethod.POST)
    public String nuevotest(Empleado emp){
        es.agregarEmpleado(emp);
        return "redirect:/listaempleadosC";
    }
	
	@RequestMapping("/eliminarempleado/{rutempleado}")
    public String deleteempleado(@PathVariable int rutempleado) {
    	es.eliminarEmpleado(rutempleado);
        return "redirect:/listaempleadosC";
    }
	
	@RequestMapping(value="/editarempleado/{rutempleado}")    
    public String edit(@PathVariable int rutempleado, Model m){    
        Empleado emp = es.findEmpleadoByrutempleado(rutempleado);
        m.addAttribute("command",emp);
        return "Empleadoeditform";
    }
	
	@RequestMapping(value="/guardareditempleado",method = RequestMethod.POST)    
    public String editsave(Empleado emp){
        es.editarEmpleado(emp);
        return "redirect:/listaempleados";
    }
	
	@RequestMapping("/detalleempleado/{rutempleado}")
    public String analizardatos(@PathVariable int rutempleado, Model m) {
    Empleado e = es.findEmpleadoByrutempleado(rutempleado);
    m.addAttribute("emp",e);
    return "detalleempleado";
    }

}