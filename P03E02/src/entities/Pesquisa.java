package entities;

import java.util.ArrayList;

public class Pesquisa {
	
	private static ArrayList<Pessoa> pessoas = new ArrayList<>();
	private int idPerson;
	private static int numeroMulheresSim;
	private static int numeroMulheresNao;
	private static int numeroHomensSim;
	private static int numeroHomensNao;
	
public Pesquisa (Pessoa pessoa) {
	Pesquisa.pessoas.add(pessoa);
	this.idPerson = Pesquisa.pessoas.indexOf(pessoa);
if(pessoa instanceof Mulher) {
	if(pessoa.getResposta().isResposta()) {
		Pesquisa.numeroMulheresSim++;
	}else{
		Pesquisa.numeroMulheresNao++;
	}
}else {
	if(pessoa.getResposta().isResposta()) {
		Pesquisa.numeroHomensSim++;
	}else {
		Pesquisa.numeroHomensNao++;
	}
}
}

public static ArrayList<Pessoa> getPessoas() {
	return pessoas;
}

public static int getNumeroMulheresSim() {
	return numeroMulheresSim;
}

public static int getNumeroMulheresNao() {
	return numeroMulheresNao;
}

public static int getNumeroHomensSim() {
	return numeroHomensSim;
}

public static int getNumeroHomensNao() {
	return numeroHomensNao;
}

public int getIdPerson() {
	return idPerson;
}

public String toString() {
	String text = "";
	for(Pessoa a : Pesquisa.getPessoas()) {
		text += "Id: " + Pesquisa.getPessoas().indexOf(a) + " Genero: " + a.getGenero().name() + " Resposta: " + a.getResposta().name() + "\n";
	}
	return text;
}

}
