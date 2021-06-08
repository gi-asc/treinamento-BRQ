package Entities;

public abstract class Midia {
protected static int count = 0;
protected int codigo;
protected double preco;
protected String nome;

public Midia(double preco, String nome) {
	this.preco = preco;
	this.nome = nome;
	count++;
}
public Midia() {
	count++;
}

public String getTipo() {
	return this.getClass().toString();
}

public String getDetalhes() {
	return "\nTipo: " + this.getTipo()
		   +"\nCódigo: " + this.codigo
		   +"\nNome: " + this.nome
		   +"\nPreço: " + this.preco;
}

public void printDados() {
	System.out.println(this.getDetalhes());
}

}
