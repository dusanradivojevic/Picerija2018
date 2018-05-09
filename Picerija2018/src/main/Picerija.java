package main;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import main.interfejs.PicerijaInterfejs;
import main.porudzbina.StavkaPorudzbine;
import main.sistemskeOperacije.SODodajPorudzbinuUListu;
import main.sistemskeOperacije.SOSerijalizuj;

public class Picerija implements PicerijaInterfejs {

	// private LinkedList<StavkaPorudzbine> porudzbina;

	@Override
	public void serijalizuj(LinkedList<StavkaPorudzbine> porudzbina, String putanjaDoFajla) throws Exception {

		SOSerijalizuj.izvrsi(porudzbina, new GregorianCalendar(), putanjaDoFajla);
	}

	@Override
	public void dodajPorudzbinuUListu(LinkedList<StavkaPorudzbine> porudzbina, String naziv, double cena)
			throws Exception {

		SODodajPorudzbinuUListu.izvrsi(porudzbina, naziv, cena);
	}

}
