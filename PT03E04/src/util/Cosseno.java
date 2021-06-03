package util;


public class Cosseno {
	private double y;
	private double[] parcelas = new double[10];
	private double cossenoY = 0;
	
	public Cosseno(double y) {
		this.y = y;
	}
	
	public void calculaParcelas() {
		this.parcelas[0] = 1;
		for(int i = 1; i<this.parcelas.length; i++) {
			this.parcelas[i] = calculos.parcela(this.y, i);
		}
	}

	public double getCossenoY() {
		return cossenoY;
	}

	public void setCossenoY() {
		for(int j = 0; j<this.parcelas.length; j++) {
				this.cossenoY+=this.parcelas[j];
		}
	}
}
