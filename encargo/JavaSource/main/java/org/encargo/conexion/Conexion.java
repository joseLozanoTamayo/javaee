package org.encargo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Clase conexion
 */
public class Conexion {

	private static Connection conn = null;
	
	public static Connection getConnection() throws Exception{
		Class.forName("org.postgresql.Driver");
		conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/encargo", "postgres", "postgres");
		conn.setAutoCommit(false);
		return conn;
	}
	
	
	public static void cerrarConexion(){
		try{
			if(conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String... args) throws Exception{
		getConnection();
	}
	
}
