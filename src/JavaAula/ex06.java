package JavaAula;

import javax.swing.JOptionPane;

public class ex06 {

	public static void main(String[] args) {
		int mundial = Integer.valueOf(JOptionPane.showInputDialog("Digite a popula��o mundial: "));
		int taxa = Integer.valueOf(JOptionPane.showInputDialog("Digite a taxa de crescimento anual da popula��o: "));
		double anual = (taxa / 100 * 5) * mundial;
		System.out.println(anual);
		
	}

}
