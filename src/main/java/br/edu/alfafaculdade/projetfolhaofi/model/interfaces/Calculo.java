package br.edu.alfafaculdade.projetfolhaofi.model.interfaces;

import java.util.List;

import br.edu.alfafaculdade.projetfolhaofi.model.Funcionario;
import br.edu.alfafaculdade.projetfolhaofi.model.Holerite;

public interface Calculo {

	public abstract Holerite calcular(Funcionario func, Integer competencia);

	public abstract List<Holerite> calcular(List<Funcionario> funcionarios, 
			Long idInicio, Long idFim,	Integer competencia);
}
