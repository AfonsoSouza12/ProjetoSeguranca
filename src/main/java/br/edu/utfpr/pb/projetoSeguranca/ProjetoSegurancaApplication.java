package br.edu.utfpr.pb.projetoSeguranca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import nz.net.ultraq.thymeleaf.LayoutDialect;

@SpringBootApplication
public class ProjetoSegurancaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSegurancaApplication.class, args);
	}

	@Bean
	public LayoutDialect layoutDialect() {
	    return new LayoutDialect();
	}
}
