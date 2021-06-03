import java.util.Arrays;

public abstract class Estatistica {
public static double moda(double[] x) throws SemModaException, DuasModasException {
	double[] y = new double[x.length];
	
	for(int i = 0; i<y.length; i++) {
		for(int j = 0; j<y.length; j++) {
			if(x[j] == x[i]) {
				y[i]++;
			}
		}
	}
	
	for(int m = 1; m<y.length; m++) {
		if(y[m]>y[m-1]) {
			x[0] = x[m];
			double q = y[m];
			y[m] = y[m-1];
			y[m-1] = q;
		}else if(y[m]==y[0]&&y[0]!=1) {
			throw new DuasModasException();
		}else {
			continue;
		}
	}
	
	if(y[0]>1) {
		return x[0];
	}else {
		throw new SemModaException();
	}
}

public static double[] ordenarArray(double[] a) {
	Arrays.sort(a);
	return a;
}

public static double media(double[] p) {
	double count = 0;
	for(double x : p) {
		count+=x;
	}
	return count/p.length;
}

public static double mediana(double[] h) {
	if(h.length%2==0) {
		return(h[(h.length/2 - 1)] + h[h.length/2]);
	}else {
		double division = (h.length/2) + 0.5;
		return h[(int)division];
	}
}

public static double variancia(double[] g) {
	double m = Estatistica.media(g);
	double[] dif = new double[g.length];
	for(int i = 0; i<dif.length; i++) {
		dif[i] = Math.pow((g[i] - m), 2);
	}
	
	return Estatistica.media(dif);
}

public static double desvioPadrao(double[] x) {
	return Math.sqrt(Estatistica.variancia(x));
}
}
