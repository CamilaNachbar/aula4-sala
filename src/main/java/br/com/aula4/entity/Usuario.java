package br.com.aula4.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idUsuario;

	@Column(name = "nome_usuario", nullable = false)
	@NotNull
	@NotEmpty
	private String nome;

	@Column(name = "data_nascimento")
	private Date dataNascimento;

	@OneToOne(mappedBy = "usuario", 
	fetch = FetchType.LAZY, optional = false)
	private Professor professor;

}
