package org.encargo.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase DTO Usuario
 */
public class UsuarioDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id; 
    private String nombre;
    private String password;
    private int estado;
    private Date fecha_modificacion;
    private Date fecha_creacion;
    private long usuario_creacion;
    private long usuario_modificacion;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Date getFecha_modificacion() {
		return fecha_modificacion;
	}
	public void setFecha_modificacion(Date fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	public long getUsuario_creacion() {
		return usuario_creacion;
	}
	public void setUsuario_creacion(long usuario_creacion) {
		this.usuario_creacion = usuario_creacion;
	}
	public long getUsuario_modificacion() {
		return usuario_modificacion;
	}
	public void setUsuario_modificacion(long usuario_modificacion) {
		this.usuario_modificacion = usuario_modificacion;
	}
	
}
