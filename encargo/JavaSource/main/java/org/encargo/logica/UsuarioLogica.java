package org.encargo.logica;

import java.sql.Connection;

import org.encargo.dao.impl.UsuarioDAOImpl;
import org.encargo.dto.UsuarioDTO;

/**
 * 
 */
public class UsuarioLogica {
	
	private UsuarioDAOImpl daoImpl;
	
	public UsuarioLogica( Connection con){
		daoImpl = new UsuarioDAOImpl(con);
	}

	public UsuarioDTO obtenerUsuario(UsuarioDTO usuario) throws Exception{
		try {
			UsuarioDTO response = daoImpl.obtenerUsuario(usuario);
			return response;
		} catch (Exception e) {
			throw new Exception("Error en autenticacion " + e.getMessage());
		}
	}

}
