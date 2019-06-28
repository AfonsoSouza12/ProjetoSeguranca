package br.edu.utfpr.pb.projetoSeguranca;

import br.edu.utfpr.pb.projetoSeguranca.config.CrudAuditorAware;
import br.edu.utfpr.pb.projetoSeguranca.model.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ProjetoSegurancaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSegurancaApplication.class, args);
	}

	@Bean
	public LayoutDialect layoutDialect() {
	    return new LayoutDialect();
	}

	@Bean
	public AuditorAware<Usuario> auditorProvider() {
		return new CrudAuditorAware();
	}
}
