package PT02E03;

public class ContaCorrente {
private int numCC;
private double saldo = 0;

public ContaCorrente(int numCC) {
	this.numCC = numCC;
}

public int getNumCC() {
	return numCC;
}

public void setNumCC(int numCC) {
	this.numCC = numCC;
}

public double getSaldo() {
	return saldo;
}

public void depositar(double valor) {
	this.saldo+=valor;
}

public void sacar(double valor) {
	if(this.saldo>0) {
	this.saldo-=valor;
}
}

}
