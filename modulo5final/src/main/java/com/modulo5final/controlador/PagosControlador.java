package com.modulo5final.controlador;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.modulo5final.modelo.Cliente;
import com.modulo5final.modelo.Pagos;
import com.modulo5final.servicio.ClienteServicio;
import com.modulo5final.servicio.PagosServicio;



@Controller
public class PagosControlador {
	@Autowired
	PagosServicio ps;
	
	@Autowired
	ClienteServicio cs;
	
	@RequestMapping("/listapagos")
	public String verpagos(Model m) {
		List<Pagos> listapago = ps.listarPagos();
		m.addAttribute("lpagos", listapago);
		return "listadopago";
	}
	
	@RequestMapping("/nuevopago")
	public String crearpago(Model m) {
		m.addAttribute("command", new Pagos());
		return "pagoform";
	}
	
	@RequestMapping(value="/guardarpago", method = RequestMethod.POST)
    public String nuevopago(@RequestParam("rut") int rut, @RequestParam("fechavencimiento") String fechavencimiento, 
    		Cliente c, Pagos pag, Model m) throws ParseException{
    	
		java.sql.Date sqlDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
    	
		//el formato es importante
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	//convertimos el String en un Date
    	
    	java.util.Date fecha = sdf.parse(fechavencimiento);
    	
    	//inicializamos el objeto Calendar
    	Calendar calendario = Calendar.getInstance();
    	//colocamos la fecha en nuestro objeto Calendar
    	calendario.setTime(fecha);
    	
    	System.out.println(fecha);
		
           		
		System.out.println(sqlDate);
		
    	
    	pag.setFechaPago(sqlDate);
    	pag.setFechaVencimiento(fecha);
    	c = cs.findclienteByrut(rut);
    	pag.setRutfk(c);
        ps.agregarPago(pag);
        return "redirect:/listapagos";
    }
	
	@RequestMapping(value="/findrut",method = RequestMethod.GET) 
    public String updatedatos(@RequestParam("rut") int rut, Cliente c, Model m){    
    c = cs.findclienteByrut(rut);
    m.addAttribute("cliente", c);
    return "pagoform";
    }

}
		      
	   