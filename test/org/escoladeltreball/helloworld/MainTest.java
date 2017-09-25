/**
 * 
 */
package org.escoladeltreball.helloworld;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author jmenesesl
 *
 */
public class MainTest {

	private static Main main;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("in setUpBeforeClass method");
		main = new Main();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("in tearDownAfterClass method");
		main = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("in setUp method");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("in tearDown method");
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.helloworld.Main#findSmallest(int[])}.
	 */
	@Test
	public final void testFindSmallest() {
		assertEquals(1, main.findSmallest(new int[] { 1, 2, 3 }));
		assertEquals(0, main.findSmallest(new int[] { 4, 0, 1, 2, 3 }));
		assertEquals(-2, main.findSmallest(new int[] { 1, -2, 3 }));
		assertEquals(3, main.findSmallest(new int[] { 3 }));
		assertEquals(1, main.findSmallest(new int[] { 1, 1, 1 }));
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#sum(int[])}.
	 */
	// @Ignore("El tractarem més tard")
	@Test
	public final void testSum() {
//		fail("Not yet implemented"); // TODO
		int[] values = {3, 4, 3, 5, 1, 2, 3, 0 };
		assertEquals(21, main.sum(values));
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.helloworld.Main#frequency(int[], int)}.
	 */
	// @Ignore("El tractarem més tard")
	@Test
	public final void testFrequency() {
		int[] values = {3, 4, 3, 5, 1, 2, 3, 0 };
		assertEquals(3, main.frequency(values, 3));
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.helloworld.Main#frequencyPercentage(int[], int)}.
	 */
	//@Ignore("El tractarem més tard")
	@Test
	public final void testFrequencyPercentage() {
		int[] values = {3, 4, 3, 5, 1, 2, 3, 0 };
		assertEquals(37.5, main.frequencyPercentage(values, 3), 1e-2);
	}
	
	/**
	 * Test method for
	 * {@link org.escoladeltreball.helloworld.Main#frequencyPercentage(int[], int)}.
	 */
//	@Ignore("El tractarem més tard")
	@Test
	public final void testMerge() {
		int[] values = { 3, 7, 9, 10, 13, 21 }; // el vector original
		int[] result = { 3, 7, 9, 10, 11, 13, 21 }; // El resultado esperado
		int[] resultat = main.merge(values, 11); // resultado del método
		int iguales = 0;
		/*
		 * En el siguiente for, se compararan los dos vectores con el fin de determinar que son iguales
		 * de la siguiente forma:
		 * si se consigue la misma cantidad de igualdades que el tamaño del array a resultar son iguales.
		 */
		for (int i = 0; i < result.length; i++) {
			if (result[i] == resultat[i]) {
				iguales++;
			}
		}
		assertEquals(iguales, result.length);
	}
	

	/**
	 * Test method for
	 * {@link org.escoladeltreball.helloworld.Main#frequencyPercentage(int[], int)}.
	 */
//	@Ignore("El tractarem més tard")
	@Test
	public final void testIsPresent() {
		int[] values = {3, 7, 9, 10, 13, 21 };
		assertEquals(true, main.isPresent(values, 3));
	}
	
	

}
