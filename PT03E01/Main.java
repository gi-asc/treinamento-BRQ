package PT03E01;

public class Main {

	public static void main(String[] args) {
	Pessoa[] grupo = new Pessoa[3];
	grupo[0] = new Pessoa(0, "João Paulo", 1.77);
	grupo[1] = new Pessoa(1, "Maria Efigenia", 1.78);
	grupo[2] = new Pessoa(2, "Pedro Diogo", 1.98);
	
	System.out.printf("A altura media do grupo é: %.2f%n", Pessoa.alturaMedia(grupo));
	}

}
