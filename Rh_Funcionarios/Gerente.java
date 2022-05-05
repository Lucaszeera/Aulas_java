package Java_Project;

public final class Gerente extends Funcionario{
	private String area;
	private double bonus;
	
	public Gerente(int codigo, String nome) {
		super(codigo, nome);
	}
	public String toString() {	
        return "Codigo: " + getCodigo() + "\nNome: " + getNome() + "\nArea: " + getArea() + "\n\nSalario: R$" + getSalario(); 
    }
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public void setSalario(double salario) {
		salario = salario + bonus;
	}
	
	
}
