package org.generation.DreamKeyAPI.service;

import java.util.ArrayList;
import java.util.List;

import org.generation.DreamKeyAPI.model.Membresias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AfiliadosService {

	private final List<Afiliados> lista= new ArrayList<Afiliados>();
		
	@Autowired 
	public AfiliadosService() {
		lista.add(new Afiliados('Atelier Ross Melgar', '../../assets/img-afiliados/Atelier.jpg', 'Spa & salón de belleza', 4.5, 'Es un spa y sos de peluquería y estética. Su ambiente acogedor y profesional garantiza una experiencia inolvidable para cada cliente.', 'SPA', 'Corte', 'Masaje', '../../assets/img-servicios/spa.jpg', '../../assets/img-servicios/corte.jpg', '../../assets/img-servicios/masaje.jpg'));
		lista.add(new Afiliados('Belleza Eterna', '../../assets/img-afiliados/Eterna.jpg', 'Spa', 3.1, 'Es un spa que se especializa en tratam para consentirte.', 'Barbería', 'Corte', 'Facial', '../../assets/img-servicios/barberia.jpg', '../../assets/img-servicios/corte.jpg', '../../assets/img-servicios/faciales.jpg'));
		lista.add(new Afiliados('Luz y Brillo', '../../assets/img-afiliados/Luz.jpg', 'Barbería', 5, 'Barbería especializada en cortes de cabe, con un estilo fresco y moderno.', 'SPA', 'Corte', 'Masaje', '../../assets/img-servicios/spa.jpg', '../../assets/img-servicios/corte.jpg', '../../assets/img-servicios/masaje.jpg'));
		lista.add(new Afiliados('Diva Glam', '../../assets/img-afiliados/Diva.jpg', 'Estudio de uñas', 4.8, 'Es un estudio de uñas que diseña da a cada cliente.', 'Manicure', 'Pedicure', 'Gelish', '../../assets/img-servicios/manicure.jpg', '../../assets/img-servicios/pedicure.jpg', '../../assets/img-servicios/gelish.jpg'));
		lista.add(new Afiliados('Elegance Studio', '../../assets/img-afiliados/Elegance.jpg', 'Centro de Belleza', 3.7, 'Centro de belleza quentos inolvidables.', 'Corte', 'Masaje', 'Peinados', '../../assets/img-servicios/corte.jpg', '../../assets/img-servicios/masaje.jpg', '../../assets/img-servicios/peinados.jpg'));
	}//contructor 
	
	public List<Afiliados> getAfiliados() {
		return lista;
	}//getAfiliados

	public Afiliados getAfiliados(Long id) {
		Afiliados tmp = null;
		for (Afiliados afiliados : lista) {
			if (afiliado.getId()==id) {
				tmp=afiliado;
				break;
			}//if
		}//foreach
		return tmp;
	}//getAfiliados
	
	public Afiliados deleteAfiliados(Long id) {
		Afiliados tmp = null;
		for (Afiliados afiliados : lista) {
			if (afiliado.getId()==id) {
				tmp=afiliado;
				lista.remove(afiliado);
				break;
			}//if
		}//foreach
		return tmp;
	}//deleteAfiliados

	public Afiliados addAfiliados(Afiliados afiliados) {
		lista.add(afiliados);
		return afiliados;
	}//addAfiliados

	public Afiliados updateAfiliados(
			Long id,
			String nombre,
			String imagen,
			String descripcion,
			Double raiting, 
			String detalles,
			String servicio1,
			String servicio2,
			String servicio3,
			String img1,
			String img2,
			String img3) {

		Afiliados tmp = null;
		for (Afiliados afiliados : lista) {
			if (afiliado.getId()==id) {
				if (nombre!=null) afiliados.setNombre(nombre);
				if (imagen!=null) afiliados.setImagen(imagen);
				if (descripcion!=null) afiliados.setDescripcion(descripcion);
				if (raiting!=null) afiliados.setRaiting(raiting);
				if (detalles!=null) afiliados.setDetalles(detalles);
				if (servicio1!=null) afiliados.setServicio1(servicio1);
				if (servicio2!=null) afiliados.setServicio2(servicio2);
				if (servicio3!=null) afiliados.setServicio3(servicio3);
				if (img1!=null) afiliados.setImg1(img1);
				if (img2!=null) afiliados.setImg2(img2);
				if (img3!=null) afiliados.setImg3(img3);
				tmp=afiliados;
				break;
			}//if
		}//foreach
		return tmp;
	}//updateAfiliados

}//class AfiliadosService
