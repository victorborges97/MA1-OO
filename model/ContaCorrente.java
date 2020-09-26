package model;

public class ContaCorrente {
	protected Double saldo=0.00;

	
	private Double TAXA_OPERACAO = 0.05;
	
	
	public double depositar(double deposito){
	   return saldo = saldo + deposito;
	}
	
	public double Saque(double saque){
		Double taxa = saque * TAXA_OPERACAO;
		return saldo = saldo - (saque + taxa);
	}
	
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	

}
