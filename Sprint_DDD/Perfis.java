package Sprint_DDD;

public abstract class Perfis{
	
	private String nome;
	private String email;
	private int telefone;
	private String usuario;
	private String senha;
	
	public Perfis(String nome, String email, int telefone, String usuario, String senha) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.usuario = usuario;
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Nome: " + nome + "\nEmail: " + email + "\nTelefone: " + telefone + "\n";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome, String senha) {
		if(senha == this.senha){
			this.nome = nome;
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email, String senha) {
		if(senha == this.senha)this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
