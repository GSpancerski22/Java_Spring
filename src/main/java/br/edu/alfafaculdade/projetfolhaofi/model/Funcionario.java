package br.edu.alfafaculdade.projetfolhaofi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

@Entity
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Infome um nome valido!") 
	@Length(min = 4, max = 100)
	private String nome;
	
	@NotNull(message = "Informe o salario")
	private Double salario;
	
	private String cargo;

	@CPF(message = "Infome um CPF valido!")
	private String cpf;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "funcionario")
	private List<Endereco> enderecos;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "funcionario") 
    private List<Endereco> holerites;


	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Funcionario(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
