package tata.operaciones.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.operaciones.Operaciones;

public class OperacionesTests {
private Operaciones opes;
/*antes*/
	@Before
	public void setUp() throws Exception {
		this.opes = new Operaciones();
	}

	@Test
	public void cuando15mas20entonces35() {
		int resiltado = this.opes.sumar(15, 20);
	/*	assertTrue(resiltado== 35);*/
		assertEquals(35, resiltado);
	}
	@Test
	public void cuandoa0entonces0() {
		int resiltado = this.opes.sumar(0, 20);
	/*	assertTrue(resiltado== 35);*/
		assertEquals(0, resiltado);
	}
	@Test
	public void cuandob0entonces0() {
		int resiltado = this.opes.sumar(Integer.MAX_VALUE,Integer.MAX_VALUE);
	/*	assertTrue(resiltado== 35);*/
		assertEquals(-2, resiltado);
	}

}
