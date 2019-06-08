package br.edu.utfpr.pb.projetoSeguranca.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.edu.utfpr.pb.projetoSeguranca.model.Usuario;
import br.edu.utfpr.pb.projetoSeguranca.repository.UsuarioRepository;
import br.edu.utfpr.pb.projetoSeguranca.service.UsuarioService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl extends CrudServiceImpl<Usuario, Long> 
		implements UsuarioService, UserDetailsService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	protected JpaRepository<Usuario, Long> getRepository() {
		return usuarioRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByUsername(username);
		if (usuario == null) {
			throw new UsernameNotFoundException("Usuário não "
					+ "encontrado!");
		}
		return usuario;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Usuario findByUsername(String username) {
		return usuarioRepository.findByUsername(username);
	}
}
