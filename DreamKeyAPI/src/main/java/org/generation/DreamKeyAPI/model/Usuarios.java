
package org.generation.DreamKeyAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario", unique = true, nullable = false)
	private Long idUsuario;
	@Column(name = "nombreUsuario", nullable = false)
	private String nombreUsuario;
	@Column(name = "telefonoUsuario", nullable = false)
	private String telefonoUsuario;
	@Column(name = "correoUsuario", nullable = false)
	private String correoUsuario;
	@Column(name = "contraseñaUsuario", nullable = false, length = 255)
	private String contraseñaUsuario;
	
	public Usuarios(String correoUsuario, String contraseñaUsuario) {
		super();
		this.correoUsuario = correoUsuario;
		this.contraseñaUsuario = contraseñaUsuario;
	}
	
	public Usuarios() {
	}
	
	
	//getters y setters

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getTelefonoUsuario() {
		return telefonoUsuario;
	}

	public void setTelefonoUsuario(String telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public String getContraseñaUsuario() {
		return contraseñaUsuario;
	}

	public void setContraseñaUsuario(String contraseñaUsuario) {
		this.contraseñaUsuario = contraseñaUsuario;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	@Override
	public String toString() {
		return "Usuarios [idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", telefonoUsuario="
				+ telefonoUsuario + ", correoUsuario=" + correoUsuario + ", contraseñaUsuario=" + contraseñaUsuario
				+ "]";
	}
	
	//toString()
}
