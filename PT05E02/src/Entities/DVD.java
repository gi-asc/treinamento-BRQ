package Entities;

public class DVD extends Midia {

	private int numFaixas;
	
	public DVD(double preco, String nome, int numFaixas) {
		super(preco, nome);
		this.numFaixas = numFaixas;
		this.codigo = count;
	}

	public DVD() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDetalhes() {
		return super.getDetalhes()
			   + "\n Número de faixas: " + this.numFaixas;
	}

	public int getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}

}
