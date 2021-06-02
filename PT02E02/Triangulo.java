package PT02E02;

public class Triangulo implements formulasGeometria {
	private double base;
	private double altura;
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return this.getBase() * this.getAltura()/2;
	}

	@Override
	public double perimetro() {
		return this.getBase() + this.getAltura() + Math.sqrt(this.getBase()*this.getBase()+this.getAltura()*this.getAltura());
	}

}
