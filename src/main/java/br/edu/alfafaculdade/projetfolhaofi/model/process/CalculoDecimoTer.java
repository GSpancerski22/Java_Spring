package br.edu.alfafaculdade.projetfolhaofi.model.process;

import java.util.ArrayList;
import java.util.List;

import br.edu.alfafaculdade.projetfolhaofi.model.Evento;
import br.edu.alfafaculdade.projetfolhaofi.model.Funcionario;
import br.edu.alfafaculdade.projetfolhaofi.model.Holerite;
import br.edu.alfafaculdade.projetfolhaofi.model.Enuns.TipoEvento;
import br.edu.alfafaculdade.projetfolhaofi.model.Enuns.TipoFolha;
import br.edu.alfafaculdade.projetfolhaofi.model.interfaces.Calculo;

 class CalculoDecimoTer implements Calculo {

	@Override
	public Holerite calcular(Funcionario func, Integer competencia) {
	
		return null;
	}

	
	@Override
	public List<Holerite> calcular(List<Funcionario> funcionarios, Long idInicio, Long idFim, Integer competencia) {
		List<Holerite> holerites = new ArrayList<>();

		funcionarios.forEach(func -> {
			if (func.getId() >= idInicio && func.getId() <= idFim) {
				Holerite holerite = new Holerite(1l, func, TipoFolha.DECIMOTER, competencia);
				List<Evento> eventos = new ArrayList<>();

				Evento salarioDecTer = new Evento("Sal�rio 13º ", func.getSalario(), TipoEvento.PROVENTO);
				eventos.add(salarioDecTer);
				

				
				holerite.setEventos(eventos);
				holerites.add(holerite);
			}
		});

		return holerites;
	}

}
