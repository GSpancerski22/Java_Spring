package br.edu.alfafaculdade.projetfolhaofi.telas;

import java.util.Scanner;

import br.edu.alfafaculdade.projetfolhaofi.controller.FuncionarioController;
import br.edu.alfafaculdade.projetfolhaofi.model.Funcionario;

public class Principal {

	public  void principalRun(FuncionarioController controle) {
		Scanner ler = new Scanner(System.in);

		int opcao = 0;
	
		do {
			System.out.println("1 - Cadastrar Funcionario");
			System.out.println("2 - Calcular Folha");
			System.out.println("3 - Sair");

			opcao = ler.nextInt();

			switch (opcao) {
			case 1:
				Funcionario func = controle.salvar(CadastroFuncionario.cadastrar( ler));
				System.out.println("Funcion�rio cadastrado com sucesso!");
				System.out.println("O funcionario " + func.getNome()+ " foi cadastrado com sucesso!");
				break;
			case 2:
			        EmissaoHolerite.emitirHolerite(controle.listar(), ler).forEach(holerite -> {
					
					System.out.println("-------- " + holerite.getTipoFolha() + " --------");
					System.out.println("Funcion�rio: " + holerite.getFuncionario().getNome());
					System.out.println("Sal�rio: " + holerite.getFuncionario().getSalario());
					System.out.println("Compet�ncia: " + holerite.getCompetencia());
					
					holerite.getEventos().forEach(evento->{
						System.out.println(evento.toString());
					});
					
					System.out.println("Vencimentos: R$" + holerite.getVencimentos());
					System.out.println("Desconto: R$" + holerite.getDescontos());
					System.out.println("Total: R$" + holerite.getTotal());
					
					System.out.println("-");
				});
				break;
			case 3:
				break;
			default:
				System.out.println("Op��o invalida!");
				break;
			}

		} while (opcao != 3);

		ler.close();
	}

}
