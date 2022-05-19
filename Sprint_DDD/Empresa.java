package Sprint_DDD;

public final class Empresa extends Perfis{
	
	private int cnpj;
	
	public Empresa(String nome, String email, int telefone, String usuario, String senha, int cnpj) {
		super(nome, email, telefone, usuario, senha);
		this.cnpj = cnpj;
	}

	public int getCnpj() {
		return cnpj;
	}

	
	
}
