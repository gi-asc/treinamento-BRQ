import java.util.List;

public class Cosseno {
private double angle;
private List<Double> parcelas;
private double cosseno;

public Cosseno(double angle) {
	this.angle = angle;
	this.parcelas = calculos.parc(angle);
	this.parcelas.add(0, 1.0);
	this.cosseno = this.parcelas.stream().reduce((a, b) -> a+b).get();
}

public double getAngle() {
	return angle;
}
public List<Double> getParcelas() {
	return parcelas;
}
public double getCosseno() {
	return cosseno;
}
public String toString() {
	return "Angulo(em Radianos): " + this.angle
			+"\nParcelas: " + this.parcelas
			+"\nCosseno: " + this.cosseno;
}

}
