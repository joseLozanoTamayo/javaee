package org.encargo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.encargo.dao.UsuarioDAO;
import org.encargo.dto.UsuarioDTO;

/**
 * 
 */
public class UsuarioDAOImpl implements UsuarioDAO<UsuarioDTO, Long> {

	private Connection con;
	
	/**
	 * 
	 */
	public UsuarioDAOImpl(Connection con){
		this.con = con;
	}
	
	/**
	 * 
	 */
	@Override
	public UsuarioDTO obtenerUsuario(UsuarioDTO usuario) throws Exception{
		String sql = "Select * from usuario"
				+ " where  id = ?"
				+ "and password = ?";
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		try {
			
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, usuario.getNombre());
			statement.setString(2, usuario.getPassword());
			
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				usuarioDTO.setId(resultSet.getLong(1));
				usuarioDTO.setNombre(resultSet.getString(2));
				usuarioDTO.setEstado(resultSet.getInt(4));
			}		
		} catch (Exception e) {
			throw new Exception("Error Consulta : " + e.getMessage() );
		}
		return usuarioDTO;
	}

}
