package service.contaService;

import model.contaModel.Conta;

public class OperacaoService {

	public void deposito(Conta conta, double valorDeposito) {
		if (valorDeposito > 0) {
			conta.saldo = conta.saldo + valorDeposito;
		}
	}

	public void saque(Conta conta, double valorSaque) {
		if (valorSaque <= conta.saldo) {
			conta.saldo = conta.saldo - valorSaque;

		} else {
			System.out.println("Saque Negado!!! Valor solicitado superior ao seu saldo");
		}
	}

}
