
public class invalidTypeException extends IllegalArgumentException {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Voc� passou um tipo inv�lido.";
	}
}
