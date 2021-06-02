package PT02PERFORMACE;

public abstract class Calculadora {

	private static double memoria = 0;

	public static double getMemoria() {
		return memoria;
	}
	
	public static double somar(double n1) {
		memoria+=n1;
		return memoria;
	}
	
	public static double subtrair(double n1) {
		memoria-=n1;
		return memoria;
	}
	
	public static double multiplicar(double n1) {
		memoria*=n1;
		return memoria;
	}
	
	public static double dividir(double n1) {
		memoria/=n1;
		return memoria;
	}

	public static double valorInicial(double n1) {
		memoria=n1;
		return memoria;
	}
	
	public static void exibeMemoria() {
		System.out.println(memoria);
	}
}
