package br.edu.utfpr.pb.projetoSeguranca.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "genero")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString

@EntityListeners(AuditingEntityListener.class)
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
public class Genero implements Serializable{
	private static final long serialVersionUID = -8727132008984758268L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty(message = "Preencha o campo nome!")
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;

	@CreatedBy
	@ManyToOne
	@JoinColumn(name = "createdBy", updatable = false)
	private Usuario createdBy;

//	@CreatedDate


	@LastModifiedBy
	@ManyToOne
	@JoinColumn(name = "modifiedBy")
	private Usuario modifiedBy;

	//	@LastModifiedDate

}





