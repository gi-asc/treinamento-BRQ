
public class VelocidadeAcimaException extends Exception {

	private static final long serialVersionUID = 1L;
	
	@Override
public String getMessage() {
		return "Velocidade acima do máximo.";
	}
}
