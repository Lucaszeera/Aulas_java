package Empresa;

public final class Engenheiro extends Funcionarios{
	private String departamento;
	private int CREA;
	
	public Engenheiro(int codigo, String nome, int CREA) {
		super(codigo, nome);
		this.CREA = CREA;
	}
    public String toString() {	
        return "Codigo: " + getCodigo() + "\nNome: " + getNome() + "\nDepartamento: " + getDepartamento() + "\nCREA: " + getCREA() + "\nSalario: R$" +  (super.getSalario() + super.getSalario() * 0.5) + "\n";
    }
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getCREA() {
		return CREA;
	}
}
