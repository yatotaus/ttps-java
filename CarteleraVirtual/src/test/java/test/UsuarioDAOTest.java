package test;

import org.junit.Test;

import Daos.UsuarioDAO;
import junit.framework.TestCase;

public class UsuarioDAOTest extends TestCase{
	
	public UsuarioDAOTest() {
		super();
	}
	private UsuarioDAO dao;
	
	@Override
	public void setUp(){
		dao = new UsuarioDAO<Integer>();
	}
	@Test
	public void testAgregar(){
		this.assertEquals(true, 4 < 8);
	}
	@Test
	public void testRecuperar(){
		
	}
	
	
}
