package org.encargo.business;

import java.sql.Connection;

import org.encargo.conexion.Conexion;
import org.encargo.dto.UsuarioDTO;

public class UsuarioBusiness {
	
	public UsuarioDTO obtenerUsuario(UsuarioDTO usuario){
		UsuarioDTO response = null;
		try {
			Connection con = Conexion.getConnection();
			
		} catch (Exception e) {
			
		}
		return response;
	}

}
