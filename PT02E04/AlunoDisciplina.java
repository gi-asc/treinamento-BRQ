package PT02E04;

public class AlunoDisciplina {
private int idAluno;
private int idDisciplina;
private double nota1;
private double nota2;

public AlunoDisciplina(int idAluno, int idDisciplina) {
	this.idAluno = idAluno;
	this.idDisciplina = idDisciplina;
}

public int getIdAluno() {
	return idAluno;
}

public void setIdAluno(int idAluno) {
	this.idAluno = idAluno;
}

public int getIdDisciplina() {
	return idDisciplina;
}

public void setIdDisciplina(int idDisciplina) {
	this.idDisciplina = idDisciplina;
}

public double getNota1() {
	return nota1;
}

public void setNota1(double nota1) {
	this.nota1 = nota1;
}

public double getNota2() {
	return nota2;
}

public void setNota2(double nota2) {
	this.nota2 = nota2;
}

public double mediaAritmetica() {
	return (this.getNota1()+this.getNota2())/2;
}

public double mediaPonderada() {
	return ((this.getNota1()*4)+(this.getNota2()*6))/2;
}

}
