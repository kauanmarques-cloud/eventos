package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventoController {

	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento" ; 
	}
	
	@RequestMapping( path = "/eventos" , method = RequestMethod.POST)
	public String adicionar(String nome) {
		
			System.out.println("O nome:" + nome);
				
				
		return "evento-adicionado";
	}
	
}
