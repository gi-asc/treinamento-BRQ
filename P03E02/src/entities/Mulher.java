package entities;

import enums.Gender;
import enums.Resposta;

public class Mulher extends Pessoa{
	
	public static final Gender genero = Gender.FEMININO;
	private boolean resposta;

	public Mulher(Resposta resposta) {
		super(resposta, Mulher.genero);
		this.resposta = resposta.isResposta();
	}

	public boolean isResposta() {
		return resposta;
	}
	

}
