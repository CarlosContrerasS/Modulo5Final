package com.modulo5final.controlador;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.modulo5final.modelo.Usuario;
import com.modulo5final.servicio.UsuarioServicio;

@Controller
public class UsuarioControlador {
	
	@Autowired
	UsuarioServicio us;
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
	static Logger log = Logger.getLogger(UsuarioControlador.class.getName());
	
	
	@RequestMapping("/listausuarios")
	public String vercusuarios(Model m) {
		List<Usuario> listausuario = us.listarUsuario();
		m.addAttribute("lusuarios",listausuario);
		log.info("Ingreso a lista de usuarios");
		return "ListarUsuariosV";
	}
	
	@RequestMapping("/nuevousuario")
	public String crearusuario(Model m) {
		m.addAttribute("command",new Usuario());
		log.info("Ingreso a formulario de usuario");
		return "AgregarUsuarioV";
	}
	
	@RequestMapping(value="/guardarusuario", method = RequestMethod.POST)
    public String nuevousuario(Usuario usu){
		String passwd = encoder.encode(usu.getClave());
		usu.setClave(passwd);;
		us.agregarUsuario(usu);
        log.info("Se agrega usuario: "+usu.getLogin());
        return "redirect:/listausuarios";
    }
	
	
	
	@RequestMapping("/eliminarusuario/{usuarioid}")
    public String deleteusuario(@PathVariable int usuarioid) {
		us.eliminarUsuario(usuarioid);
    	log.info("Se elimina usuario id: "+usuarioid);
        return "redirect:/listausuarios";
    }
	
	@RequestMapping(value="/editarusuario/{usuarioid}")    
    public String edit(@PathVariable int usuarioid, Model m){ 
		Usuario usu = us.findusuarioByusuarioid(usuarioid);
        m.addAttribute("command",usu);
        log.info("Ingreso a editar usuario id: "+usuarioid);
        return "Usuarioeditform";
    }
	
	@RequestMapping(value="/guardareditusuario",method = RequestMethod.POST)    
    public String editsave(Usuario usu){
		us.editarUsuario(usu);
        log.info("Se edita usuario id: "+usu.getUsuarioid());
        return "redirect:/listaclientes";
    }
	
	
	@RequestMapping("/error")
    public String error(ModelMap model)
    {
        model.addAttribute("error", "true");
        return "login";
    }
	
	@RequestMapping("/login")
    public String login()
    {
        return "login";
    }
	
	@RequestMapping("/logout")
    public String logout()
    {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){    
        	SecurityContextHolder.getContext().setAuthentication(null);
        }
        return "index"; 
    }
	
	@RequestMapping("/403")
    public String cuatrocerotres(ModelMap model)
    {
		 model.addAttribute("message", "Acceso Denegado");
        return "403";
    }	

}
