package br.usjt.usjt_hibernate.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "tb_consumo")
@Getter @Setter 
public class Consumo {
	@Id
	@GeneratedValue
	private Long id;

	private Date dataHora;

	// Comentar Passo 5
	@ManyToOne
	private Feedback feedback;
	
	@ManyToOne(cascade = CascadeType.ALL) // Cascade necessário para o passo 5
	private Usuario usuario;
	
	@ManyToOne(cascade = CascadeType.ALL) // Cascade necessário para o passo 5
	private Conteudo conteudo;
}