package enums;

public enum Resposta {
SIM(true),
NAO(false);
	
	private boolean resposta;
	Resposta(boolean resposta){
		this.resposta = resposta;
	}
	public boolean isResposta() {
		return resposta;
	}
}
