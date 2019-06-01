package br.edu.utfpr.pb.projetoSeguranca.repository;


import br.edu.utfpr.pb.projetoSeguranca.model.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissaoRepository extends JpaRepository<Permissao, Integer> {

}
