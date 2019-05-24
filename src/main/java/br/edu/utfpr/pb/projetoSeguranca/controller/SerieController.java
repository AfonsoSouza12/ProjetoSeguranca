package br.edu.utfpr.pb.projetoSeguranca.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.edu.utfpr.pb.projetoSeguranca.model.Serie;
import br.edu.utfpr.pb.projetoSeguranca.service.CrudService;
import br.edu.utfpr.pb.projetoSeguranca.service.GeneroService;
import br.edu.utfpr.pb.projetoSeguranca.service.ProdutoraService;
import br.edu.utfpr.pb.projetoSeguranca.service.SerieService;

@Controller
@RequestMapping("serie")
public class SerieController extends CrudController<Serie, Long>{

	@Autowired
	private SerieService serieService;
	@Autowired
	private GeneroService generoService;
	@Autowired
	private ProdutoraService produtoraService;
	
	@Override
	protected CrudService<Serie, Long> getService() {
		return serieService;
	}

	@Override
	protected String getURL() {
		return "serie";
	}

	@Override
	@GetMapping("new")
	protected ModelAndView form(Serie serie) {
		ModelAndView modelAndView = new ModelAndView(this.getURL() + "/form");
		if (serie != null) {
			modelAndView.addObject(serie);
		}else {
			modelAndView.addObject(new Serie());
		}
		return modelAndView;
	}

	@Override
	@GetMapping("{id}")
	protected ModelAndView form(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView(this.getURL() + "/form");
		
		modelAndView.addObject(this.getService().findOne(id));
		return modelAndView;
	}
	
	@PostMapping("ajax")
	public ResponseEntity<?> save(@Valid Serie entity, BindingResult result){
		if ( result.hasErrors() ) {
			return new ResponseEntity<>(result.getAllErrors(), HttpStatus.BAD_REQUEST);
		}
		getService().save(entity);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("ajax/{id}")
	@ResponseBody
	public Serie edit(@PathVariable Long id) {
		return getService().findOne(id);
	}
	
	@Override
	@GetMapping("page")
	public ModelAndView list(@RequestParam("page") Optional<Integer> page,
							 @RequestParam("size") Optional<Integer> size) {
		int currentPage = page.orElse(1);
		int pageSize = size.orElse(5);
		
		Page<Serie> list = this.getService().findAll( 
				PageRequest.of(currentPage -1, pageSize) );
		
		ModelAndView modelAndView = new ModelAndView(this.getURL() + "/list");
		modelAndView.addObject("list", list);
		
		modelAndView.addObject("generos", generoService.findAll() );
		modelAndView.addObject("produtoras", produtoraService.findAll() );
		
		if( list.getTotalPages() > 0) {
			List<Integer> pageNumbers = IntStream
					.rangeClosed(1, list.getTotalPages())
					.boxed().collect(Collectors.toList());
			modelAndView.addObject("pageNumbers", pageNumbers);
		}
		return modelAndView;
	}
	
	//método para salvar com upload de arquivos
	@PostMapping("upload")
	public ResponseEntity<?> save(@Valid Serie entity, BindingResult result,
			@RequestParam("anexo") MultipartFile anexo,
			@RequestParam("anexos") MultipartFile[] anexos,
			HttpServletRequest request){
		
		if ( result.hasErrors() ) {
			return new ResponseEntity<>(result.getAllErrors(), HttpStatus.BAD_REQUEST);
		}
		getService().save(entity);
		
		if (anexo != null) {
			saveFile(entity.getId(), anexo, request);
		}
		if (anexos.length > 0) {
			saveFile(entity.getId(), anexos, request);
		}
		
		
		return new ResponseEntity<>(HttpStatus.OK);
	}

	private void saveFile(Long id, MultipartFile anexo, HttpServletRequest request) {
		File dir = new File(request.getServletContext().getRealPath("/images/"));
		if (!dir.exists()) { //verifica se o diretório de armazenamento existe
			dir.mkdirs(); //não existindo, cria o diretório
		}
		
		String caminhoAnexo = request.getServletContext().getRealPath("/images/");
		String extensao = anexo.getOriginalFilename().substring(
				anexo.getOriginalFilename().lastIndexOf("."),
				anexo.getOriginalFilename().length());
		
		String nomeArquivo = id + extensao;
		
		try {
			FileOutputStream fileOut = new FileOutputStream(
							new File (caminhoAnexo + nomeArquivo));
			
			BufferedOutputStream stream = new BufferedOutputStream(fileOut);
			stream.write(anexo.getBytes());
			stream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void saveFile(Long id, MultipartFile[] anexos, HttpServletRequest request) {
		File dir = new File(request.getServletContext().getRealPath("/images/"));
		if (!dir.exists()) { //verifica se o diretório de armazenamento existe
			dir.mkdirs(); //não existindo, cria o diretório
		}
		
		String caminhoAnexo = request.getServletContext().getRealPath("/images/");
		int i = 0;
		for (MultipartFile anexo : anexos) {
			i++;
			String extensao = anexo.getOriginalFilename().substring(
					anexo.getOriginalFilename().lastIndexOf("."),
					anexo.getOriginalFilename().length());
			
			String nomeArquivo = id + "_" + i + extensao;
			
			try {
				FileOutputStream fileOut = new FileOutputStream(
								new File (caminhoAnexo + nomeArquivo));
				
				BufferedOutputStream stream = new BufferedOutputStream(fileOut);
				stream.write(anexo.getBytes());
				stream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}