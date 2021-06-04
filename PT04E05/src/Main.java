import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int prox;
		System.out.println("Digite um inteiro:");
		try {
			prox = sc.nextInt();
			System.out.println("voc� digitou " + prox);
		}catch(InputMismatchException e) {
			System.out.println("N�o � um inteiro");
		}finally {
sc.close();
		}
	}

}
