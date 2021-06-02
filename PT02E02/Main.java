package PT02E02;

public class Main {

	public static void main(String[] args) {
		Circulo C1 = new Circulo(8.0);
		 Circulo C2 = new Circulo(5.0);
		 Triangulo T1 = new Triangulo(4.0, 5.0);
		 Triangulo T2 = new Triangulo(3.0,4.0);

		 System.out.println("Circulo 1 – raio = " + C1.getRaio() +
		 " area = " + C1.area() +
		 " perimetro = " + C1.perimetro());
		 System.out.println("Circulo 2 – raio = " + C2.getRaio() +
		 " area = " + C2.area() +
		 " perimetro = " + C2.perimetro());
		 System.out.println("Triangulo 1 – base = " + T1.getBase() +
		 " altura = " + T1.getAltura() +
		 " area = " + T1.area() +
		 " perimetro = " + T1.perimetro());
		 System.out.println("Triangulo 2 – base = " + T2.getBase() +
		 " altura = " + T2.getAltura() +
		 " area = " + T2.area() +
		 " perimetro = " + T2.perimetro());

	}

}
