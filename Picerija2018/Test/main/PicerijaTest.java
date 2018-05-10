package main;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.porudzbina.StavkaPorudzbine;

public class PicerijaTest {
	private Picerija p;
	LinkedList<StavkaPorudzbine> l;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		p = new Picerija();
		l=null;
	}

	@After
	public void tearDown() throws Exception {
		p = null;
	}

	@Test
	public void testSerijalizujUBin() {
		fail("Not yet implemented");
	}

	@Test
	public void testSerijalizujUTxt() {
		fail("Not yet implemented");
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajPorudzbinuUListuNazivNull() {
		p.dodajPorudzbinuUListu(l, null, 300);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajPorudzbinuUListuNazivKraciOdDva() {
		p.dodajPorudzbinuUListu(l, "a", 300);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajPorudzbinuUListuCenaNegativna() {
		p.dodajPorudzbinuUListu(l, "Sladoled", -200);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testPretraziPizze() {
		p.pretraziPizze(null);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testPretraziPica() {
		p.pretraziPica(null);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testPretraziDeserte() {
		p.pretraziDeserte(null);
	}

}
