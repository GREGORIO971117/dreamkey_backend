package org.generation.DreamKeyAPI.service;

import java.util.List;
import java.util.Optional;

import org.generation.DreamKeyAPI.dto.CambiarContraseña;
import org.generation.DreamKeyAPI.model.Usuarios;
import org.generation.DreamKeyAPI.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UsuariosService {
	@Autowired
	private PasswordEncoder encoder;
	
	private final UsuariosRepository usuariosRepository;
	
	@Autowired
	public UsuariosService(UsuariosRepository usuariosRepository) {
		this.usuariosRepository = usuariosRepository;
	}
	
	public List<Usuarios> getUsuarios() {
		return usuariosRepository.findAll();
	}//getUsuarios

	public Usuarios getUsuario(Long idUsuario) {
		// TODO Auto-generated method stub
		return usuariosRepository.findById(idUsuario).orElseThrow(
				() -> new IllegalArgumentException("El usuario con el id["+ idUsuario + "] no existe.")
				);
	}//getUsuario

	public Usuarios deleteUsuarios(Long idUsuario) {
		Usuarios user = null;
		if(usuariosRepository.existsById(idUsuario)) {
			user = usuariosRepository.findById(idUsuario).get();
			usuariosRepository.deleteById(idUsuario);
		}//if exists
			return user;
	}

	public Usuarios addUsuarios(Usuarios usuarios) {
		Optional<Usuarios> user = usuariosRepository.findByCorreoUsuario(usuarios.getCorreoUsuario());
		if(user.isEmpty()) {
			//encoder para guardar la contraseña cifrada
			usuarios.setContraseñaUsuario(encoder.encode(usuarios.getContraseñaUsuario()));
			usuariosRepository.save(usuarios);
		}else {
			usuarios=null;
		}
		return usuarios;
	}
	
	public Usuarios updateUsuario(Long id, CambiarContraseña cambiarContraseña) {
		Usuarios user = null;
		if(usuariosRepository.existsById(id)) {
			user = usuariosRepository.findById(id).get();
			//antes del encoder
			//if(user.getPassword().equals(changePassword.getPassword())) {
			//user.setPassword(changePassword.getNpassword());
			if(encoder.matches(cambiarContraseña.getPassword(), user.getContraseñaUsuario())) {
				//encoder 
				user.setContraseñaUsuario(encoder.encode(cambiarContraseña.getNpassword()));
				usuariosRepository.save(user);
			}else {
				user = null;
			}
		}//if exists
			return user;
	}//updateUsuario


	public boolean validateUser(Usuarios usuarios) {
		Optional<Usuarios> user = usuariosRepository.findByCorreoUsuario(usuarios.getCorreoUsuario());
		if(user.isPresent()) {
			Usuarios tmp = user.get();
			if(encoder.matches(usuarios.getContraseñaUsuario(), tmp.getContraseñaUsuario())) {
				return true;
			}//matches
		}//if isPresent
		return false;
	}//ValidateUser


}