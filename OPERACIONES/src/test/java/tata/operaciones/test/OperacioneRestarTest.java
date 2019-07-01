package tata.operaciones.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.operaciones.Operaciones;

public class OperacioneRestarTest {
	private Operaciones opes;
	@Before
	public void setUp() throws Exception {
		this.opes = new Operaciones();
	}

	@Test
	public void cuando15menos5entonces10() {
	 int resultado= this.opes.restar(15, 5);
	 assertTrue("Deberia se 10 pero es "+resultado, resultado== 10);
	}

	@Test
	public void cuandobesmayorqueaentonces0() {
	 int resultado= this.opes.restar(5, 15);
	 assertTrue("Deberia ser 0 pero es "+resultado, resultado== 0);
	}

}
