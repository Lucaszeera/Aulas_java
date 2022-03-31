package JavaAula;

import javax.swing.JOptionPane;

public class ex03 {
public static void main(String[] args) {
	double raio = Double.valueOf(JOptionPane.showInputDialog("Digite o valor do raio de um circulo"));
	double diametro = (raio * 2);
	double circunferencia = (2 * 3.14 * raio);
	double area = (3.14 * (raio*raio));
	System.out.println("O diametro desse circulo é: " + diametro);
	System.out.println("A circunferencia desse circulo é: " + circunferencia);
	System.out.println("A area desse circulo é: " + area);
}
}
