package mp.microserv.DTO;

public class ProductosDTO {
	
	private Long idProducto;
	private String nomProducto;
	private String descProducto;
	private Long cantProducto;
	private Long precio;

	public ProductosDTO() {}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNomProducto() {
		return nomProducto;
	}

	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}

	public String getDescProducto() {
		return descProducto;
	}

	public void setDescProducto(String descProducto) {
		this.descProducto = descProducto;
	}

	public Long getCantProducto() {
		return cantProducto;
	}

	public void setCantProducto(Long cantProducto) {
		this.cantProducto = cantProducto;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}
	

}
