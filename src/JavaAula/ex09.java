package aula_06;

import javax.swing.JOptionPane;

public class ex09 {
	public static void main(String[] args) {
		int anos = 0;
		long mundial = Long.valueOf(JOptionPane.showInputDialog("Digite a população mundial: "));
		double taxa = Integer.valueOf(JOptionPane.showInputDialog("Digite a taxa de crescimento anual da população: "));
		long fim = mundial;
		double anual = (taxa / 100 * 5) * mundial;
		while(fim < (11000000 * 1000)) {
			fim += anual;
			//System.out.println("A população mundial está crescendo.");
			anos ++;
			System.out.println("");
		}
		System.out.println("Em " + anos + " anos , A população mundial terá ultrapassado a marca de 11 bilhões, sendo exatamente: " + fim);
	}
}
