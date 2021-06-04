package Entities;

public class NavioMercante extends Navio {
	
	private double capacidadeCarga;
	private double carga;

	public NavioMercante(int numTripulantes, String nome, double capacidadeCarga) {
		super(numTripulantes, nome);
		this.capacidadeCarga = capacidadeCarga;
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	public void carregamento() {
	this.exibirInfoGeral();
	System.out.println("Volume: " + this.carga/this.capacidadeCarga);
	}
}
