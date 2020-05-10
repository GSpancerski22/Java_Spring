package br.edu.alfafaculdade.projetfolhaofi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.edu.alfafaculdade.projetfolhaofi.model.Enuns.TipoEvento;
import br.edu.alfafaculdade.projetfolhaofi.model.Enuns.TipoFolha;

@Entity
public class Holerite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "funcionario_id")
	private Funcionario funcionario;
	
	private TipoFolha tipoFolha;
	
	private Integer competencia;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "holerite")
	private List<Evento> eventos;

	private Double vencimentos = new Double(0);
	private Double descontos = new Double(0);

	public Holerite() {
		// TODO Auto-generated constructor stub
	}

	public Holerite(Long id, Funcionario funcionario, TipoFolha tipoFolha, Integer competencia) {
		this.id = id;
		this.funcionario = funcionario;
		this.tipoFolha = tipoFolha;
		this.competencia = competencia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public TipoFolha getTipoFolha() {
		return tipoFolha;
	}

	public void setTipoFolha(TipoFolha tipoFolha) {
		this.tipoFolha = tipoFolha;
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {

		eventos.forEach(evento -> {
			if (evento.getTipoEvento().equals(TipoEvento.PROVENTO)) {
				vencimentos = vencimentos + evento.getValor();
			}

			if (evento.getTipoEvento().equals(TipoEvento.DESCONTO)) {
				descontos = descontos + evento.getValor();
			}
		});

		this.eventos = eventos;
	}

	public Double getVencimentos() {
		return vencimentos;
	}

	public Double getDescontos() {
		return descontos;
	}

	public Double getTotal() {
		return vencimentos - descontos;
	}

}
