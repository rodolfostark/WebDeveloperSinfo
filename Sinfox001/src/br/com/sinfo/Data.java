package br.com.sinfo;

public class Data 
{
	private int dia;
	private int mes;
	private int ano;
	
	public Data()
	{
		dia = 1;
		mes = 1;
		ano = 1900;
	}
	public Data(int dia, int mes, int ano)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public void setData(int dia, int mes, int ano)
	{
		if((dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12) && (ano >= 1900 && ano <= 2100))
		{
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		else
		{
			System.out.println("Você tentou inserir uma data inválida! Tente novamente.");		
		}
	}
	public void setData(String data)
	{
		int dia = Integer.parseInt(data.substring(0, 2));
		int mes = Integer.parseInt(data.substring(3, 5));
		int ano = Integer.parseInt(data.substring(6, 10));
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public String toString() {
		return "Data: " + dia + "/" + mes + "/" + ano;
	}
	

}
