
public class Main {

	public static void main(String[] args) {
		double[] teste = {1, 6, 18, 23, 12, 1};
		
		try {
System.out.println(Estatistica.moda(teste));
		}
		catch(DuasModasException e) {
			e = new DuasModasException();
			System.out.println(e.getMessage());;
		}
catch(SemModaException e) {
	e = new SemModaException();
	System.out.println(e.getMessage());;
}
		
		double[] orderTest = Estatistica.ordenarArray(teste);
		for(double z : orderTest) {
			System.out.println(z);
		}
		
		System.out.println("A média dos valores é: "+Estatistica.media(teste));
System.out.println("A mediana é: " + Estatistica.mediana(teste));

System.out.println("A variancia é: " + Estatistica.variancia(teste));
System.out.println("O desvio padrão é: " + Estatistica.desvioPadrao(teste));
	}

}
