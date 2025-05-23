package org.generation.DreamKeyAPI.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "suscripcion")
public class Suscripcion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSuscripcion", unique = true, nullable = false)
	private Long idSuscripcion;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(nullable = false)
    private LocalDate fechaSuscripcion = LocalDate.now();

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(nullable = false)
    private LocalDate fechaPagoSuscripcion = LocalDate.now().plusDays(30);
    
    @Column(name = "activaSuscripcion", nullable = false)
    private Boolean suscripcionActiva;


	public Suscripcion(
			LocalDate fechaSuscripcion, 
			LocalDate fechaPagoSuscripcion, 
			Boolean suscripcionActiva) {
		
		this.fechaSuscripcion = fechaSuscripcion;
		this.fechaPagoSuscripcion = fechaPagoSuscripcion;
		this.suscripcionActiva = suscripcionActiva;
	}
	
	public Suscripcion() {
	}

	public LocalDate getFechaSuscripcion() {
		return fechaSuscripcion;
	}
	public void setFechaSuscripcion(LocalDate fechaSuscripcion) {
		this.fechaSuscripcion = fechaSuscripcion;
	}
	public LocalDate getFechaPagoSuscripcion() {
		return fechaPagoSuscripcion;
	}
	public void setFechaPagoSuscripcion(LocalDate fechaPagoSuscripcion) {
		this.fechaPagoSuscripcion = fechaPagoSuscripcion;
	}
	public Boolean getSuscripcionActiva() {
		return suscripcionActiva;
	}
    public void setSuscripcionActiva(Boolean suscripcionActiva) {
        this.suscripcionActiva = suscripcionActiva;
    }
    
    public void renovarSuscripcion() {
        if (LocalDate.now().isAfter(fechaPagoSuscripcion) || LocalDate.now().isEqual(fechaPagoSuscripcion)) {
            this.fechaSuscripcion = LocalDate.now();
            this.fechaPagoSuscripcion = fechaSuscripcion.plusDays(30);
            this.suscripcionActiva = true;
        }
    }

	public Long getId() {
		return idSuscripcion;
	}

	@Override
	public String toString() {
		return "Suscripcion [id=" + idSuscripcion + ", fechaSuscripcion=" + fechaSuscripcion + ", fechaPagoSuscripcion="
				+ fechaPagoSuscripcion + ", suscripcionActiva=" + suscripcionActiva + "]";
	}
	
	
}

