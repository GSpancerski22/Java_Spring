package br.edu.alfafaculdade.projetfolhaofi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.alfafaculdade.projetfolhaofi.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
