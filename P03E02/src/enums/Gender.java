package enums;

public enum Gender {
FEMININO(0),
MASCULINO(1);
	
private final int valor;
Gender(int valor){
	this.valor = valor;
}
public int getValor() {
	return valor;
}
}
