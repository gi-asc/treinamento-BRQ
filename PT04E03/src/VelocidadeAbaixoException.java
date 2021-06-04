
public class VelocidadeAbaixoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	@Override
public String getMessage() {
		return "Velocidade abaixo do mínimo.";
	}
}
