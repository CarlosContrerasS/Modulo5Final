package controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;

import modelos.Asesorias;
import servicios.AsesoriasServicio;

import java.util.List;



@Controller
public class AsesoriasControlador {

	@Autowired
	AsesoriasServicio ase;
	
	
	@RequestMapping("/listaasesoriasC")
	public String verasesorias(Model m) {
		List<Asesorias> listaasesorias = ase.listarAsesorias();
		m.addAttribute("lasesorias",listaasesorias);
		return "ListarAsesoriaV";
	}
	
	@RequestMapping("/agregarasesoria")
	public String agregarAsesorias(Model m) {
		m.addAttribute("command",new Asesorias());
		return "asesoriaform";
	}
	
	@RequestMapping(value="/guardarasesoria", method = RequestMethod.POST)
    public String nuevoasesoria(Asesorias as){
        ase.agregarAsesorias(as);
        return "redirect:/listaasesoriasC";
    }
	
	@RequestMapping("/eliminarasesoria/{IdAsesorias}")
    public String delete(@PathVariable int IdAsesorias) {
    	ase.eliminarAsesorias(IdAsesorias);
        return "redirect:/listaasesoriasC";
    }
	
	@RequestMapping(value="/editarasesorias/{IdAsesorias}")    
    public String edit(@PathVariable int IdAsesorias, Model m){    
        Asesorias a= ase.findAsesoriasById(IdAsesorias);
        m.addAttribute("command",a);
        return "Asesoriaseditform";
    }
	
	@RequestMapping(value="/guardareditasesorias",method = RequestMethod.POST)    
    public String editsave(Asesorias a){
        ase.editarAsesorias(a);
        return "redirect:/listaasesoriasC";
    }
	
	@RequestMapping("/detalleasesorias/{IdAsesorias}")
    public String analizardatos(@PathVariable int IdAsesorias, Model m) {
    Asesorias a = ase.findAsesoriasById(IdAsesorias);
    m.addAttribute("ase",a);
    return "detalleasesorias";
    }

}
