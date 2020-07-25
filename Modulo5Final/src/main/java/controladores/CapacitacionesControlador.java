package controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import modelos.Capacitaciones;
import servicios.CapacitacionesServicio;


@Controller
public class CapacitacionesControlador {

	public class ChequeoControlador {
		
		@Autowired
		CapacitacionesServicio caps;
		
		@RequestMapping("/listacapacitacionesC")
		public String vercapacitaciones(Model m) {
			List<Capacitaciones> listaCapacitaciones = caps.listarCapacitaciones();
			m.addAttribute("lcapacitaciones",listaCapacitaciones);
			return "listacapacitacionesV";
		}
		
		@RequestMapping("/nuevacapacitaciones")
		public String crearcapacitaciones(Model m) {
			m.addAttribute("command",new Capacitaciones());
			return "capacitacionesform";
		}
		
		@RequestMapping(value="/guardarcapacitaciones", method = RequestMethod.POST)
	    public String nuevotest(Capacitaciones cap){
	        caps.agregarCapacitaciones(cap);
	        return "redirect:/listacapacitacionesC";
	    }
		
		@RequestMapping("/eliminarcapacitaciones/{IDCapacitacion}")
	    public String deletecapacitaciones(@PathVariable int IDCapacitacion) {
	    	caps.eliminarCapacitaciones(IDCapacitacion);
	        return "redirect:/listacapacitacionesC";
	    }
		
		@RequestMapping(value="/editarcapacitaciones/{IDCapacitacion}")    
	    public String edit(@PathVariable int IDCapacitacion, Model m){    
	        Capacitaciones cap = caps.findCapacitacionesByIDCapacitacion(IDCapacitacion);
	        m.addAttribute("command", cap);
	        return "Capacitacioneseditform";
	    }
		
		@RequestMapping(value="/guardareditcapacitaciones",method = RequestMethod.POST)    
	    public String editsave(Capacitaciones cap){
	        caps.editarCapacitaciones(cap);
	        return "redirect:/listacapacitacionesC";
	    }
		
		@RequestMapping("/detallechequeo/{IDCapacitacion}")
	    public String analizardatos(@PathVariable int IDCapacitacion, Model m) {
	    Capacitaciones cap = caps.findCapacitacionesByIDCapacitacion(IDCapacitacion);
	    m.addAttribute("cap",cap);
	    return "detallecapacitaciones";
	    }

	}

}



