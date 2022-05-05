package Java_Project;

public final class Engenheiro extends Funcionario{
	private String departamento;
	private int CREA;
	
	public Engenheiro(int codigo, String nome) {
		super(codigo, nome);
	}
    public String toString() {	
        return "Codigo: " + getCodigo() + "\nNome: " + getNome() + "\nDepartamento: " + getDepartamento() + "\nCREA: " + getCREA() + "\nSalario: " +  super.getSalario();
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
	public void setCREA(int numero) {
		CREA = numero;
	}

	public void setSalario(double salario) {
		super.setSalario(salario + salario * 0.5);
	}
	
	
}
