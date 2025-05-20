package org.generation.DreamKeyAPI.service;

import java.util.ArrayList; 
import java.util.List;

import org.generation.DreamKeyAPI.model.Usuarios;
import org.generation.DreamKeyAPI.model.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuariosService {
	

		private final List<Usuarios> lista= new ArrayList<Usuarios>();
		
		
		@Autowired 
		public UsuariosService() {
			lista.add(new Usuarios("luu", "5562174247", "luu@gmail.com", "Sallyske2"));
			lista.add(new Usuarios("Ary", "5569874523", "ary@gmail.com", "Sallyske3"));
			lista.add(new Usuarios("Danney", "5595687422", "dann@gmail.com", "Sallyske4"));
			lista.add(new Usuarios("Lesly", "5596874512", "les@gmail.com", "Sallyske5"));
		}
		
		
		public List<Usuarios> getUsuarios() {
			// TODO Auto-generated method stub
			return lista;
		}

		public Usuarios getUsuario(Long id) {
			
			Usuarios tmp = null;
			
			for (Usuarios usuario : lista) {
				if (usuario.getIdUsuario()==id) {
					tmp=usuario;
					break;
				}
			}
			
			return tmp;
		}
		
		
		public Usuarios deleteUsuarios(Long id) {
			
			Usuarios tmp = null;
			for (Usuarios usuario : lista) {
				if (usuario.getIdUsuario()==id) {
					tmp=usuario;
					lista.remove(usuario);
					break;
				}
			}
			
			return tmp;
		}

		public Usuarios addUsuarios(Usuarios usuario) {
		
			lista.add(usuario);
			return usuario;
		}

		public Usuarios updateUsuarios(
				
				Long id,
				String nombreUsuario,
				String telefonoUsuario, 
				String correoUsuario,
				String contraseñaUsuario) {
					
			Usuarios tmp = null;
			
			for (Usuarios usuario : lista) {
				
				if (usuario.getIdUsuario()==id) {
					if (nombreUsuario!=null) {usuario.setNombreUsuario(nombreUsuario);}
					if (telefonoUsuario!=null) {usuario.setTelefonoUsuario(telefonoUsuario);}
					if (correoUsuario!=null) {usuario.setCorreoUsuario(correoUsuario);}
					if (contraseñaUsuario!=null) {usuario.setContraseñaUsuario(contraseñaUsuario);}
				
					tmp=usuario;
					break;
					}
				
			}return tmp;
			
}
	
	
}// class UsuariosService
