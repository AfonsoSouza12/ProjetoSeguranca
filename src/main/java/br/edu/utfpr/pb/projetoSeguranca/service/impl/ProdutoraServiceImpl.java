package br.edu.utfpr.pb.projetoSeguranca.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.utfpr.pb.projetoSeguranca.model.Produtora;
import br.edu.utfpr.pb.projetoSeguranca.repository.ProdutoraRepository;
import br.edu.utfpr.pb.projetoSeguranca.service.ProdutoraService;

@Service
public class ProdutoraServiceImpl extends CrudServiceImpl<Produtora, Integer> 
		implements ProdutoraService{

	@Autowired
	private ProdutoraRepository produtoraRepository;
	
	@Override
	protected JpaRepository<Produtora, Integer> getRepository() {
		return produtoraRepository;
	}

}
