package br.edu.alfafaculdade.projetfolhaofi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.alfafaculdade.projetfolhaofi.model.Funcionario;
import br.edu.alfafaculdade.projetfolhaofi.model.repository.FuncionarioRepository;

@RestController
@RequestMapping("funcionario")
public class FuncionarioController {
	 
	@Autowired
	FuncionarioRepository repository;
	
	public Funcionario salvar(Funcionario funcionario ) {
		return repository.save(funcionario);
	}
	
	@GetMapping("listar")
	public List<Funcionario> listar(){
		return repository.findAll();
	}
	
	public Funcionario buscarPorId(Long id) {
		return repository.getOne(id);
	}
	
	public Boolean remover(Funcionario funcionario) {
		repository.delete(funcionario);
		return true;
	}
}
