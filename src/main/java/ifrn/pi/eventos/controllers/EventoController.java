package ifrn.pi.eventos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ifrn.pi.eventos.models.Eventos;
import ifrn.pi.eventos.repositories.EventosRepository;

@Controller
@RequestMapping("/eventos")
public class EventoController {

	@Autowired
	private EventosRepository er;
	
	@GetMapping("/form")
	public String form() {
		return "eventos/formEvento" ; 
	}
	
	@RequestMapping
	public String adicionar(Eventos evento) {
		
			System.out.println(evento);
			er.save(evento);	
				
		return "eventos/evento-adicionado";
	}
	@GetMapping
	public ModelAndView listar() {
		List<Eventos> eventos = er.findAll();
		ModelAndView mv = new ModelAndView("eventos/lista");
		mv.addObject("eventos", eventos);
		return mv;
	}
	
}
