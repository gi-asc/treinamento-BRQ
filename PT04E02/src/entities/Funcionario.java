package entities;

public class Funcionario {
private String nome;
private String rg;
private double salarioMensal;

public Funcionario(String nome, String rg, double salarioMensal) {
	this.nome = nome;
	this.rg = rg;
	this.salarioMensal = salarioMensal;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getRg() {
	return rg;
}

public void setSalarioMensal(double salarioMensal) {
	this.salarioMensal = salarioMensal;
}

public final double pagamento() {
	return this.salarioMensal*0.85;
}

public void aumento(double aumento) {
	this.salarioMensal +=aumento;
}

}
