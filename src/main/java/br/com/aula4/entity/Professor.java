package br.com.aula4.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idProfessor;

	@Column(name = "materia")
	private String materia;

	@OneToOne
    @JoinColumn(name = "professor")
	private Usuario usuario;

	@OneToMany
	private List<Aluno> alunos;

}
