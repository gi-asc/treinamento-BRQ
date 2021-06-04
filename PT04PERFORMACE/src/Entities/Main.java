package Entities;

public class Main {

	public static void main(String[] args) {
		NavioDeGuerra n1 = new Cruzador(45, "Avalanche", 32, 455, 12);
		NavioDeGuerra n2 = new PortaAvioes(32, "Ninho de Águia", 43, 320, 12);
	Batalha.jogar(n1, n2);
	}

}
