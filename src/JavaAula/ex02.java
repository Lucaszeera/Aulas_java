package JavaAula;

import javax.swing.JOptionPane;

public class ex02 {
public static void main(String[] args) {
	int numero1 = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero"));
	int numero2 = Integer.valueOf(JOptionPane.showInputDialog("Digite outro numero"));
	if(numero1 % numero2 == 0|| numero2 % numero1 == 0) {
		System.out.println("S�o multiplos");
	}else System.out.println("N�o s�o multiplos.");

	}
}
