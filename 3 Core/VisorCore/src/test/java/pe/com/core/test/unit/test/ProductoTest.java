package pe.com.core.test.unit.test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import pe.com.core.dao.CategoriaDao;
import pe.com.core.dao.ProductoDao;
import pe.com.core.dao.ProveedorDao;
import pe.com.core.entity.Categoria;
import pe.com.core.entity.Producto;
import pe.com.core.entity.Proveedor;

@RunWith(MockitoJUnitRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductoTest {
	
	@Mock
	public ProductoDao productoDao;
	
	@Mock
	public Producto producto;
	
	@Mock
	public CategoriaDao categoriaDao;
	
	@Mock
	public Categoria categoria;
	
	@Mock
	public ProveedorDao proveedorDao;
	
	@Mock
	public Proveedor proveedor;
	
	@BeforeClass
	public static void inicioClase() {
		System.out.println("Inicio de la Clase");
	}
	
	@AfterClass
	public static void finClase() {
		System.out.println("Fin de la Clase");
	}
	
	@Before
	public void antesMetodo() {
		categoria = new Categoria();
		categoria.setIdCategoria(1);
		categoria.setNombre("Chocolates");
		proveedor = new Proveedor();
		proveedor.setIdProveedor(1);
		proveedor.setNombre("Ambrosoli S.A");
		proveedor.setExisteDeuda(false);
		proveedor.setNumeroTelefonico("01-732842124");
		proveedor.setTipoPago("Dolares");
		System.out.println("Antes del Método");
	}
	
	@After
	public void despuesMetodo() {
		System.out.println("Despues del Método");
	}
	
	@Test
	public void a_insertar() {
		try {
			System.out.println("Método Insertar");
			producto = new Producto();
			producto.setIdProducto(1);
			producto.setNombre("Snickers");
			producto.setIdCategoria(1);
			producto.setCategoria(categoria);
			producto.setIdProveedor(1);
			producto.setProveedor(proveedor);
			producto.setEsNacional(false);
			producto.setTieneGarantia(false);
			when(productoDao.insertar(Matchers.any())).thenReturn(producto);
			productoDao.insertar(producto);
			Assert.assertTrue(producto.getIdProducto() > 0);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
	
	@Test
	public void b_actualizar() {
		try {
			System.out.println("Método Actualizar");
			Producto productoBuscado;
			producto = new Producto();
			producto.setIdProducto(1);
			producto.setNombre("Hersheys");
			producto.setIdCategoria(1);
			producto.setCategoria(categoria);
			producto.setIdProveedor(1);
			producto.setProveedor(proveedor);
			producto.setEsNacional(false);
			producto.setTieneGarantia(false);
			when(productoDao.obtener(Matchers.any())).thenReturn(producto);
			productoBuscado = productoDao.obtener(producto);
			productoBuscado.setNombre("Sublime");
			when(productoDao.actualizar(Matchers.any())).thenReturn(productoBuscado);
			producto = productoDao.actualizar(producto);
			System.out.println("Nombre: " + producto.getNombre());
			Assert.assertTrue(true);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
	
	@Test
	public void c_eliminar() {
		try {
			System.out.println("Método Eliminar");
			producto = new Producto();
			producto.setIdProducto(1);
			producto.setNombre("Hersheys");
			producto.setIdCategoria(1);
			producto.setCategoria(categoria);
			producto.setIdProveedor(1);
			producto.setProveedor(proveedor);
			producto.setEsNacional(false);
			producto.setTieneGarantia(false);
			when(productoDao.insertar(Matchers.any())).thenReturn(producto);
			productoDao.insertar(producto);
			when(productoDao.eliminar(Matchers.any())).thenReturn(producto);
			productoDao.eliminar(producto);
			if(productoDao.obtener(producto) == null) {
				Assert.assertTrue(true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
	
	@Test
	public void d_listar(){
		try {
			System.out.println("Método Listar");
			List<Producto> listaProductos=spy(new ArrayList<>());
			when(listaProductos.add(Matchers.any())).thenReturn(true);
			when(productoDao.listar()).thenReturn(listaProductos);
			List<Producto> lista=productoDao.listar();
			Assert.assertTrue(lista.size()>0);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Fallo la prueba: "+e.getMessage());			
		}
	}
}
