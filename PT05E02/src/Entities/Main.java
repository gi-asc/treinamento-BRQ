package Entities;

public class Main {

	public static void main(String[] args) {
		Midia heresia = new CD(19.99, "Heresia", 10);
		Midia starWars = new DVD(19.99, "Star Wars - Trilogia I", 3);
		heresia.printDados();
		starWars.printDados();
	}
	

}
