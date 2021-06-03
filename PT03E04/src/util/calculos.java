package util;

public abstract class calculos {
	
	public static double fatorial(double x)
	{
	if (x == 1)
	return 1;
	else
	return x * fatorial(x-1);
	}
	
	public static double parcela(double a, double b) {
		return Math.pow(-1, b) * Math.pow(a, 2*b) / fatorial(2*b);
	}
}
