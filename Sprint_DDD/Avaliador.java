package Sprint_DDD;

public final class Avaliador extends Perfis{
	private String instituicao;
	private String cargo;
	
	public Avaliador(String nome, String email, int telefone, String usuario, String senha, String instituicao, String cargo) {
		super(nome, email, telefone, usuario, senha);
		this.setInstituicao(instituicao);
		this.setCargo(cargo);
	}
	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nCargo: " + cargo + " " + instituicao +  "\nEmail: " + getEmail() + "\nTelefone: " + getTelefone() + "\n";
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	
}
