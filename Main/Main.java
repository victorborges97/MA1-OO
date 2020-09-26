package Main;
import java.util.Scanner;

import model.ContaCorrente;
import model.ContaCorrenteEspecial;

public class Main {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente();
		
		System.out.println("Saldo conta corrente: " + conta1.getSaldo());
		
		//Inserir valor Deposito
		System.out.print("\n");
		Scanner inputDeposito = new Scanner(System.in);
		Double newSaldo;
		System.out.println("Insira um novo deposito: ");
		newSaldo = inputDeposito.nextDouble();
		conta1.depositar(newSaldo);

		
		
		//Novo Saldo da conta
		System.out.print("\n");
		System.out.print("Novo saldo conta corrente: " + conta1.getSaldo());
		
		
		
		//Inserir valor Saque
		System.out.print("\n");
		Scanner outSaque = new Scanner(System.in);
		Double newSaque;
		System.out.println("Insira valor para saque: ");
		newSaque = outSaque.nextDouble();
		conta1.Saque(newSaque);
		
		
		
		//Saldo após o saque
		System.out.print("\n");
		System.out.print("Saldo após o saque: "+conta1.getSaldo());
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("--------------------------------------------------");
		
		
		
		
		System.out.print("\n");
		ContaCorrenteEspecial contaE = new ContaCorrenteEspecial();
		
		//Inserir valor Deposito
		System.out.print("\n");
		Scanner inputEspecialDeposito = new Scanner(System.in);
		Double newEspecialSaldo;
		System.out.println("Insira um novo deposito: ");
		newEspecialSaldo = inputEspecialDeposito.nextDouble();
		contaE.depositar(newEspecialSaldo);

		
		
		System.out.print("\n");
		System.out.print("Saldo conta especial: " + contaE.getSaldo());
		
		
		
		
		//Inserir valor Saque
		System.out.print("\n");
		Scanner outEspecialSaque = new Scanner(System.in);
		Double newEspecialSaque;
		System.out.println("Insira valor para saque: ");
		newEspecialSaque = outEspecialSaque.nextDouble();
		contaE.Saque(newEspecialSaque);
		
		
		
		
		System.out.print("\n");
		System.out.print("Novo saldo conta especial: "+contaE.getSaldo());
	}

}
