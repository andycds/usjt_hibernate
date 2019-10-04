package br.usjt.usjt_hibernate.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_conteudo")
@Getter @Setter
public class Conteudo {
	@Id
	@GeneratedValue
	private Long id;
	
	private String descricao;
	
	private String tipo;
	
	/*Comentado para o passo 5
	@ManyToMany
	private List<Usuario> usuarios;
	*/
	
	@OneToMany(mappedBy = "conteudo")
	private List<Consumo> consumos;
}
