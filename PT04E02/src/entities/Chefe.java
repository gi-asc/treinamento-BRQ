package entities;

public class Chefe extends Funcionario {
	private double contas;
	private double gastosExtras;
	private double adicionalChefia;
	
public Chefe(String nome, String rg, double salarioMensal) {
		super(nome, rg, salarioMensal);
	}

public double getContas() {
	return contas;
}

public void setContas(double contas) {
	this.contas = contas;
}

public double getGastosExtras() {
	return gastosExtras;
}

public void setGastosExtras(double gastosExtras) {
	this.gastosExtras = gastosExtras;
}

public double getAdicionalChefia() {
	return adicionalChefia;
}

public void setAdicionalChefia(double adicionalChefia) {
	this.adicionalChefia = adicionalChefia;
}

public double pagamentoExtra() {
	return this.pagamento() + this.adicionalChefia + this.contas + this.gastosExtras;
}
}
