package pe.com.core.test.integration.test;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pe.com.core.business.CategoriaBusiness;
import pe.com.core.entity.Categoria;

public class CategoriaIntegrationTest {
	
	private final CategoriaBusiness categoriaBusiness = new CategoriaBusiness();
	private static Categoria categoria = new Categoria();
	private String mensaje = "";
	private String nombreCategoria = "";
	@Mock
	private HttpServletResponse response;
	
	@Given("^despues de iniciar sesion en la aplicacion$")
	public void despues_de_iniciar_sesion_en_la_aplicacion() throws Throwable {
	    MockitoAnnotations.initMocks(this);
	    Mockito.doNothing().when(response).sendRedirect("http://www.visorupc.com");
	    Assert.assertTrue(true);
	}

	@When("^hago clic en el enlace de Matenimiento de Categoria$")
	public void hago_clic_en_el_enlace_de_Matenimiento_de_Categoria() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("http://www.visorupc.com/mntCategoria.xhtml");
	    Assert.assertTrue(true);
	}

	@When("^luego hago clic en el boton de Nuevo$")
	public void luego_hago_clic_en_el_boton_de_Nuevo() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("http://www.visorupc.com/regCategoria.xhtml");
	    Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en el campo Nombre el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Nombre_el_valor_de(String arg1) throws Throwable {
	    nombreCategoria = arg1;
	    categoria.setNombre(nombreCategoria);
	    Assert.assertTrue(true);
	}

	@When("^presiono el boton de Guardar$")
	public void presiono_el_boton_de_Guardar() throws Throwable {
	    try {
			categoriaBusiness.insertar(categoria);
			mensaje = "Se guardo correctamente la Categoria";
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Then("^el sistema me mostrara el mensaje de \"([^\"]*)\"$")
	public void el_sistema_me_mostrara_el_mensaje_de(String arg1) throws Throwable {
	    Assert.assertEquals(arg1, mensaje);
	}

	@When("^busco la categoria \"([^\"]*)\" para seleccionarla de la tabla de Categorias$")
	public void busco_la_categoria_para_seleccionarla_de_la_tabla_de_Categorias(String arg1) throws Throwable {
	    try {
			List<Categoria> lista = categoriaBusiness.listar(arg1);
			Assert.assertTrue(lista.size()>0);
			categoria = lista.get(0);
			Mockito.doNothing().when(response).sendRedirect("http://www.visorupc.com/mntCategoria.xhtml");
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@When("^hago clic en el boton de Editar$")
	public void hago_clic_en_el_boton_de_Editar() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("http://www.visorupc.com/actCategoria.xhtml");
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo el nombre de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_el_nombre_de(String arg1) throws Throwable {
	    nombreCategoria = arg1;
		categoria.setNombre(nombreCategoria);
		Assert.assertTrue(true);
	}

	@When("^presiono el boton de Actualizar$")
	public void presiono_el_boton_de_Actualizar() throws Throwable {
	    try {
			categoriaBusiness.actualizar(categoria);
			mensaje = "Se actualizo correctamente la Categoria";
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
}
