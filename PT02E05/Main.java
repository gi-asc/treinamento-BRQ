package PT02E05;

public class Main {

	public static void main(String[] args) {
Relogio r1 = new Relogio(23, 59, 59);
r1.exibeHorario();
r1.adiantaRelogio(1, 0, 0);
r1.exibeHorario();
r1.adiantaRelogio(0, 1, 0);
r1.exibeHorario();
	}

}
