package br.usjt.usjt_hibernate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tb_feedback")
@Getter @Setter @ToString
public class Feedback {
	@Id
	@GeneratedValue
	private Long id;

	private String descricao;
	
	@OneToMany(mappedBy = "feedback", cascade = CascadeType.ALL) //ao colocar o cascadeType.ALL tb_consumo
	// também é preenchido no TesteInsereDoisConsumosUmFeedBack
	private List<Consumo> consumos;
}