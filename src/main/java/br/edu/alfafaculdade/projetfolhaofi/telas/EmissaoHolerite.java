package br.edu.alfafaculdade.projetfolhaofi.telas;

import java.util.List;
import java.util.Scanner;

import br.edu.alfafaculdade.projetfolhaofi.model.Funcionario;
import br.edu.alfafaculdade.projetfolhaofi.model.Holerite;
import br.edu.alfafaculdade.projetfolhaofi.model.interfaces.Calculo;
import br.edu.alfafaculdade.projetfolhaofi.model.process.CalculoFerias;
import br.edu.alfafaculdade.projetfolhaofi.model.process.CalculoSalario;

public class EmissaoHolerite {

	public static List<Holerite> emitirHolerite(List<Funcionario> funcionarios, Scanner ler) {
		System.out.println("Id Inicio:");
		Long idInicio = ler.nextLong();

		System.out.println("Id Fim:");
		Long idFim = ler.nextLong();

		System.out.println("Compet�ncia: ");
		Integer competencia = ler.nextInt();

		System.out.println("1 - Sal�rio");
		System.out.println("2 - F�rias");
		System.out.println("3 - D�cimo Terceiro");
		int opcao = ler.nextInt();

		switch (opcao) {
		case 1:
			Calculo calculo = new CalculoSalario();
			return calculo.calcular(funcionarios, idInicio, idFim, competencia);
		case 2:
			Calculo calculoF = new CalculoFerias();
			return calculoF.calcular(funcionarios, idInicio, idFim, competencia);
		case 3:
			//Calculo calculoD = new CalculoDecimoTer();
			//return calculoD.calcular(funcionarios, idInicio, idFim, competencia);
		default:
			System.out.println("Op��o invalida!");
			break;
		}

		return null;
	}
}
