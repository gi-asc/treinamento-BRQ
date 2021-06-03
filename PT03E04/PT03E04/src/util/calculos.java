package util;

public abstract class calculos {
	
	public static double fatorial(double x) {
		double count = x;
		while(count>1){
			count--;
			x*=count;
		}
		return x;
	}
}
