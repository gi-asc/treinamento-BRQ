package entities;

import java.util.Date;

public class Funcionario extends Pessoa{
	private String cargo;
	private double salario;
	private Date dataAdmissao;
	
	public Funcionario(String nome, String cpf, Date dataNascimento, String cargo, double salario, Date dataAdmissao) {
		super(nome, cpf, dataNascimento);
		this.cargo = cargo;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	

}
