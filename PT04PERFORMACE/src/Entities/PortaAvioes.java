package Entities;

public class PortaAvioes extends NavioDeGuerra {

	private int numAvioes;

	public PortaAvioes(int numTripulantes, String nome, double ataque, double blindagem, int numAvioes) {
		super(numTripulantes, nome, ataque, blindagem);
		this.numAvioes = numAvioes;
	}

	@Override
	public double poderDeFogo() {
		return this.numAvioes * this.ataque;
	}

	public int getNumAvioes() {
		return numAvioes;
	}
}
