package br.edu.utfpr.pb.projetoSeguranca.service;

import br.edu.utfpr.pb.projetoSeguranca.audit.GeneroAud;
import br.edu.utfpr.pb.projetoSeguranca.model.Genero;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GeneroAudService  {

    @Query(value = "select  g.id, g.nome, g.revtype, g.created_by, g.modified_by From genero_aud as g", nativeQuery = true)
    List<GeneroAud> findByGeneroLog();

}
