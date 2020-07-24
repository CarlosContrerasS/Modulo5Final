package com.Modulo5Final.controladores;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Modulo5Final.dao.Pagos;
import com.Modulo5Final.servicio.PagosServicio;

@Controller
public class PagosControlador {
	@Autowired
	PagosServicio ps;
	
	@RequestMapping("/listapagos")
	public String verpagos(Model m) {
		List<Pagos> listapago = ps.listarPagos();
		m.addAttribute("lpagos",listapago);
		return "listadopago";
	}
	
	@RequestMapping("/nuevopago")
	public String crearpago(Model m) {
		m.addAttribute("command",new Pagos());
		return "pagoform";
	}
	
	@RequestMapping(value="/guardarpago", method = RequestMethod.POST)
    public String nuevotest(Pagos pag){
    	java.sql.Date sqlDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
    	pag.setFechaPago(sqlDate);
        ps.agregarPago(pag);
        return "redirect:/listapagos";
    }
	
	@RequestMapping("/eliminarpago/{idpago}")
    public String deletetest(@PathVariable int idpago) {
    	ps.eliminarPago(idpago);
        return "redirect:/listapagos";
    }
	
	@RequestMapping(value="/editarpago/{idpago}")    
    public String edit(@PathVariable int idpago, Model m){    
        Pagos pag=ps.findPagoByPagoid(idpago);
        m.addAttribute("command",pag);
        return "pagoeditform";
    }
	
	@RequestMapping(value="/guardareditpago",method = RequestMethod.POST)    
    public String editsave(Pagos pag){
    	Pagos paux=ps.findPagoByPagoid(pag.getIDPago());
        java.sql.Date sqlDate = paux.getFechaPago();
        pag.setFechaPago(sqlDate);
        ps.editarPago(pag);
        return "redirect:/listapagos";
    }
	
	@RequestMapping("/detallepago/{idpago}")
    public String analizardatos(@PathVariable int idpago, Model m) {
    Pagos p = ps.findPagoByPagoid(idpago);
    m.addAttribute("pag", p);
    return "detallepago";
    }

}