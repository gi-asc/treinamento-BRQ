package parte1;

public class Celsius {
	
	private double celsius;
	private double fahrenheit;
	private double kevin;
	private double reaumur;
	private double rankine;
	
	public Celsius(double temperatura) {
		this.celsius = (temperatura);
		this.fahrenheit = temperatura * 1.8 + 32;
		this.kevin = temperatura + 273.5;
		this.reaumur = temperatura * 1.8 + 32 + 459.67;
		this.rankine = temperatura * 0.8;
		
	}

	public double getCelsius() {
		return celsius;
	}
	
	public double getFahrenheit() {
		return fahrenheit;
	}

	public double getReaumur() {
		return reaumur;
	}

	public double getKevin() {
		return kevin;
	}

	public double getRankine() {
		return rankine;
	}

}
