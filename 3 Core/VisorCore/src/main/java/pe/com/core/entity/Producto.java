package pe.com.core.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Flujo 01
 * Clase refactorizada de la tabla Producto
 * @author Alvaro Felix Toconas Ocaña
 * Creditos al autor original:
 * @author Henry Joe Wong Urquiza
 * @email hwongu@gmail.com
 */
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idProducto;
	private String nombre;
	private Integer idCategoria;
	private Categoria categoria;
	private Integer idProveedor;
	private Proveedor proveedor;
	private Boolean esNacional;
	private Boolean tieneGarantia;

	public Producto() {
		super();
	}

	public Producto(Integer idProducto) {
		super();
		this.idProducto = idProducto;
	}

	public Producto(Integer idProducto, Integer idProveedor, String nombre,
			Integer idCategoria, Categoria categoria, Proveedor proveedor, Boolean esNacional, 
			Boolean tieneGarantia) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.idCategoria = idCategoria;
		this.categoria = categoria;
		this.idProveedor=idProveedor;
		this.proveedor=proveedor;
		this.esNacional=esNacional;
		this.tieneGarantia=tieneGarantia;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getEsNacional() {
		return esNacional;
	}

	public void setEsNacional(Boolean esNacional) {
		this.esNacional = esNacional;
	}

	public Boolean getTieneGarantia() {
		return tieneGarantia;
	}

	public void setTieneGarantia(Boolean tieneGarantia) {
		this.tieneGarantia = tieneGarantia;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

	public Integer getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result
				+ ((idCategoria == null) ? 0 : idCategoria.hashCode());
		result = prime * result
				+ ((idProducto == null) ? 0 : idProducto.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((esNacional==null) ? 0 : esNacional.hashCode());
		result = prime * result + ((tieneGarantia==null) ? 0 : tieneGarantia.hashCode());
		result = prime * result + ((proveedor==null) ? 0 : proveedor.hashCode());
		result = prime * result + ((idProveedor== null)? 0 : idProveedor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Producto other = (Producto) obj;
		return Objects.equals(this.idProducto, other.idProducto);
	}

}
