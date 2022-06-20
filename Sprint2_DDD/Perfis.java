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
		if(usuario != ""&& usuario != null) this.setUsuario(usuario);
		if(senha != "" && senha != null)this.senha = senha;
		else System.err.println("Por favor, digite uma senha");
	}
	@Override
	public abstract String toString();
	
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
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
