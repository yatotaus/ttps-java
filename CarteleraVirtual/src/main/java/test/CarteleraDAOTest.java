package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Daos.CarteleraDAO;
import clases.Cartelera;

public class CarteleraDAOTest {

	@Test
	public void testActualizar() {
		CarteleraDAO c = new CarteleraDAO();
		c.agregar(new Cartelera());
	}

	@Test
	public void testBorrarClassOfT() {
	}

	@Test
	public void testBorrarSerializable() {
	}

	@Test
	public void testPersistir() {
	}

	@Test
	public void testRecuperar() {
	}

	@Test
	public void testExiste() {
	}

	@Test
	public void testAgregar() {
	}
	
}
