package connection;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.management.RuntimeErrorException;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1b;

/*RESPONSÁVEL PELA CONEXÃO COM O BANCO DE DADOS*/

public class SingleConnection {
	private static String banco = "jdbc:postgresql://localhost:5432/curso-jsp?autoReconnect=true";
	private static String passaword = "admin";
	private static String user= "postgres";
	private static Connection connection = null;
	
	static {
		conectar();
	}
	public SingleConnection() {
		
	}
	private static void conectar() {
		try {
			
			if(connection==null) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(banco,user,passaword);
				connection.setAutoCommit(false);
			}
			
		} catch (Exception e) {
			throw new RuntimeException("Erro ao conectar com o banco de dados");
			
			
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}
}
