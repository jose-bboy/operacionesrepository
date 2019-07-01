package tata.operaciones.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.operaciones.Operaciones;

public class OperacionesDividicionTest {
	private Operaciones opes;
	@Before
	public void setUp() throws Exception {
		this.opes = new Operaciones();
	}

	@Test
	public void cuandobes0entonces0() {
		double resultado= this.opes.dividir(15, 0);
		assertTrue("Deberia ser 0 pero es "+resultado, resultado== 0);
	}
	@Test
	public void cuando15Divididoen20entonces075() {
		double resultado= this.opes.dividir(15, 20);
		assertTrue("Deberia ser 0 pero es "+resultado, resultado== 0.75d);
	}

}
