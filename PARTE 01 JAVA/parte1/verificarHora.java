package parte1;

public class verificarHora {
private int minuto;
private int segundo;
private int hora;
private Hora horaAtual;

public verificarHora(int h, int m, int s) {
	this.hora = h;
	this.minuto = m;
	this.segundo = s;
	if(h<24 && h>=0 && m>=0 && m<60) {
	this.horaAtual = new Hora(h, m, s);
	}else {
		System.out.println("Valores inválidos.");
	}
};

public double contarSegundos() {
	double segHora = ((this.horaAtual.hora)*3600 + (this.horaAtual.minuto)*60 + (this.horaAtual.segundo));
    return segHora;
}
	
	public int getSegundo() {
	return segundo;
}



	public int getMinuto() {
		return minuto;
	}



	public int getHora() {
		return hora;
	}



	public Hora getHoraAtual() {
		return horaAtual;
	}



	public void setHoraAtual(Hora horaAtual) {
		this.horaAtual = horaAtual;
	}



	public class Hora {
		
		int segundo;
		int minuto;
		int hora;
		
		private Hora(int h, int m, int s) {
			this.hora = h;
			this.minuto = m;
			this.segundo = s;
		};

	}
}
