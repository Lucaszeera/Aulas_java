package aula_06;

import javax.swing.JOptionPane;

public class ex09 {
	public static void main(String[] args) {
		long populacao = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor da população mundial"));
		double taxa = Integer.valueOf(JOptionPane.showInputDialog("Digite a taxa de crescimento anual da população"));
		int anos = 0;
		while(populacao > 11000000 * 1000) {
			populacao += (taxa / 100 * populacao); // vai atualizar a população do ano atual
			System.out.println(populacao);
			anos ++;
		}
		System.out.println("Em " + anos + "  anos a população será estimada em: " + populacao);
	}
}
