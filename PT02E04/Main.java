package PT02E04;

public class Main {
	
	public static void main(String[] args) {
		AlunoDisciplina a1 = new AlunoDisciplina(2, 5);
		AlunoDisciplina a2 = new AlunoDisciplina(4, 5);
		
		a1.setNota1(9.8);
		a1.setNota2(7.2);
		
		a2.setNota1(8.3);
		a2.setNota2(8.8);
		
		if(a1.mediaAritmetica()>a2.mediaAritmetica()) {
			System.out.println(a1.mediaAritmetica());
		}else {
			System.out.println(a2.mediaAritmetica());
		}
		
	if(a1.mediaPonderada()>a2.mediaPonderada()) {
		System.out.println(a1.mediaPonderada());
	}else {
		System.out.println(a2.mediaPonderada());
	}
}

}
