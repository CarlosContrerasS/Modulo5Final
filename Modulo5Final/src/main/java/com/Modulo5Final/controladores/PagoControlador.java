package com.reskilling4.controladores;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.reskilling4.dao.Pago;
import com.reskilling4.servicio.PagoServicio;

@Controller
public class PagoControlador {
	
	@Autowired
	PagoServicio ps;
	
	@RequestMapping("/listapagos")
	public String verpagos(Model m) {
		List<Pago> listapago = ps.listarPago();
		m.addAttribute("lpagos",listapago);
		return "listadopago";
	}
	
	@RequestMapping("/nuevopago")
	public String crearpago(Model m) {
		m.addAttribute("command",new Pago());
		return "pagoform";
	}
	
	@RequestMapping(value="/guardarpago", method = RequestMethod.POST)
    public String nuevotest(Pago pag){
    	java.sql.Date sqlDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
    	pag.setFechapago(sqlDate);
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
        Pago pag=ps.findPagoByPagoid(idpago);
        m.addAttribute("command",pag);
        return "pagoeditform";
    }
	
	@RequestMapping(value="/guardareditpago",method = RequestMethod.POST)    
    public String editsave(Pago pag){
    	Pago paux=ps.findPagoByPagoid(pag.getIdpago());
        java.sql.Date sqlDate = paux.getFechapago();
        pag.setFechapago(sqlDate);
        ps.editarPago(pag);
        return "redirect:/listapagos";
    }
	
	@RequestMapping("/detallepago/{idpago}")
    public String analizardatos(@PathVariable int idpago,Model m) {
    Pago p = ps.findPagoByPagoid(idpago);
    m.addAttribute("pag",p);
    return "detallepago";
    }

}
