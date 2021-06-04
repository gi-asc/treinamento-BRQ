package entities;

import java.util.Date;

public class Professor extends Pessoa{
	
	private double salario;
	private String disciplina;
	
public Professor(String nome, String cpf, Date dataNascimento, double salario, String disciplina) {
		super(nome, cpf, dataNascimento);
		this.setDisciplina(disciplina);
		this.setSalario(salario);
	}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

public String getDisciplina() {
	return disciplina;
}

public void setDisciplina(String disciplina) {
	this.disciplina = disciplina;
}


}
