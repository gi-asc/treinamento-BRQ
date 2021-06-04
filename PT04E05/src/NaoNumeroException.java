
public class NaoNumeroException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Não é número.";
	}
}
