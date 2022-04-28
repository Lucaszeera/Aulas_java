package Jogo;

public class Historia {

	public static void main(String[] args) {
		Jogador lucas = new Jogador("Lucas");
		lucas.setHp(132456);
		lucas.setXp(100);
		lucas.isEnvenenado();
		
		lucas.mostrar();
		
		Jogador cellbit = new Jogador("Cellbit");
		cellbit.setHp(2000);
		cellbit.setXp(10);
		cellbit.isEnvenenado();
		cellbit.receberAntidoto();
		
		cellbit.receberDano(600);
		cellbit.beberPocao(50);
		cellbit.receberDano(1700);
}}
