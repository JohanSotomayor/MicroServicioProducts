package mp.microserv.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mp.microserv.DTO.ProductosDTO;
import mp.microserv.service.ProductosService;




	@RestController
	@RequestMapping("/api")
	public class ProductosRestController {
		
		@Autowired
		private ProductosService ProdServ;
		
		@GetMapping("/productosmp")
		public List<ProductosDTO> ConsultProd(){
			return ProdServ.ConsultarProductos();
		}

		@PostMapping("/PostProductos")
		public List<ProductosDTO> PostProd(){
			return ProdServ.ConsultarProductos();
		}
	
}
