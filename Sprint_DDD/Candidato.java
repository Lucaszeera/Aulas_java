package Sprint_DDD;

public final class Candidato extends Perfis{
	private String genero;
	private String cpf;
	private int idade;
	private String estadoCivil;
	
	public Candidato(String nome, String email, int telefone, int idade, String estadoCivil, String genero, String cpf, String usuario, String senha) {
		super(nome, email, telefone, usuario, senha);
		this.setGenero(genero);
		this.cpf = cpf;
		this.idade = idade;
		this.estadoCivil = estadoCivil;
		}
	@Override
	public String toString() {
		return "Nome: " + getNome() + ", " + idade + " anos, " + estadoCivil + "\nEmail: " + getEmail() + "\nTelefone: " + getTelefone() + "\n";
	}

	public String getCpf() {
		return cpf;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}	
