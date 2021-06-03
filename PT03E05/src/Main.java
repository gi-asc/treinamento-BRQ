import Util.verificarPrimo;

public class Main {

	public static void main(String[] args) {
		boolean[] x = new boolean[40];
		x = verificarPrimo.verifica(x);
		for(int i = 0; i<x.length; i++) {
			System.out.println("Indice: " + i + " é primo? --> " + x[i]);
		}

	}

}
