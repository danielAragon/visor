package pe.com.core.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Clase mapeada de la tabla Categoria
 * @author Marcelo Fernando Rios Berru
 * @email marcesftwr2@gmail.com
 */
public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idCategoria;
	private String nombre;
	private String descripcion;
	private List<Producto> productos;

	public Categoria() {
		super();
	}

	public Categoria(Integer idCategoria) {
		super();
		this.idCategoria = idCategoria;
	}

	public Categoria(Integer idCategoria, String nombre, String descripcion, 
			List<Producto> productos) {
		super();
		this.idCategoria = idCategoria;
		this.nombre = nombre;
		this.productos = productos;
		this.descripcion=descripcion;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idCategoria == null) ? 0 : idCategoria.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((productos == null) ? 0 : productos.hashCode());
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
		final Categoria other = (Categoria) obj;
		return Objects.equals(this.idCategoria, other.idCategoria);
	}

}
