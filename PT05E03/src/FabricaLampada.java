
public class FabricaLampada {

	public class Fluorescente implements Lampada{

		@Override
		public void ligar() {
		System.out.println("Ligando Lampada Fluorescente");
			
		}

		@Override
		public void desligar() {
			System.out.println("Desligando Lampada Fluorescente");
			
		}
		
	}
	public class Incandescente implements Lampada{

		@Override
		public void ligar() {
		System.out.println("Ligando Lampada Incandescente");
			
		}

		@Override
		public void desligar() {
			System.out.println("Desligando Lampada Incandescente");
			
		}
		
	}
	
	public Lampada construirLampada(Tipos tipo) throws invalidTypeException {
		if(tipo.equals(Tipos.FLUORESCENTE)) {
			return new Fluorescente();
		}else if(tipo.equals(Tipos.INCANDESCENTE)){
			return new Incandescente();
		}else {
			throw new invalidTypeException();
		}
	}
	
}
