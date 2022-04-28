package Jogo;

public class Historia {

	public static void main(String[] args) {
		Jogador lucas = new Jogador("Lucas");
		lucas.setHp(1000);
		lucas.setXp(100);
		lucas.isEnvenenado();
		
		lucas.mostrar();
		
		Jogador cellbit = new Jogador("Cellbit");
		cellbit.setHp(2000);
		cellbit.setXp(-10);
		cellbit.isEnvenenado();
		
		System.out.println(lucas.isEnvenenado());
		lucas.mostrar();
		lucas.beberPocao(10);
 
		
}}
