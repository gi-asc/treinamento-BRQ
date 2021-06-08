import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		FabricaLampada fabrica = new FabricaLampada();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite O tipo: ");
		try {
			String t = sc.nextLine().toUpperCase();
			Lampada lampada = fabrica.construirLampada(Tipos.valueOf(t));
			lampada.ligar();
			lampada.desligar();
		}
		catch(IllegalArgumentException e) {
			e = new invalidTypeException();
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
