package main.sistemskeOperacije;

import java.util.LinkedList;

import main.porudzbina.StavkaPorudzbine;

public class SODodajPorudzbinuUListu {

	public static void izvrsi(LinkedList<StavkaPorudzbine> porudzbina, String naziv, double cena) throws Exception {
		if(naziv == null || naziv.length() < 2 || cena < 0)
			throw new Exception("Greska");
		// exception ili void -> bool i onda false
		
		porudzbina.add(new StavkaPorudzbine(naziv, cena));
	}
	
}
