package model;

public class ContaCorrenteEspecial extends ContaCorrente {

	private Double TAXA_OPERACAO_ESPECIAL = 0.01;
	
	public double Saque(double saque){
		Double taxa = saque * TAXA_OPERACAO_ESPECIAL;
		return saldo = saldo - (saque + taxa);
	}
}
