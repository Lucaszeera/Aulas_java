package Itau;

public class ContaPoupanca extends Conta {
	private double taxaDeJuros;
	
	public ContaPoupanca(int numero) {
		super(numero);
	}
	
	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
		
	
	
	
}
