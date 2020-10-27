package service.contaService;

import java.util.List;

import model.contaModel.Conta;
import repository.repositoryConta.RepositoryConta;

public class ContaService {
	
	public Conta setConta(Conta conta) {
		RepositoryConta repository = new RepositoryConta();
		
		if(conta.cpf == "") {
			System.out.println("CPF é obrigatorio.");
		}
		Conta c = repository.setConta(conta);
		return c;
	}
}
