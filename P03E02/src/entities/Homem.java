package entities;

import enums.Gender;
import enums.Resposta;

public class Homem extends Pessoa {
	public static final Gender genero = Gender.MASCULINO;
	private boolean resposta;

	public Homem(Resposta resposta) {
		super(resposta, Homem.genero);
		this.resposta = resposta.isResposta();
	}

	public boolean isResposta() {
		return resposta;
	}
	
}
