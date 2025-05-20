package org.generation.DreamKeyAPI.controller;

import java.util.List;

@RestController
@RequestMapping(path="/api/dreamkey/afiliados") // http://localhost:8080/api/dreamkey/afiliados
public class AfiliadosController {
	
	private final AfiliadosService afiliadosService; //Creamos una instancia del servicio, para simular el servidor
	
	@Autowired
	public AfiliadosController(AfiliadosService afiliadosService) {
		this.afiliadosService = afiliadosService;
	}
	
	@GetMapping
	public List<Afiliados> getAfiliados(){
		return afiliadosService.getAfiliados();
	}//getProductos
	
	@GetMapping(path="{afiId}") // http://localhost:8080/api/dreamkey/afiliados/1
	public Afiliados getAfiliados(@PathVariable("afiId") Long id){
		return afiliadosService.getAfiliado(id);
	}//getAfiliados
	
	@DeleteMapping(path="{afiId}") // http://localhost:8080/api/dreamkey/afiliados/1
	public Afiliados deleteAfiliados(@PathVariable ("afiId") Long id) {
		return afiliadosService.deteleAfiliado(id);
	}//deleteAfiliados
	
	@PostMapping
	public Afiliados addAfiliado(@RequestBody Afiliados afiliado) {
		return afiliadosService.addAfiliado(afiliado);
	}//addProducto
	
	@PutMapping(path="{afiId}") // http://localhost:8080/api/dreamkey/afiliados/1
	public Afiliados updateProduct(@PathVariable("afiId") Long id, 
			@RequestParam(required=false) String nombre, 
			@RequestParam(required=false) String imagen,
			@RequestParam(required=false) String descripcion, 
			@RequestParam(required=false) Double raiting, 
			@RequestParam(required=false) String detalles, 
			@RequestParam(required=false) String servicio1,
			@RequestParam(required=false) String servicio2, 
			@RequestParam(required=false) String servicio3,
			@RequestParam(required=false) String img1,
			@RequestParam(required=false) String img2, 
			@RequestParam(required=false) String img3){
		
		return afiliadosService.updateAfiliado(id,nombre,imagen,descripcion,raiting,detalles,
				servicio1,servicio2,servicio3,img1,img2,img3);
	}//updateProducto
	
	
}//class AfiliadosController
