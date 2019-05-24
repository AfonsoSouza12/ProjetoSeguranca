package br.edu.utfpr.pb.projetoSeguranca.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "serie")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
public class Serie implements Serializable{
	private static final long serialVersionUID = -7543363605557353088L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "Preencha o campo nome!")
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	
	@NotEmpty(message = "Preencha o campo resumo!")
	@Column(name = "resumo", length = 1024, nullable = false)
	private String resumo;
	
	@NotNull(message = "Preencha o campo data de estréia!")
	@Column(name = "data_estreia", nullable = false)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataEstreia;
	
	@Column(name = "data_encerramento", nullable = true)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataEncerramento;
	
	@NotNull(message = "Preencha o campo nota!")
	@Column(name = "nota", nullable = false)
	private BigDecimal nota;
	
	@NotNull(message = "Preencha o campo produtora!")
	@ManyToOne
	@JoinColumn(name = "produtora_id", referencedColumnName = "id")
	private Produtora produtora;
	
	@NotNull(message = "Preencha o campo genero!")
	@ManyToOne
	@JoinColumn(name = "genero_id", referencedColumnName = "id")
	private Genero genero;
	
	@Column(name = "imagem", length = 100, nullable = true)
	private String imagem;
}







