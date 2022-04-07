package aula_06;

import javax.swing.JOptionPane;

public class ex06 {
	public static void main(String[] args) {
		int populacao = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor da população mundial"));
		double taxa = Integer.valueOf(JOptionPane.showInputDialog("Digite a taxa de crescimento anual da população"));
		double taxaAnual = populacao;
		for(int a = 5; a >= 1; a--) {
			taxaAnual += (taxa / 100 * populacao); // vai acrescentar a porcentagem em relação ao ano atual do codigo
			System.out.println(taxaAnual);
			populacao += (taxa / 100 * populacao); // vai atualizar a população do ano atual
		}
		System.out.println("O ano é " + taxaAnual);
	}
}
