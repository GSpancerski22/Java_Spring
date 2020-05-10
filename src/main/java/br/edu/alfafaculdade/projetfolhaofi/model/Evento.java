package br.edu.alfafaculdade.projetfolhaofi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.edu.alfafaculdade.projetfolhaofi.model.Enuns.TipoEvento;

@Entity // Diz que esse calsse representa uma tabela no banco
public class Evento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private Double valor;
	private TipoEvento tipoEvento;

	@ManyToOne
	@JoinColumn(name = "holerite_id")
	private Holerite holerite;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Holerite getHolerite() {
		return holerite;
	}

	public void setHolerite(Holerite holerite) {
		this.holerite = holerite;
	}

	public Evento() {
		// TODO Auto-generated constructor stub
	}

	public Evento(String descricao, Double valor, TipoEvento tipoEvento) {
		this.descricao = descricao;
		this.valor = valor;
		this.tipoEvento = tipoEvento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public String toString() {
		return descricao + " - " + tipoEvento + " R$" + valor;
	}

}
