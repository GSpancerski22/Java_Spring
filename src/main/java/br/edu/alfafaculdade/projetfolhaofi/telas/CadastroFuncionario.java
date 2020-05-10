package br.edu.alfafaculdade.projetfolhaofi.telas;

import java.util.Scanner;

import br.edu.alfafaculdade.projetfolhaofi.model.Funcionario;

public class CadastroFuncionario {

	public static Funcionario cadastrar( Scanner ler) {
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Informe o nome:");
		funcionario.setNome(ler.next());
		
		System.out.println("Informe o cargo:");
		funcionario.setCargo(ler.next());
		
		System.out.println("Informe o sal�rio:");
		funcionario.setSalario(ler.nextDouble());
	
		return funcionario;
	}

}
