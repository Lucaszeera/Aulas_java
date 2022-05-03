package Itau;

public class Conta {
	private int numero;
	private double saldo;
	

	public Conta(int numero) {
		this.numero = numero;
}	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
