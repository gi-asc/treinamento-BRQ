package Entities;

public class CD extends Midia {

	private int numMusicas;
	
	public CD(double preco, String nome, int numMusicas) {
		super(preco, nome);
		this.numMusicas = numMusicas;
		this.codigo = count;
	}

	public CD() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDetalhes() {
		return super.getDetalhes()
			   + "\n Número de Musicas: " + this.numMusicas;
	}

	public int getNumMusicas() {
		return numMusicas;
	}

	public void setNumMusicas(int numMusicas) {
		this.numMusicas = numMusicas;
	}

}
