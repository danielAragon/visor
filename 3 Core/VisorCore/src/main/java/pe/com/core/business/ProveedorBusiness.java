package pe.com.core.business;


import java.util.List;

import pe.com.core.dao.ProveedorDao;
import pe.com.core.entity.Proveedor;



/**
 * Clase que tiene los metodos de Negocio para Proveedor
 * @author 	Marcelo Fernando Rios Berru
 * @email 	marcesftwr2@gmail.com
 */

public class ProveedorBusiness {

	private final ProveedorDao proveedorDao = new ProveedorDao();
	
	public void insertar(Proveedor proveedor) throws Exception{
		this.proveedorDao.insertar(proveedor);
	}
	
	public void actualizar(Proveedor proveedor) throws Exception{
		this.proveedorDao.actualizar(proveedor);
	}
	
	public void eliminar(Proveedor proveedor) throws Exception{
		this.proveedorDao.eliminar(proveedor);
	}
	
	public Proveedor obtener(Integer id) throws Exception{
		return this.proveedorDao.obtener(new Proveedor(id));
	}
	
	public List<Proveedor> listar() throws Exception{
		return this.proveedorDao.listar();
	}
	
	public List<Proveedor> listar(String filtro) throws Exception{
		return this.proveedorDao.listar(filtro.trim().toUpperCase());
	}
}
