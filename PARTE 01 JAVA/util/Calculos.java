package util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Calculos {
	
	public static double calcularCavalos(double m, double h, double t){
		return (m*h/t)/745.6999;
	};
	
	public static double calcularEmReal(double d, int q1, int q2, int q3, int q4, int q5, int q6) {
		return (q1 + (q2*0.5) + (q3*0.25) + (q4*0.01) + (q5*0.005) + (q6*0.01)) * d;
	};
	
	public static double quantidadeAgua(double pp, double pg, double dp, double dg) {
		double pm = (pp +pg)/2;
		return dg*dp*pm*785;
	}
	
	public static double calcularAreaCirculo(double raio) {
		return 3.14159 * raio * raio;
	};
	public static double calcularPerimetroCirculo(double raio) {
		return 2*3.14159 * raio;
	}
	
	public static double horasCaracol(double distancia) {
		double tempo = distancia/1.5;
		return tempo;
	}
	
	public static Date dataPascoa(int ano) {
		int a = ano%19;
		int b = ano/100;
		int c = ano%100;
		int d = b/4;
		int e = b%4;
		int f = (b + 8)/25;
		int g = (b - f + 1)/3;
		int h = (19 * a + b - d - g + 15)%30;
		int i = c/4;
		int j = c%4;
		int k = (32 + 2 * e + 2 * i - h - j)%7;
		int l = (a + 11 * k + 22 * k)/451;
		int mes = (k + k - 7 * l + 114)/31;
		int dia = ((h + k - 7 * l + 114)%31)+1;
		Calendar pascoa = new GregorianCalendar();		
		pascoa.set(ano, mes, dia);
		Date dataPascoa = pascoa.getTime();
		return dataPascoa;
	}

}
