package Entities;

public abstract class Navio {
protected int numTripulantes;
protected String nome;

public Navio(int numTripulantes, String nome) {
	this.numTripulantes = numTripulantes;
	this.nome = nome;
}

public void exibirInfoGeral() {
	System.out.println("Nome do návio: " + this.nome + "\n Quantidade de tripulantes: " + this.numTripulantes);
}
}
