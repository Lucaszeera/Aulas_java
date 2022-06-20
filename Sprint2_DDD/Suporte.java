package Sprint_DDD;

public class Suporte extends Perfis{
	private int id;


	public Suporte(String nome, String email, int telefone, String usuario, String senha, int id) {
		super(nome, email, telefone, usuario, senha);
		this.id = id;
	}

	@Override
	public String toString() {
		return "Nome: " + super.getNome() + "ID: " + this.id + "\nEmail: " + super.getEmail() + "\nTelefone: " + super.getTelefone() ;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
