package org.generation.DreamKeyAPI.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.generation.DreamKeyAPI.model.Membresias;
import org.generation.DreamKeyAPI.model.Suscripcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuscripcionService {

	private final List<Suscripcion> lista = new ArrayList<>();

	
    @Autowired 
    public SuscripcionService() {
        lista.add(new Suscripcion());
        lista.add(new Suscripcion());
        lista.add(new Suscripcion());
        lista.add(new Suscripcion());
    }

	

    public List<Suscripcion> getSuscripciones() {
        return lista;
    }


    public Suscripcion getSuscripcion(Long id) {
        Suscripcion tmp = null;
        for (Suscripcion suscripcion : lista) {
            if (suscripcion.getId().equals(id)) {
                tmp = suscripcion;
                break;
            }
        }
        return tmp;
    }

    public Suscripcion deleteSuscripcion(Long id) {
        Suscripcion tmp = null;
        for (Suscripcion suscripcion : lista) {
            if (suscripcion.getId().equals(id)) {
                tmp = suscripcion;
                lista.remove(suscripcion);
                break;
            }
        }
        return tmp;
    }

    public Suscripcion addSuscripcion(Suscripcion suscripcion) {
        lista.add(suscripcion);
        return suscripcion;
    }

    public Suscripcion updateSuscripcion(
            Long id, 
            LocalDate fechaSuscripcion,
            LocalDate fechaPagoSuscripcion,
            Boolean suscripcionActiva) {

        Suscripcion tmp = null;
        for (Suscripcion suscripcion : lista) {
            if (suscripcion.getId().equals(id)) {
                if (fechaSuscripcion != null) suscripcion.setFechaSuscripcion(fechaSuscripcion);
                if (fechaPagoSuscripcion != null) suscripcion.setFechaPagoSuscripcion(fechaPagoSuscripcion);
                if (suscripcionActiva != null) suscripcion.setSuscripcionActiva(suscripcionActiva);
                tmp = suscripcion;
                break;
            }
        }
        return tmp;
    }
    
    public Suscripcion renovarSuscripcion(Long id) {
        Suscripcion tmp = getSuscripcion(id);
        if (tmp != null) {
            tmp.renovarSuscripcion();
        }
        return tmp;
    }

}

