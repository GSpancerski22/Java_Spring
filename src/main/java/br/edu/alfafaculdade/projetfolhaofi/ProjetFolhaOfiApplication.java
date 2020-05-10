package br.edu.alfafaculdade.projetfolhaofi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.alfafaculdade.projetfolhaofi.controller.FuncionarioController;
import br.edu.alfafaculdade.projetfolhaofi.telas.Principal;

@SpringBootApplication
public class ProjetFolhaOfiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProjetFolhaOfiApplication.class, args);
	}
	@Autowired
	FuncionarioController controle;
	

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.principalRun(controle);
		
	}

}
