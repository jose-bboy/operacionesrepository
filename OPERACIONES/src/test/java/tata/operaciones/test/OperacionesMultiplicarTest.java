package tata.operaciones.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.operaciones.Operaciones;

public class OperacionesMultiplicarTest {
	private Operaciones opes;
	@Before
	public void setUp() throws Exception {
		this.opes = new Operaciones();
	}

	@Test
	public void cuandobes0entonces1() {
		int resultado= this.opes.multiplicar(15, 0);
		assertTrue("Deberia ser 1 pero es "+resultado, resultado== 1);
	}
	@Test
	public void cuando15por10entonces150() {
		int resultado= this.opes.multiplicar(15, 10);
		assertTrue("Deberia ser 150 pero es "+resultado, resultado== 150);
	}

}
