package pe.com.core.test.integration.test;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pe.com.core.business.CategoriaBusiness;
import pe.com.core.business.ProductoBusiness;
import pe.com.core.dao.ProveedorDao;
import pe.com.core.entity.Categoria;
import pe.com.core.entity.Producto;
import pe.com.core.entity.Proveedor;

public class ProductoIntegrationTest {
	private final ProductoBusiness productoBusiness = new ProductoBusiness();

	private static Producto producto =	new Producto();
	private static Categoria categoria = new Categoria();
	private static Proveedor proveedor = new Proveedor();
	private String mensaje = "";
	private String nombreCategoria = "";
	private String nombreProveedor="";
	private String nombreProducto="";
	private String esNacional="";
	private String tieneGarantia="";
	
	private final CategoriaBusiness categoriaBusiness = new CategoriaBusiness();
	private static List<Producto> listaProducto;
	private static List<Categoria> listaCategorias;
	private static List<Proveedor> listaProveedores;
	
	private final ProveedorDao proveedorBusiness= new ProveedorDao();
	@Mock
	private HttpServletResponse response;
	
	@When("^hago clic en el enlace de Mantenimiento de Producto$")
	public void hago_clic_en_el_enlace_de_Mantenimiento_de_Producto() throws Throwable {
		MockitoAnnotations.initMocks(this);
	    Mockito.doNothing().when(response).sendRedirect("http://www.miluzsrl.com/mntProducto.xhtml");
	    Assert.assertTrue(true);
	}

	@When("^luego hago clic en el boton de NuevoProducto$")
	public void luego_hago_clic_en_el_boton_de_NuevoProducto() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("http://www.miluzsrl.com/regCategoria.xhtml");
	    Assert.assertTrue(true);;
	}

	@When("^en la nueva pantalla escribo en el campo NombreProducto el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_NombreProducto_el_valor_de(String arg1) throws Throwable {
		 nombreProducto= arg1;
		 producto.setNombre(nombreProducto);
		 Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla selecciono del combobox CategoriaProducto el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_selecciono_del_combobox_CategoriaProducto_el_valor_de(String arg1) throws Throwable {
		nombreCategoria= arg1;
		listaCategorias=categoriaBusiness.listar(nombreCategoria);
		categoria=listaCategorias.get(0);
		producto.setCategoria(categoria);
		producto.setIdCategoria(categoria.getIdCategoria());
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla selecciono del combobox ProveedorProducto el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_selecciono_del_combobox_ProveedorProducto_el_valor_de(String arg1) throws Throwable {
		nombreProveedor= arg1;
		listaProveedores=proveedorBusiness.listar(nombreProveedor);
		proveedor=listaProveedores.get(0);
		producto.setProveedor(proveedor);
		producto.setIdProveedor(proveedor.getIdProveedor());
		Assert.assertTrue(true);
		
	}
	@When("^en la nueva pantalla selecciono el radiobutton NacionalidadProducto el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_selecciono_el_radiobutton_NacionalidadProducto_el_valor_de(String arg1) throws Throwable {
	    esNacional=arg1;
	    if(esNacional=="Nacional")
	    {
	    	producto.setEsNacional(true);
	    }
	    else {// if(esNacional=="Importado"){
	    	producto.setEsNacional(false);
	    }
	    Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla selecciono el checkbox GarantiaProducto y lo dejo en blanco$")
	public void en_la_nueva_pantalla_selecciono_el_checkbox_GarantiaProducto_y_lo_dejo_en_blanco() throws Throwable {
	    tieneGarantia="No tiene Garantia";
	    if(tieneGarantia=="No tiene Garantia")
	    {
	    	producto.setTieneGarantia(false);
	    }
	    Assert.assertTrue(true);
	}
	@When("^presiono el boton de GuardarProducto$")
	public void presiono_el_boton_de_GuardarProducto() throws Throwable {
		 try {
				productoBusiness.insertar(producto);
				mensaje = "Se guardo correctamente el producto";
				Assert.assertTrue(true);
			} catch (Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
	}
	
	@Then("^el sistema me mostrara \"([^\"]*)\"$")
	public void el_sistema_me_mostrara(String arg1) throws Throwable {
	    Assert.assertEquals(arg1, mensaje);
	}

	@When("^busco el producto \"([^\"]*)\" para seleccionarlo de la tabla de Productos$")
	public void busco_el_producto_para_seleccionarlo_de_la_tabla_de_Productos(String arg1) throws Throwable {
		 try {

				listaProducto = productoBusiness.listar(arg1);
				System.out.println(listaProducto.get(0).getNombre());
				producto = listaProducto.get(0);
				producto.getProveedor().setNombre(proveedorBusiness.obtener(producto.getProveedor()).getNombre());
				Mockito.doNothing().when(response).sendRedirect("http://www.miluzsrl.com/mntProducto.xhtml");
				Assert.assertTrue(true);
			} catch (Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
	}
	

	@When("^hago clic en el boton de EditarProducto$")
	public void hago_clic_en_el_boton_de_EditarProducto() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("http://www.miluzsrl.com/actProducto.xhtml");
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo el nombreProducto de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_el_nombreProducto_de(String arg1) throws Throwable {
		nombreProducto = arg1;
		producto.setNombre(nombreProducto);
		Assert.assertTrue(true);
	}

	@When("^presiono el boton de ActualizarProducto$")
	public void presiono_el_boton_de_ActualizarProducto() throws Throwable {
		 try {
				productoBusiness.actualizar(producto);
				mensaje = "Se actualizo correctamente el Producto";
				Assert.assertTrue(true);
			} catch (Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
	}

	@When("^hago clic en el boton de EliminarProducto$")
	public void hago_clic_en_el_boton_de_EliminarProducto() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("http://www.miluzsrl.com/mntProducto.xhtml");
		Assert.assertTrue(true);
	}

	@When("^en la ventana de confirmacion hago click en Confirmar$")
	public void en_la_ventana_de_confirmacion_hago_click_en_Confirmar() throws Throwable {
		try {
			productoBusiness.eliminar(producto);
			mensaje = "Se elimino correctamente el Producto";
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
