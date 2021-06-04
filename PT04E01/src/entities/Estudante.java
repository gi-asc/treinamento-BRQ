package entities;

import java.util.Date;

public class Estudante extends Pessoa{
	
	private String matricula;

	public Estudante(String nome, String cpf, Date dataNascimento, String matricula) {
		super(nome, cpf, dataNascimento);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public double tirarCopias(int qtd) {
		return qtd*0.07;
	}

}
