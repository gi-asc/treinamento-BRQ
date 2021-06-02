package PT02E03;

public class Main {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente(13);
		ContaCorrente c2 = new ContaCorrente(188);
		c1.depositar(300);
		c2.depositar(5000);
		c1.sacar(18);
		c2.sacar(900);
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());

	}

}
