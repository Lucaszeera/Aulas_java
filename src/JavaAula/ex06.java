package aula_06;

import javax.swing.JOptionPane;

public class ex06 {
	public static void main(String[] args) {
		int populacao = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor da popula��o mundial"));
		double taxa = Integer.valueOf(JOptionPane.showInputDialog("Digite a taxa de crescimento anual da popula��o"));
		double taxaAnual = populacao;
		for(int a = 5; a >= 1; a--) {
			taxaAnual += (taxa / 100 * populacao); // vai acrescentar a porcentagem em rela��o ao ano atual do codigo
			System.out.println(taxaAnual);
			populacao += (taxa / 100 * populacao); // vai atualizar a popula��o do ano atual
		}
		System.out.println("O ano � " + taxaAnual);
	}
}
