package pe.com.core.entity;

import java.io.Serializable;

/**
 * Clase mapeada de la tabla Proveedor
 * @author Marcelo Fernando Rios Berru
 * @email marcesftwr2@gmail.com
 */

public class Proveedor implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idProveedor;
	private String nombre;
	private String numeroTelefonico;
	private String tipoPago;
	private Boolean existeDeuda;
	
	public Proveedor() {
		super();
	}
	
	public Proveedor(Integer idProveedor) {
		super();
		this.idProveedor = idProveedor;
	}
	
	public Proveedor(Integer idProveedor, String nombre, String numeroTelefonico, 
			String tipoPago, Boolean existeDeuda) {
		super();
		this.idProveedor = idProveedor;
		this.nombre = nombre;
		this.numeroTelefonico = numeroTelefonico;
		this.tipoPago = tipoPago;
		this.existeDeuda = existeDeuda;
	}

	public Integer getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public Boolean getExisteDeuda() {
		return existeDeuda;
	}

	public void setExisteDeuda(Boolean existeDeuda) {
		this.existeDeuda = existeDeuda;
	}
}
