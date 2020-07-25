package controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import modelos.Visitas;
import servicios.VisitasServicio;



@Controller
public class VisitasControlador {
	@Autowired
	VisitasServicio vs;
	
	@RequestMapping("/listavisitas")
	public String vervisitas(Model m) {
		List<Visitas> listavisitas = vs.listarVisitas();
		m.addAttribute("lvisitas",listavisitas);
		return "listadovisitas";
	}
	
	@RequestMapping("/nuevavisitas")
	public String crearvisitas(Model m) {
		m.addAttribute("command",new Visitas());
		return "visitasform";
	}
	
	@RequestMapping(value="/guardarvisitas", method = RequestMethod.POST)
    public String nuevotest(Visitas vis){
        vs.agregarVisitas(vis);
        return "redirect:/listavisitas";
    }
	
	@RequestMapping("/eliminarvisitas/{IDVisita}")
    public String deletevisitas(@PathVariable int IDVisita) {
    	vs.eliminarVisitas(IDVisita);
        return "redirect:/listavisitas";
    }
	
	@RequestMapping(value="/editarvisitas/{IDVisita}")    
    public String edit(@PathVariable int IDVisita, Model m){    
        Visitas vis = vs.findVisitasByIDVisita(IDVisita);
        m.addAttribute("command",vis);
        return "Visitaseditform";
    }
	
	@RequestMapping(value="/guardareditVisitas",method = RequestMethod.POST)    
    public String editsave(Visitas vis){
        vs.editarVisitas(vis);
        return "redirect:/listavisitas";
    }
	
	@RequestMapping("/detalleVisitas/{IDVisita}")
    public String analizardatos(@PathVariable int IDVisita,Model m) {
    Visitas v = vs.findVisitasByIDVisita(IDVisita);
    m.addAttribute("vis",v);
    return "detallevisitas";
    }

}
