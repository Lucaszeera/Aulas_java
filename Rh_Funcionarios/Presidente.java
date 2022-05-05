package Java_Project;

public final class Presidente extends Funcionario{
	private double valorCota;
	private double acoes;
	
	public Presidente(int codigo, String nome) {
		super(codigo, nome);
	}
	public String toString() {	
        return "Codigo: " + getCodigo() + "\nNome: " + getNome() + "\nInvestimento em ações: " + getAcoes() + "\nValor da cota de ações: " + getValorCota();
}	
	
	public double getValorCota() {
		return valorCota;
	}
	public void setValorCota(double valorCota) {
		this.valorCota = valorCota;
	}
	public double getAcoes() {
		return acoes;
	}
	public void setAcoes(double acoes) {
		this.acoes = acoes;
	}

	public void setSalario(double salario) {
		salario += valorCota * salario;
	}
	
}
