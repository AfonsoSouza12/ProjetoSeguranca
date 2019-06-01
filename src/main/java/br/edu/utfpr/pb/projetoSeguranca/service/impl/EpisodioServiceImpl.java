package br.edu.utfpr.pb.projetoSeguranca.service.impl;


import br.edu.utfpr.pb.projetoSeguranca.model.Episodio;
import br.edu.utfpr.pb.projetoSeguranca.repository.EpisodioRepository;
import br.edu.utfpr.pb.projetoSeguranca.service.EpisodioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EpisodioServiceImpl extends CrudServiceImpl<Episodio, Long>
		implements EpisodioService {

	@Autowired
	private EpisodioRepository episodioRepository;
	
	@Override
	protected JpaRepository<Episodio, Long> getRepository() {
		return episodioRepository;
	}

}
