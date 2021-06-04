import entities.Chefe;
import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("José Alves", "12345678", 1200);
		Funcionario f2 = new Chefe("João Garcia", "12121212", 2000);
        System.out.println("Nome: " + f1.getNome() +" Pagamento: " +f1.pagamento());
        System.out.println("Nome: " + f2.getNome() +" Pagamento: " +f2.pagamento());
	    ((Chefe) f2).setContas(234.87);
	    System.out.println("Nome: " + f2.getNome() + " Pagamento total: " + ((Chefe) f2).pagamentoExtra());
	}

}
