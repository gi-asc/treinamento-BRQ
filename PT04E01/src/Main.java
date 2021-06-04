import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Estudante;
import entities.Funcionario;
import entities.Pessoa;
import entities.Professor;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("dd.MM.yyyy");
		
		Pessoa estudante = new Estudante("João Pedro", "123.456.789-00", sf.parse("30.03.2000"), "1992-08");
		Pessoa professor = new Professor("Manuel Cardoso", "098.765.432-11", sf.parse("18.04.1966"), 2766.90, "Lógica de programação");
		Pessoa funcionario = new Funcionario("Alexandre mendes", "111.222.333-01", sf.parse("23.12.1982"),"Secretário", 1618.2, sf.parse("22.02.2018"));
		
		System.out.println("O aluno " + estudante.getNome() + " Pagaria R$" + estudante.tirarCopias(15) + " Por 15 cópias.");
		System.out.println("O professor " + professor.getNome() + " Pagaria R$" + professor.tirarCopias(15) + " Por 15 cópias.");
		System.out.println("O funcionário " + funcionario.getNome() + " Pagaria R$" + funcionario.tirarCopias(15) + " Por 15 cópias.");
	}

}
