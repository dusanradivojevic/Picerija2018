package main;

import java.util.LinkedList;

import main.interfejs.PicerijaInterfejs;
import main.porudzbina.StavkaPorudzbine;
import main.sistemskeOperacije.SODodajPorudzbinuUListu;
import main.sistemskeOperacije.SOUpisiUBin;
import main.sistemskeOperacije.SOUpisiUTxt;

public class Picerija implements PicerijaInterfejs {

	// private LinkedList<StavkaPorudzbine> porudzbina;

	/**
	 * Metoda koja podatke o porudzbini upisuje u data fajl.
	 */

	@Override
	public void serijalizujUBin(LinkedList<StavkaPorudzbine> porudzbina) throws Exception {

		SOUpisiUBin.izvrsi(porudzbina);
	}

	/**
	 * Metoda koja podatke o porudzbini upisuje u tekstualni fajl.
	 */
	@Override
	public void serijalizujUTxt(LinkedList<StavkaPorudzbine> porudzbina) throws Exception {

		SOUpisiUTxt.izvrsi(porudzbina);

	}

	/**
	 * Metoda koja pojedinacne stavke dodaje u listu porudzbina.
	 */
	@Override
	public void dodajPorudzbinuUListu(LinkedList<StavkaPorudzbine> porudzbina, String naziv, double cena)
			throws Exception {

		SODodajPorudzbinuUListu.izvrsi(porudzbina, naziv, cena);
	}

}
