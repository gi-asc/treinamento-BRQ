package PT02E01;

public class Main {

	public static void main(String [] args){

		 Funcionario F01 = new Funcionario("Maria aparecida", 231, 7800);
		 Funcionario F02 = new Funcionario("José Carlos Silva", 1105, 5400);

		 System.out.println(F01.getCodFunc() + "\t\t"+ F01.getNome() +
		 "\t\t"+ F01.getSalarioMensal());
		 System.out.println(F02.getCodFunc() + "\t\t"+ F02.getNome() +
		 "\t\t"+ F02.getSalarioMensal());

		 F01.aumento(15.0);
		 F02.aumento(15.0);

		 System.out.println(F01.getCodFunc()+"\t\t"+F01.salarioAnual());
		 System.out.println(F01.getCodFunc()+"\t\t"+F02.salarioAnual());
}
}