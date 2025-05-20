package org.generation.DreamKeyAPI.model;

import java.time.LocalDate;

public class Suscripcion {
	
	private Long id;
	private LocalDate fechaSuscripcion = LocalDate.now();
	private LocalDate fechaPagoSuscripcion = LocalDate.now().plusDays(30);
	private Boolean suscripcionActiva;
	private static Long total=Long.valueOf(0);

	public Suscripcion(
			LocalDate fechaSuscripcion, 
			LocalDate fechaPagoSuscripcion, 
			Boolean suscripcionActiva) {
		
		this.fechaSuscripcion = fechaSuscripcion;
		this.fechaPagoSuscripcion = fechaPagoSuscripcion;
		this.suscripcionActiva = suscripcionActiva;
	}
	
	public Suscripcion() {
		Suscripcion.total++;
		this.id=Suscripcion.total;
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
		return id;
	}

	@Override
	public String toString() {
		return "Suscripcion [id=" + id + ", fechaSuscripcion=" + fechaSuscripcion + ", fechaPagoSuscripcion="
				+ fechaPagoSuscripcion + ", suscripcionActiva=" + suscripcionActiva + "]";
	}
	
	
}

