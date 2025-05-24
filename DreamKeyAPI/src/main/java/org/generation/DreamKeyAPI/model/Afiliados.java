package org.generation.DreamKeyAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="afiliados")
public class Afiliados {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_afiliados", unique = true, nullable=false)
	private Long id;
	
	@Column(name="nombre_afiliados", nullable=false)
	@JsonProperty("nombre_afiliados")
	private String nombre;
	
	@Column(name="img_afiliados", nullable=false)
	@JsonProperty("img_afiliados")
	private String img;
	
	@Column(name="descripcion_afiliados", nullable=false)
	@JsonProperty("descripcion_afiliados")
	private String descripcion;
	
	@Column(name="raiting_afiliados", nullable=false)
	@JsonProperty("raiting_afiliados")
	private Double raiting;
	
	@Column(name="detalles_afiliados", nullable=false)
	@JsonProperty("detalles_afiliados")
	private String detalles;
	
	@Column(name="servicios_afiliados1", nullable=false)
	@JsonProperty("servicios_afiliados1")
	private String servicio1;
	
	@Column(name="servicios_afiliados2", nullable=false)
	@JsonProperty("servicios_afiliados2")
	private String servicio2;
	
	@Column(name="servicios_afiliados3", nullable=false)
	@JsonProperty("servicios_afiliados3")
	private String servicio3;
	
	@Column(name="img_afiliados1", nullable=false)
	@JsonProperty("img_afiliados1")
	private String img1;
	
	@Column(name="img_afiliados2", nullable=false)
	@JsonProperty("img_afiliados2")
	private String img2;
	
	@Column(name="img_afiliados3", nullable=false)
	@JsonProperty("img_afiliados3")
	private String img3;
	//private static Long total = Long.valueOf(0);
	
	public Afiliados(String nombre, String img, String descripcion, Double raiting, String detalles, 
			String servicio1, String servicio2, String servicio3, String img1, String img2, String img3) {
		
		this.nombre = nombre;
		this.img = img;
		this.descripcion = descripcion;
		this.raiting = raiting;
		this.detalles = detalles;
		this.servicio1 = servicio1;
		this.servicio2 = servicio2;
		this.servicio3 = servicio3;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		//Afiliados.total++;
		//this.id = Afiliados.total;
	}//afiliados
	
	public Afiliados() {
		//Afiliados.total++;
		//this.id = Afiliados.total;
	}//constructor vacío

	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public String getImg() {
		return img;
	}//getImagen

	public void setImg(String img) {
		this.img = img;
	}//setImagen

	public String getDescripcion() {
		return descripcion;
	}//getDescripcion

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}//setDescripcion

	public Double getRaiting() {
		return raiting;
	}//getRaiting

	public void setRaiting(Double raiting) {
		this.raiting = raiting;
	}//setRaiting

	public String getDetalles() {
		return detalles;
	}//getDetalles

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}//setDetalles

	public String getServicio1() {
		return servicio1;
	}//getServicio1

	public void setServicio1(String servicio1) {
		this.servicio1 = servicio1;
	}//setServicio1

	public String getServicio2() {
		return servicio2;
	}//getServicio2

	public void setServicio2(String servicio2) {
		this.servicio2 = servicio2;
	}//setServicio2

	public String getServicio3() {
		return servicio3;
	}//getServicio3

	public void setServicio3(String servicio3) {
		this.servicio3 = servicio3;
	}//setServicio3

	public String getImg1() {
		return img1;
	}//getImg1

	public void setImg1(String img1) {
		this.img1 = img1;
	}//setImg1

	public String getImg2() {
		return img2;
	}//getImg2

	public void setImg2(String img2) {
		this.img2 = img2;
	}//setImg2

	public String getImg3() {
		return img3;
	}//getImg3

	public void setImg3(String img3) {
		this.img3 = img3;
	}//setImg3

	public Long getId() {
		return id;
	}//getId

	@Override
	public String toString() {
		return "Afiliados [id=" + id + ", nombre=" + nombre + ", img=" + img + 
				", descripcion=" + descripcion + ", raiting=" + raiting + 
				", detalles=" + detalles + ", servicio1=" + servicio1 + 
				", servicio2=" + servicio2 + ", servicio3=" + servicio3 + 
				", img1=" + img1 + ", img2=" + img2 + ", img3=" + img3 + "]";
	}//toString
	
	
}//Afiliados
