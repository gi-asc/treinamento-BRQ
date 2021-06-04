
public class Main {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();
		
		try {
			v1.acelera(101);
		System.out.println("A velocidade atual é " + v1.getVelocidade()+ "km/h.");
		}catch(VelocidadeAcimaException e) {
			e = new VelocidadeAcimaException();
			System.out.println(e.getMessage());
		}

	}

}
