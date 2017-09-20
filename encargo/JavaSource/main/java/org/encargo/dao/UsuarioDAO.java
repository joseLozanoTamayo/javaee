package org.encargo.dao;

import org.encargo.dto.UsuarioDTO;

/**
 * 
 * @author jose
 *
 */
public interface UsuarioDAO<E,k> {

	public UsuarioDTO obtenerUsuario(E usuario) throws Exception;
	
}
