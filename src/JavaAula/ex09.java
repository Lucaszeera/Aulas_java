package aula_06;

import javax.swing.JOptionPane;

public class ex09 {
	public static void main(String[] args) {
		int anos = 0;
		long mundial = Long.valueOf(JOptionPane.showInputDialog("Digite a popula��o mundial: "));
		double taxa = Integer.valueOf(JOptionPane.showInputDialog("Digite a taxa de crescimento anual da popula��o: "));
		long fim = mundial;
		double anual = (taxa / 100 * 5) * mundial;
		while(fim < (11000000 * 1000)) {
			fim += anual;
			//System.out.println("A popula��o mundial est� crescendo.");
			anos ++;
			System.out.println("");
		}
		System.out.println("Em " + anos + " anos , A popula��o mundial ter� ultrapassado a marca de 11 bilh�es, sendo exatamente: " + fim);
	}
}
