package br.edu.utfpr.pb.projetoSeguranca.service.impl;

import br.edu.utfpr.pb.projetoSeguranca.audit.GeneroAud;
import br.edu.utfpr.pb.projetoSeguranca.model.Genero;
import br.edu.utfpr.pb.projetoSeguranca.repository.GeneroAudRepository;
import br.edu.utfpr.pb.projetoSeguranca.repository.GeneroRepository;
import br.edu.utfpr.pb.projetoSeguranca.service.GeneroAudService;
import br.edu.utfpr.pb.projetoSeguranca.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroAudServiceImpl
        implements GeneroAudService {

    @Autowired
    private GeneroAudRepository generoAudRepository;

    @Override
    public List<GeneroAud> findByGeneroLog() {
        return generoAudRepository.findByGeneroLog();
    }
}
