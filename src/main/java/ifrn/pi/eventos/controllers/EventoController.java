package ifrn.pi.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ifrn.pi.eventos.models.Eventos;
import ifrn.pi.eventos.repositories.EventosRepository;

@Controller
public class EventoController {

	@Autowired
	private EventosRepository er;
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento" ; 
	}
	
	@RequestMapping( path = "/eventos" , method = RequestMethod.POST)
	public String adicionar(Eventos evento) {
		
			System.out.println(evento);
			er.save(evento);	
				
		return "evento-adicionado";
	}
	
}
