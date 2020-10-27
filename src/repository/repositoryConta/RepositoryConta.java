package repository.repositoryConta;

import java.util.ArrayList;
import java.util.List;

import model.contaModel.Conta;

public class RepositoryConta {
	public List<Conta> lista = new ArrayList<Conta>();
	
	public Conta setConta(Conta conta) {
		lista.add(conta);
		return lista.get(0);
	}
}
