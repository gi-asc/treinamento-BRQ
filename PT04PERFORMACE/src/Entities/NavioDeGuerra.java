package Entities;

public abstract class NavioDeGuerra extends Navio {
	
	protected double ataque;
	protected double blindagem;

	public NavioDeGuerra(int numTripulantes, String nome, double ataque, double blindagem) {
		super(numTripulantes, nome);
		this.ataque = ataque;
		this.blindagem = blindagem;
	}
	
	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}

	public double getBlindagem() {
		return blindagem;
	}

	public void setBlindagem(double blindagem) {
		this.blindagem = blindagem;
	}

	public void mostrarArmas() {
		this.exibirInfoGeral();
		System.out.println("Ataque: " + this.ataque + "\nBlindagem: " + this.blindagem + "\nPoder de fogo: " + this.poderDeFogo());
	}

	public abstract double poderDeFogo();

public void atacar(NavioDeGuerra op) {
	double atk = Math.random() * this.poderDeFogo();
    double blind = op.getBlindagem() - atk;
    op.setBlindagem(blind);
}

}