package br.com.fb.balflex.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection(){
		try {
			return DriverManager.getConnection("jdbc:postgresql://192.168.0.11:5432/fabrica","postgres","#196E@Balfl3x#");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
