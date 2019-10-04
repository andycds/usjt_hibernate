package br.usjt.usjt_hibernate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table (name = "tb_usuario")
@Getter @Setter @ToString
public class Usuario {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false, length=200)
	private String nome;
	
	@Column(nullable=false, length=30)
	private String fone;
	
	@Column(nullable=true, length=100)
	private String email;
	
	@OneToOne(optional = false, cascade = CascadeType.ALL)//Passo 4
	@JoinColumn (name = "id_do_meu_perfil")
	private Perfil perfil;
	
	/* Comentado para o passo 5
	@ManyToMany(cascade = CascadeType.ALL)//Passo 4
	@JoinTable(name = "tb_usuario_conteudo", 
	joinColumns = @JoinColumn(name="id_usuario"), 
	inverseJoinColumns = @JoinColumn(name = "id_consumo"))
	private List<Conteudo> conteudos;
	*/
	
	@OneToMany(mappedBy = "usuario")
	private List<Consumo> consumos;
}