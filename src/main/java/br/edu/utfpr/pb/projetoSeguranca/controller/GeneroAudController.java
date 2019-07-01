package br.edu.utfpr.pb.projetoSeguranca.controller;

import br.edu.utfpr.pb.projetoSeguranca.audit.GeneroAud;
import br.edu.utfpr.pb.projetoSeguranca.model.Genero;
import br.edu.utfpr.pb.projetoSeguranca.model.Serie;
import br.edu.utfpr.pb.projetoSeguranca.repository.GeneroAudRepository;
import br.edu.utfpr.pb.projetoSeguranca.service.GeneroAudService;
import br.edu.utfpr.pb.projetoSeguranca.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("genero_log")
public class GeneroAudController {

    @Autowired
    private GeneroAudRepository generoAudRepository;

    @Autowired
    private UsuarioService usuarioService;


    protected String getURL() {
        return "genero_log";
    }

    @GetMapping("audit")
    @ResponseBody
    public List<GeneroAud> outracoisa() {
        return generoAudRepository.findByGeneroLog();
    }

    @GetMapping("log")
    protected ModelAndView lista() {
        ModelAndView modelAndView = new ModelAndView(this.getURL() + "/list");

        modelAndView.addObject("generoLogs", generoAudRepository.findByGeneroLog() );
        modelAndView.addObject("usuarios", usuarioService.findAll() );
        return modelAndView;
    }




}
