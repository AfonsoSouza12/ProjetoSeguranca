package br.edu.utfpr.pb.projetoSeguranca.repository;

import br.edu.utfpr.pb.projetoSeguranca.audit.GeneroAud;
import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.pb.projetoSeguranca.model.Genero;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GeneroRepository extends JpaRepository<Genero, Integer>{


}
