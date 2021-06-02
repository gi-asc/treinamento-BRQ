package PT02E01;

public class Funcionario {
	private String nome;
	private int codFunc;
	private double salarioMensal;
	
	public Funcionario(String nome, double salarioMensal, int codFunc) {
		this.nome = nome;
		this.salarioMensal = salarioMensal;
		this.codFunc = codFunc;
	}

	public String getNome() {
		return nome;
	}
	
	public void aumento(double porcent) {
		double novoSalario = this.getSalarioMensal()*((100 + porcent)*0.01);
		this.setSalarioMensal(novoSalario);
	}
	
	public String toString() {
		return "Nome: "
				+this.getNome()
				+ " Código: "
				+this.getCodFunc()
				+" Salário mensal: "
				+this.getSalarioMensal();
	}
	
	public double salarioAnual() {
		return this.getSalarioMensal()*12;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	private void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public int getCodFunc() {
		return codFunc;
	}
}