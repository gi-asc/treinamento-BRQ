import entities.Homem;
import entities.Mulher;
import entities.Pesquisa;
import entities.Pessoa;
import enums.Resposta;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Mulher(Resposta.SIM);
		Pessoa p2 = new Mulher(Resposta.NAO);
		Pessoa p3 = new Mulher(Resposta.NAO);
		Pessoa p4 = new Mulher(Resposta.NAO);
		Pessoa p5 = new Homem(Resposta.SIM);
		Pessoa p6 = new Homem(Resposta.NAO);
		Pessoa p7 = new Homem(Resposta.SIM);
		Pessoa p8 = new Homem(Resposta.SIM);

		Pesquisa a = new Pesquisa(p1);
		Pesquisa b = new Pesquisa(p2);
		Pesquisa c = new Pesquisa(p3);
		Pesquisa d = new Pesquisa(p4);
		Pesquisa e = new Pesquisa(p5);
		Pesquisa f = new Pesquisa(p6);
		Pesquisa g = new Pesquisa(p7);
		Pesquisa h = new Pesquisa(p8);
		
		System.out.println("Homens que responderam Não: " + Pesquisa.getNumeroHomensNao());
		System.out.println("Homens que responderam Sim: " + Pesquisa.getNumeroHomensSim());
		System.out.println("Mulheres que responderam Não: " + Pesquisa.getNumeroMulheresNao());
		System.out.println("Mulheres que responderam Sim: " + Pesquisa.getNumeroMulheresSim());
		System.out.println(h);
	}

}
