package org.generation.DreamKeyAPI.model;

public class Usuarios {
	
	private Long idUsuario;
	private String nombreUsuario;
	private String telefonoUsuario;
	private String correoUsuario;
	private String contraseñaUsuario;
	
	private static Long total=Long.valueOf(0);

	//constructor de usuarios
	public Usuarios(String nombreUsuario, String telefonoUsuario, String correoUsuario, String contraseñaUsuario) {
		
		this.nombreUsuario = nombreUsuario;
		this.telefonoUsuario = telefonoUsuario;
		this.correoUsuario = correoUsuario;
		this.contraseñaUsuario = contraseñaUsuario;
		Usuarios.total++;
		this.idUsuario=Usuarios.total;
	}

	
	public Usuarios() {
		Usuarios.total++;
		this.idUsuario=Usuarios.total;
	}
	
	
	//getters y setters
	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

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


	public static Long getTotal() {
		return total;
	}


	@Override
	public String toString() {
		return "Usuarios [idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", telefonoUsuario="
				+ telefonoUsuario + ", correoUsuario=" + correoUsuario + ", contraseñaUsuario=" + contraseñaUsuario
				+ "]";
	}
	
	//toString()
	
	
	


	
	
	
	
	

}
