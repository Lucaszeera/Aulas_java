package Itau;

public class ContaEspecial extends Conta{
	private double limite;
	
	public ContaEspecial(int numero) {
		super(numero);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
