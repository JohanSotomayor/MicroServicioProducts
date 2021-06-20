package mp.microserv.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mp.microserv.DTO.ProductosDTO;
import mp.microserv.entidades.Productos;
import mp.microserv.repositorio.ProductosRepo;
import mp.microserv.service.ProductosService;

@Service
public class ProductosServiceImpl implements ProductosService {

	@Autowired
	private ProductosRepo ProductosRep;
	
	@Override
	public List<ProductosDTO> ConsultarProductos() {
		// TODO Auto-generated method stub
		
		List<Productos> ListTemp = (List <Productos>)ProductosRep.findAll();
		List<ProductosDTO> LstProd= new ArrayList<ProductosDTO>();
		
		for(Productos e: ListTemp) {
		ProductosDTO dto = new ProductosDTO();
		dto.setIdProducto(e.getIdProducto());
		dto.setDescProducto(e.getDescProducto());
		dto.setNomProducto(e.getNomProducto());
		dto.setCantProducto(e.getCantProducto());
		dto.setPrecio(e.getPrecio());
		
	
		LstProd.add(dto);
		
	}
		return LstProd;
}
	
	
}