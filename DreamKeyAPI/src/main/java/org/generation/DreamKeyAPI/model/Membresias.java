package org.generation.DreamKeyAPI.model;

public class Membresias {
	
	private Long id;
	private String nombre;
	private Double precio;
	private String categoria;
	private String imagen;
	private String descripcion;
	private static Long total=Long.valueOf(0);
	
	
	
	
	public Membresias(
			String nombre, 
			Double precio, 
			String categoria, 
			String imagen,
			String descripcion) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
		this.imagen = imagen;
		this.descripcion = descripcion;
		Membresias.total++;
		this.id=Membresias.total;
	}
	
	public Membresias() {
		Membresias.total++;
		this.id=Membresias.total;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Membresias [getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio() + ", getCategoria()="
				+ getCategoria() + ", getImagen()=" + getImagen() + ", getDescripcion()=" + getDescripcion()
				+ ", getId()=" + getId() + "]";
	}
	
}

