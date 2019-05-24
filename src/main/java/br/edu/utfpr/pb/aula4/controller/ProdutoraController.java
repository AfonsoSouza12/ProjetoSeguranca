package br.edu.utfpr.pb.aula4.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.edu.utfpr.pb.aula4.model.Produtora;
import br.edu.utfpr.pb.aula4.service.CrudService;
import br.edu.utfpr.pb.aula4.service.ProdutoraService;

@Controller
@RequestMapping("produtora")
public class ProdutoraController 
		extends CrudController<Produtora, Integer>{

	@Autowired
	private ProdutoraService produtoraService;

	@Override
	protected CrudService<Produtora, Integer> getService() {
		return produtoraService;
	}

	@Override
	protected String getURL() {
		return "produtora";
	}

	@Override
	@GetMapping("new")
	protected ModelAndView form(Produtora produtora) {
		ModelAndView modelAndView = new ModelAndView(this.getURL() + "/form");
		if (produtora != null) {
			modelAndView.addObject(produtora);
		}else {
			modelAndView.addObject(new Produtora());
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
	
	@PostMapping("ajax")
	public ResponseEntity<?> save(@Valid Produtora entity, BindingResult result){
		if ( result.hasErrors() ) {
			return new ResponseEntity<>(result.getAllErrors(), HttpStatus.BAD_REQUEST);
		}
		getService().save(entity);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("ajax/{id}")
	@ResponseBody
	public Produtora edit(@PathVariable Integer id) {
		return getService().findOne(id);
	}
}



















