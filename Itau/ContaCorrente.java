package Itau;

public class ContaCorrente extends Conta {
	private double tarifa;

	public ContaCorrente(int numero) {
		super(numero);
	}
	
	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	
}
