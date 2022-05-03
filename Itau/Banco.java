package Itau;
public class Banco {
	
public static void main(String[] args) {
	Conta conta= new Conta(12345);
	System.out.println(conta.getSaldo());
	
	ContaPoupanca contaPoupanca = new ContaPoupanca(123);
	System.out.println(contaPoupanca.getSaldo());
	
	ContaCorrente contaCorrente = new ContaCorrente(312);
	System.out.println(contaCorrente.getSaldo());

}}
