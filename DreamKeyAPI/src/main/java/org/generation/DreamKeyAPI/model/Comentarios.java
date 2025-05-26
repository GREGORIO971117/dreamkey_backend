package org.generation.DreamKeyAPI.model;

public class Comentarios {
	private Long id;
	private String comentario;
	private static Long total=Long.valueOf(0);
	public Comentarios(String comentario) {
		super();
		this.comentario = comentario;
		Comentarios.total++;
		this.id=Comentarios.total;
	}
	public Comentarios() {
		Comentarios.total++;
		this.id=Comentarios.total;
	}
	public String getComentarios() {
		return comentario;
	}
	public void setComentarios(String comentario) {
		this.comentario = comentario;
	}
	public static Long getTotal() {
		return total;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Comentarios [id=" + id + ", comentario=" + comentario + "]";
	}
	
	
	
	

	
	
}
