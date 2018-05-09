package main.sistemskeOperacije;

import java.util.LinkedList;

import main.porudzbina.StavkaPorudzbine;

public class SODodajPorudzbinuUListu {

	public static void izvrsi(LinkedList<StavkaPorudzbine> porudzbina, String naziv, double cena) throws RuntimeException {
		
		if(naziv == null || naziv.length() < 2)
			throw new RuntimeException("Nepravilan naziv stavke!");
		
		if(cena < 0)
			throw new RuntimeException("Nepravilna vrednost cene stavke!");
		
		porudzbina.add(new StavkaPorudzbine(naziv, cena));
	}
	
}
