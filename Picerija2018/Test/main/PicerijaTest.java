package main;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.porudzbina.StavkaPorudzbine;
import stavke.Pice;
import stavke.Pizza;

public class PicerijaTest {
	private Picerija p;
	private LinkedList<StavkaPorudzbine> l;
	private StavkaPorudzbine s;
	private Pizza pizza;
	private Pice pice;
	

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
		s= new StavkaPorudzbine("Sladoled",200);
		pizza = new Pizza("Capricciosa", "/meni/pizze/rsz_capricciosa.jpg", 500, 740, 1090,
				"- pelat\n- sir\n- praska sunka\n- svez paradajz\n- sampinjoni\n- masline");
		pice = new Pice("/meni/pice/rsz_coca-cola.jpg", "Coca-cola", 80, 120);
	}

	@After
	public void tearDown() throws Exception {
		p = null;
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
	
	/*@Test 
	public void testDodajPorudzbinuUListu() {
		
		assertEquals(s,p.dodajPorudzbinuUListu(l, "Sladoled", 200));
	}*/

	@Test (expected = java.lang.RuntimeException.class)
	public void testPretraziPizzeNull() {
		p.pretraziPizze(null);
	}
	
	@Test 
	public void testPretraziPizze() {
		assertEquals(pizza.getNaziv(), p.pretraziPizze("Capricciosa").getNaziv());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testPretraziPicaNull() {
		p.pretraziPica(null);
	}
	
	@Test 
	public void testPretraziPica() {
		assertEquals(pice.getNaziv(), p.pretraziPica("Coca-cola").getNaziv());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testPretraziDeserteNull() {
		p.pretraziDeserte(null);
	}

}
