package main.interfejs;

import java.util.LinkedList;

import main.porudzbina.StavkaPorudzbine;

public interface PicerijaInterfejs {
	
	public void serijalizuj(LinkedList<StavkaPorudzbine> porudzbina, String putanjaDoFajla) throws Exception;
	
	public void dodajPorudzbinuUListu(String naziv, double cena) throws Exception;
}
