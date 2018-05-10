package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PicerijaTest {
	
	private Picerija p;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		p = new Picerija();
	}

	@After
	public void tearDown() throws Exception {
		p = null;
	}

	@Test
	public void testSerijalizujUBin() {
		fail("Not yet implemented");
	}

}
