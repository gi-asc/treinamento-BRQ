
public class Calculadora {

	public static void main(String[] args) {
		Contas.mostraCalculo(new Soma(), 50, 18);
		Contas.mostraCalculo(new Subtracao(), 50, 18);
		Contas.mostraCalculo(new Multiplicacao(), 50, 18);
		Contas.mostraCalculo(new Divisao(), 50, 18);
		Contas.mostraCalculo(new Resto(), 50, 18);
	}

}
