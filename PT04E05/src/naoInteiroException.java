
public class naoInteiroException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Não é inteiro.";
	}
}
