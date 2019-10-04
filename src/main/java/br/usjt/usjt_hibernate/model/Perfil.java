package br.usjt.usjt_hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table (name = "tb_perfil")
@Getter @Setter @ToString
public class Perfil {
	@Id
	@GeneratedValue
	private Long id;
	
	private String descricao;
	
	@OneToOne(mappedBy = "perfil") // nome Java do atributo de Usuario que relaciona o perfil
	private Usuario usuario;
}