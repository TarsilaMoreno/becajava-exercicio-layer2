package layer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import model.contaModel.Conta;
import service.contaService.ContaService;
import service.contaService.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Conta conta = new Conta();
		ContaService contaService = new ContaService();

		System.out.println("Digite o nome: ");
		conta.nomeCliente = scanner.nextLine();

		System.out.println("Digite o numero da conta: ");
		conta.numero = scanner.nextLine();

		System.out.println("Digite o numero da agencia: ");
		conta.agencia = scanner.nextLine();

		System.out.println("Digite o numero do cpf: ");
		conta.cpf = scanner.nextLine();
		
		System.out.println("Valor deposito:" );

		OperacaoService operacaoService = new OperacaoService();
		double valorDeposito = Double.parseDouble(scanner.nextLine());
		operacaoService.deposito(conta, valorDeposito);
		
		System.out.println("Digite o valor do saque:" );

		double valorSaque = Double.parseDouble(scanner.nextLine());
		operacaoService.saque(conta, valorSaque);

		System.out.println("Seu saldo:" + conta.saldo);
		
		Conta c = contaService.setConta(conta);
		System.out.println("Nome: " + c.nomeCliente);
		System.out.println("CPF:" + c.cpf);
		System.out.println("Agência" + c.agencia);
		System.out.println("Numero da Conta" + c.numero);

	}

}
