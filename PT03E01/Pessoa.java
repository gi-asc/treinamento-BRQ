package PT03E01;

public class Pessoa {
private int id;
private String nome;
private double altura;

public Pessoa(int id, String nome, double altura) {
	this.id = id;
	this.nome = nome;
	this.altura = altura;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
public int getId() {
	return id;
}

public static double alturaMedia(Pessoa[] grupo) {
	double total = 0;
	for(int i=0; i<grupo.length; i++) {
		total += grupo[i].getAltura();
	}
	return total/grupo.length;
}

}
