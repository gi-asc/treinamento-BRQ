package entities;

import enums.Gender;
import enums.Resposta;

public abstract class Pessoa {
	
private Gender genero;
private Resposta resposta;
protected Pessoa (Resposta resposta, Gender genero) {
	this.genero = genero;
this.resposta = resposta;
}
public Resposta getResposta() {
	return resposta;
}
public void setResposta(Resposta resposta) {
	this.resposta = resposta;
}
public Gender getGenero() {
	return genero;
}
public void setGenero(Gender genero) {
	this.genero = genero;
}

}
