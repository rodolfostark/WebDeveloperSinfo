package br.com.sinfo;


public class Vetor {
	
	private double x; 
	
	public double modulo()
	{
		return Math.sqrt(x * x);
	}
	public double produtoEscalar(Vetor vetor)
	{
		return x * vetor.x;
	}
	public double angulo(Vetor vetor)
	{
		return Math.acos(produtoEscalar(vetor)/(modulo() * vetor.modulo()));
	}
	
}
