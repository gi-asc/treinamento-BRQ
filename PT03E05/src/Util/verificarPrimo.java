package Util;

public abstract class verificarPrimo {
public static boolean[] verifica(boolean[] x) {
	for(int i = 0; i<x.length; i++) {
		x[i] = true;
		if((i<=1)||((i%2==0)&&(i!=2))||((i%3==0)&&(i!=3))||((i%5==0)&&(i!=5))||((i%7==0)&&(i!=7))||((i%11==0)&&(i!=11))) {
			x[i] = false;
		}
	}
	return x;
}
}
