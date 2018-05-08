package main.interfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import main.porudzbina.StavkaPorudzbine;

public interface PicerijaInterfejs {
	
	public void serijalizuj(LinkedList<StavkaPorudzbine> porudzbina, GregorianCalendar datum);
	
	public void dodajPorudzbinu(String naziv, double cena);
}
