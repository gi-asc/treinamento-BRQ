package Entities;

public class Cruzador extends NavioDeGuerra {
	
	private int numCanhoes;

	public Cruzador(int numTripulantes, String nome, double ataque, double blindagem, int numCanhoes) {
		super(numTripulantes, nome, ataque, blindagem);
		this.numCanhoes = numCanhoes;
	}

	@Override
	public double poderDeFogo() {
		return this.numCanhoes * this.ataque;
	}

	public int getNumCanhoes() {
		return numCanhoes;
	}

}
