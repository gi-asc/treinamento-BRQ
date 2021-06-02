package PT02E02;

public class Circulo implements formulasGeometria{
	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return this.getRaio()*this.getRaio()*3.14159;
	}

	@Override
	public double perimetro() {
		return this.getRaio()*2*3.14159;
	}
	
}
