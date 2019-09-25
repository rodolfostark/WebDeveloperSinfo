package br.com.sinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExemplo {
	public static void main(String[] args) throws SQLException {
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "sinfo123");
		conexao.prepareStatement("select * from contatos");
		System.out.println("Conectado!");
		conexao.close();
	}
}
