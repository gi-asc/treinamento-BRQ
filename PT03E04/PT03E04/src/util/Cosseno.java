package util;

public class Cosseno {
	
	private double x;
	private double[] parcelas = new double[9];
	private double cosseno = 1;
	
	public Cosseno(double x) {
		this.x = x;
		parcelas[0] = 1;
	}
	
	public void calculaParcelas() {
for(int i = 1; i<=parcelas.length; i++) {
	double num = -(1/calculos.fatorial(2*i))*Math.pow(x, (2*i));
	if(i>1 && (i%2!=0)) {
		parcelas[i-1] = Math.abs(num);
	}else {
		parcelas[i-1] = num;
	}
		}
	}
	
	public void somaParcelas() {
		this.calculaParcelas();
		for(double a : this.parcelas) {
			this.cosseno += (a);
		}
	}

	public double getX() {
		return x;
	}

	public double[] getParcelas() {
		return parcelas;
	}

	public double getCosseno() {
		return cosseno;
	}

}
