package org.generation.DreamKeyAPI.controller;

import java.util.List;

import org.generation.DreamKeyAPI.dto.CambiarContraseña;
import org.generation.DreamKeyAPI.model.Usuarios;
import org.generation.DreamKeyAPI.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/api/dreamkey/usuarios")
public class UsuariosController {
	
		
		private final UsuariosService usuariosServices;

		@Autowired
		public UsuariosController(UsuariosService usuariosServices) {
			super();
			this.usuariosServices = usuariosServices;
		}
			
		@GetMapping
		public List<Usuarios> getUsuarios(){
			return usuariosServices.getUsuarios();
		}
		
		@GetMapping(path="{usuarioId}")
		public Usuarios getUsuarios(@PathVariable ("usuarioId") Long id) {
			return usuariosServices.getUsuario(id);
		}
		
		@DeleteMapping(path="{usuarioId}")
		public Usuarios deleteUsuarios(@PathVariable ("usuarioId") Long id) {
			return usuariosServices.deleteUsuarios(id);
		}
		
		@PostMapping
		public Usuarios addUsuarios(@RequestBody Usuarios usuario) {
			return usuariosServices.addUsuarios(usuario);
		}
		
				
		@PutMapping(path="{usuarioId}")
		public Usuarios updateUsuario(@PathVariable("usuarioId") Long id,
				@RequestBody CambiarContraseña cambiarContraseña) {
			return usuariosServices.updateUsuario(id, cambiarContraseña);
		}//updateUsuario

}
