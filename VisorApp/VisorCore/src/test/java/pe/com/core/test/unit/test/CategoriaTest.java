package pe.com.core.test.unit.test;

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
import pe.com.core.entity.Categoria;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CategoriaTest {
	
	@Mock
	private CategoriaDao categoriaDao;
	
	@Mock
	private Categoria categoria;
	
	@BeforeClass
	public static void inicioClase() {
		System.out.println("Inicio de la Clase");
	}
	
	@AfterClass
	public static void  finClase() {
		System.out.println("Fin de la clase");
	}
	@Before
	public void  antesMetodo() {
		System.out.println("Antes del Método");
	}
	@After
	public void  despuesMetodo() {
		System.out.println("Después del Método");
	}
	
	@Test
	public void a_insertar() {
		try {
			System.out.println("Método Insertar");
			categoria = new Categoria();
			categoria.setNombre("Charito");
			categoria.setIdCategoria(1);
			when(categoriaDao.insertar(Matchers.any())).thenReturn(categoria);
			categoriaDao.insertar(categoria);
			Assert.assertTrue(categoria.getIdCategoria()>0);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
	
	@Test
	public void b_actualizar() {
		try {
			System.out.println("Método Actualizar");
			Categoria categoriaBuscada;
			categoria = new Categoria();
			categoria.setNombre("Chocolates");
			categoria.setIdCategoria(1);
			when(categoriaDao.obtener(Matchers.any())).thenReturn(categoria);
			categoriaBuscada = categoriaDao.obtener(categoria);
			categoria.setNombre("Menestras");
			when(categoriaDao.actualizar(Matchers.any())).thenReturn(categoriaBuscada);
			categoriaDao.actualizar(categoriaBuscada);
			System.out.println("Nombre: " + categoria.getNombre());
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
	
	@Test
	public void c_listar() {
		try {
			System.out.println("Método Listar");
			List<Categoria> listaCategorias = spy(new ArrayList<>());
			when(listaCategorias.add(Matchers.any())).thenReturn(true);
			when(categoriaDao.listar()).thenReturn(listaCategorias);
			List<Categoria> lista = categoriaDao.listar();
			Assert.assertTrue(lista.size()>0);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
}
