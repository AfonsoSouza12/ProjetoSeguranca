package br.edu.utfpr.pb.aula4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.utfpr.pb.aula4.model.Genero;
import br.edu.utfpr.pb.aula4.service.CrudService;
import br.edu.utfpr.pb.aula4.service.GeneroService;

@Controller
@RequestMapping("genero")
public class GeneroController 
		extends CrudController<Genero, Integer>{

	@Autowired
	private GeneroService generoService;

	@Override
	protected CrudService<Genero, Integer> getService() {
		return generoService;
	}

	@Override
	protected String getURL() {
		return "genero";
	}

	@Override
	@GetMapping("new")
	protected ModelAndView form(Genero genero) {
		ModelAndView modelAndView = new ModelAndView(this.getURL() + "/form");
		if (genero != null) {
			modelAndView.addObject(genero);
		}else {
			modelAndView.addObject(new Genero());
		}
		return modelAndView;
	}

	@Override
	@GetMapping("{id}")
	protected ModelAndView form(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView(this.getURL() + "/form");
		
		modelAndView.addObject(this.getService().findOne(id));
		return modelAndView;
	}
	
}



















