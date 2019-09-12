package br.com.sinfo;

public class Contador
{
	private int cont = 0;
	
	public Contador(int valorInicial)
	{
		cont = valorInicial;
	}
	public void	incrementar()
	{
		cont++;
	}
	public void incrementar(int valor)
	{
		cont += valor;
	}
	public void decrementar()
	{
		cont--;
	}
	public void decrementar(int valor)
	{
		cont -= valor;
	}
	public void visualizarContador()
	{
		System.out.println("Contador = " + cont);
	}
}
