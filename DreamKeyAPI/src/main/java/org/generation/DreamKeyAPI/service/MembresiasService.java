package org.generation.DreamKeyAPI.service;

import java.util.ArrayList;
import java.util.List;

import org.generation.DreamKeyAPI.model.Membresias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembresiasService {

	private final List<Membresias> lista= new ArrayList<Membresias>();
	
	
	@Autowired 
	public MembresiasService() {
		lista.add(new Membresias("el mejor", 9999.0, "Primera", "imagen.jpg", "la mejor"));
		lista.add(new Membresias("el mejor", 8888.0, "Segunda", "imagen.jpg", "la mejor"));
		lista.add(new Membresias("el mejor", 7777.0, "Tercera", "imagen.jpg", "la mejor"));
		lista.add(new Membresias("el mejor", 6666.0, "Cuarta", "imagen.jpg", "la mejor"));
	}
	

	public List<Membresias> getMembresias() {
		// TODO Auto-generated method stub
		return lista;
	}

	public Membresias getMembresia(Long id) {
		
		Membresias tmp = null;
		
		for (Membresias membresia : lista) {
			if (membresia.getId()==id) {
				tmp=membresia;
				break;
			}
		}
		
		return tmp;
	}
	
	
	public Membresias deleteMembresias(Long id) {
		// TODO Auto-generated method stub
		Membresias tmp = null;
		for (Membresias membresia : lista) {
			if (membresia.getId()==id) {
				tmp=membresia;
				lista.remove(membresia);
				break;
			}
		}
		
		return tmp;
	}

	public Membresias addMembresias(Membresias membresia) {
		// TODO Auto-generated method stub
		lista.add(membresia);
		return membresia;
	}

	public Membresias updateMembresias(
			
			Long id,
			String nombre,
			Double precio, 
			String categoria,
			String imagen,
			String descripcion) {
		// TODO Auto-generated method stub
		

		Membresias tmp = null;
		
		for (Membresias membresia : lista) {
			
			if (membresia.getId()==id) {
				if (nombre!=null) {membresia.setNombre(nombre);}
				if (precio!=null) {membresia.setPrecio(precio);}
				if (categoria!=null) {membresia.setCategoria(categoria);}
				if (imagen!=null) {membresia.setImagen(imagen);}
				if (descripcion!=null) {membresia.setDescripcion(descripcion);}
				tmp=membresia;
				break;
				
			}
		}return tmp;
		
	}

}
