package br.edu.utfpr.pb.projetoSeguranca.controller;


import br.edu.utfpr.pb.projetoSeguranca.model.Episodio;
import br.edu.utfpr.pb.projetoSeguranca.model.Usuario;
import br.edu.utfpr.pb.projetoSeguranca.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("episodio")
public class EpisodioController extends CrudController<Episodio, Long>{

    @Autowired
    private EpisodioService episodioService;
    @Autowired
    private SerieService SerieService;


    @Override
    protected CrudService<Episodio, Long> getService() {
        return episodioService;
    }

    @Override
    protected String getURL() {
        return "episodio";
    }

    @Override
    @GetMapping("new")
    protected ModelAndView form(Episodio entity) {
        ModelAndView modelAndView = new ModelAndView(getURL()+"/form");
        if(entity == null){
            modelAndView.addObject("episodio",new Episodio());
        }else{
            modelAndView.addObject("episodio",entity);
        }
        return modelAndView;
    }

    @Override
    protected ModelAndView form(Long aLong) {
        return null;
    }

    @GetMapping("ajax/{id}")
    @ResponseBody
    public Episodio edit(@PathVariable Long id){
        return getService().findOne(id);
    }


    @PostMapping("ajax")
    public ResponseEntity<?> saveAjax(@Valid Episodio entity, BindingResult result, RedirectAttributes attributes){
        if(result.hasErrors()){
            return new ResponseEntity<>(result.getAllErrors(), HttpStatus.BAD_REQUEST);
        }

        getService().save(entity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    @GetMapping("page")
    public ModelAndView list(@RequestParam("page") Optional<Integer> page,
                             @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(5);

        Page<Episodio> list = this.getService().findAll(
                PageRequest.of(currentPage -1, pageSize) );


        ModelAndView modelAndView = new ModelAndView(this.getURL() + "/list");
        modelAndView.addObject("list", list);
        modelAndView.addObject("series", SerieService.findAll());


        if( list.getTotalPages() > 0) {
            List<Integer> pageNumbers = IntStream
                    .rangeClosed(1, list.getTotalPages())
                    .boxed().collect(Collectors.toList());
            modelAndView.addObject("pageNumbers", pageNumbers);
        }
        return modelAndView;
    }
}
