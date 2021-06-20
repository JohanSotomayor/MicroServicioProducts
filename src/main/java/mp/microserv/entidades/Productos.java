package mp.microserv.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Productos {
	
	
	
		
		@Id
		@Column(name="id_producto")
		private Long idProducto;
		
		@Column(name="Nombre_Product")
		private String nomProducto;

		@Column(name="Descripcion_product")
		private String descProducto;
		
		@Column(name="Cantidad_Product")
		private Long cantProducto;
		
		@Column(name="Precio")
		private Long precio;
		

		 public Productos() {}


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
