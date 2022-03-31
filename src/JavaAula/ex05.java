package JavaAula;

import javax.swing.JOptionPane;

public class ex05 {

	public static void main(String[] args) {
		int num = 0;
		int positivo = 0;
		int negativo = 0;
		int zero = 0;
		
		for(int a = 1; a <=5; a++) {
			num = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero: "));
			if(num > 0) positivo++;
			if(num < 0) negativo++;
			if(num == 0) zero++;
		}	
		System.out.println("Existem " + positivo + " numeros positivos, " + negativo + " numeros negativos, e " + zero + " numeros 'zeros'");
	}
}
