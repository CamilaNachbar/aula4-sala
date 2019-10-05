package br.com.aula4.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "aluno")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idAluno;

	@Column(name = "nome_aluno", nullable = false)
	@NotNull
	@NotEmpty
	private String nome;

	@Column(name = "data_nascimento")
	private Date dataNascimento;

	@ManyToOne
	private Professor professor;

}
