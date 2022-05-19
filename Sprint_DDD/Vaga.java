package Sprint_DDD;

import java.util.ArrayList;

public class Vaga {
	private String nome;
	private String horario;
	private double salario;
	private String endereco;
	private int vagas;
	int vagaNumero = 0;
	/*String[] cpfs = new String[1];*/
	ArrayList<String> cpfs = new ArrayList<String>();
	
	public Vaga(String nome, String horario, double salario, String endereco, int vagas) {
		this.nome = nome;
		this.horario = horario;
		this.salario = salario;
		this.endereco = endereco;
		if(vagas > 0) this.vagas = vagas;
		else System.err.println("Valor inv�lido, digite a quantidade de vagas novamente.");
	};
	@Override
	public String toString() {
		return vagas + " vagas para: " + nome + "\nHorario: " + horario + "\nSalario: " + salario + "\nEndere�o: " + endereco + "\nVagas disponiveis: " + vagas + "\n";
	}
	public void candidatar(String cpf) {
		if(vagas > 0) {
			if(!cpf.isEmpty()) {
			cpfs.add(cpf);
			vagaNumero += 1;
			vagas += -1;	
			}else System.err.println("Vaga n�o concedida, informe o cpf corretamente.");
		}else System.err.println("N�o tem mais vagas dispon�veis");
	}
	
	
	public int getVagas() {
		return vagas;
	}


	public void setVagas(int vagas) {
		this.vagas = vagas;
	}


}
