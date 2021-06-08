
public enum Tipos {
FLUORESCENTE("fluorescente"),
INCANDESCENTE("incandescente");

private String valor;
private Tipos(String valor) {
	this.valor = valor;
}
public String getValor() {
	return valor;
}
}
