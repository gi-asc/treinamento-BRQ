package PT02E05;

public class Relogio {
	
public static final int SEGUNDOS_MINUTO = 60;
public static final int SEGUNDOS_HORA = SEGUNDOS_MINUTO * 60;
public static final int SEGUNDOS_DIA = SEGUNDOS_HORA*24;

private int hora = 0;
private int minuto = 0;
private int segundo = 0;
private int segundosTotal;


public Relogio (int hora, int minuto, int segundo) {
	hora = Math.abs(hora);
	minuto = Math.abs(minuto);
	segundo = Math.abs(segundo);
    int total = (hora*3600) + (minuto*60) + segundo;
	
    if(total<SEGUNDOS_DIA) {
	if(segundo<SEGUNDOS_MINUTO) {
		this.segundo = segundo;
	}else {
		minuto++;
		this.segundo = segundo - SEGUNDOS_MINUTO;
	}
	
	if((minuto*60)<SEGUNDOS_HORA) {
		this.minuto = minuto;
	}else {
		hora++;
		this.minuto = minuto*60 - SEGUNDOS_HORA;
	}
	
	if(hora*3600<SEGUNDOS_DIA) {
		this.hora = hora;
	}else {
		this.hora = hora*3600 - SEGUNDOS_DIA;
	}
	this.segundosTotal = total;	
} else {
	int diaSeguinte = total - SEGUNDOS_DIA;
	int hora2 = diaSeguinte/3600;
	int minuto2 = (diaSeguinte - hora2*3600)/60;
	int segundo2 = (diaSeguinte - minuto2*60 - hora2*3600);
	
	this.hora = hora2;
	this.minuto = minuto2;
	this.segundo = segundo2;
}
}


public int getHora() {
	return hora;
}

public int getMinuto() {
	return minuto;
}

public int getSegundo() {
	return segundo;
}

public int getSegundosTotal() {
	return segundosTotal;
}


public void adiantaRelogio(int horas, int minutos, int segundos) {
	Relogio novo = new Relogio((this.getHora()+horas), (this.getMinuto()+minutos), (this.getSegundo()+segundos));
	this.hora = novo.hora;
	this.minuto = novo.minuto;
	this.segundo = novo.segundo;
	this.segundosTotal = novo.segundosTotal;
}

public void atrasaRelogio(int horas, int minutos, int segundos) {
	Relogio novo = new Relogio((this.getHora()-horas), (this.getMinuto()-minutos), (this.getSegundo()-segundos));
	this.hora = novo.hora;
	this.minuto = novo.minuto;
	this.segundo = novo.segundo;
	this.segundosTotal = novo.segundosTotal;
}

public void exibeHorario() {
	System.out.println(this.getHora() + ":" + this.getMinuto() + ":" + this.getSegundo());
}
}
