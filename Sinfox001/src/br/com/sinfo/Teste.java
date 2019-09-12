package br.com.sinfo;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1 = new Data();
		Data d2 = new Data();
		String data = "13/09/2017";
		d1.setData(27, 11, 1922);
		System.out.println(d1.toString());
		d2.setData(data);
		System.out.println(d2.toString());
	}

}
