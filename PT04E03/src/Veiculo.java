public class Veiculo {
private int velocidade = 0;
private int velocidadeMax = 100;
public int getVelocidade(){
return this.velocidade;
}
public int getVelocidadeMax(){
return this.velocidadeMax;
}
public void acelera(int incremento) throws VelocidadeAcimaException
{
if(velocidade + incremento > velocidadeMax){
throw new VelocidadeAcimaException();
}
else
{
velocidade += incremento;
}
}
public void desacelara(int decremento) throws VelocidadeAbaixoException
{
if(velocidade - decremento < 0){
	throw new VelocidadeAbaixoException();
}
else
{
velocidade -= decremento;
}
}
}