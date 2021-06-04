package Entities;

public class Batalha {
	
	public static void jogar(NavioDeGuerra n1, NavioDeGuerra n2) {
		if(n2.getBlindagem()>0) {
			System.out.println("Ataque do navio " + n1.nome);
			n1.atacar(n2);
			System.out.println("Nova blindagem de " + n2.nome + ": " + n2.getBlindagem());
			if(n1.getBlindagem()>0) {
				System.out.println("Ataque do navio " + n2.nome);
				n2.atacar(n1);
				System.out.println("Nova blindagem de " + n2.nome + ": " + n2.getBlindagem());
				Batalha.jogar(n1, n2);
			}else {
				System.out.println("Fim do jogo! Navio campeão: " + n2.nome);
			}
		}else {
			System.out.println("Fim do jogo! Navio campeão: " + n1.nome);
		}
	}

}
