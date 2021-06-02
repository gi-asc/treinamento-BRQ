package parte1;

import java.util.Scanner;

import util.Calculos;

public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int h, m, s;
		System.out.println("Digite a hora");
		h = sc.nextInt();
		System.out.println("Digite os minutos");
		m = sc.nextInt();
		System.out.println("Digite os segundos");
		s = sc.nextInt();
		sc.close();
		
		verificarHora teste = new verificarHora(h,m,s);
		double seg = teste.contarSegundos();
		
		System.out.println("se passaram " + seg + " segundos desde 00h00");
		System.out.println(Calculos.dataPascoa(2010));
		System.out.println(Calculos.calcularAreaCirculo(3.7));
		System.out.println(Calculos.calcularCavalos(34.6, 100, 60));
		System.out.println(Calculos.calcularEmReal(5.6, 5, 6, 7, 8, 9, 10));
		System.out.println(Calculos.calcularPerimetroCirculo(3.7));
		System.out.println(Calculos.horasCaracol(25));
		System.out.println(Calculos.quantidadeAgua(10, 20, 30, 40));
		
		Celsius t1 = new Celsius(37);
		
		System.out.println(t1.getFahrenheit());
		System.out.println(t1.getKevin());
		System.out.println(t1.getRankine());
		System.out.println(t1.getReaumur());
	}

}
