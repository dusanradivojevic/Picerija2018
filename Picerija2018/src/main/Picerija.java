package main;

import java.util.LinkedList;

import main.interfejs.PicerijaInterfejs;
import main.porudzbina.StavkaPorudzbine;
import main.sistemskeOperacije.SODodajPorudzbinuUListu;
import main.sistemskeOperacije.SOUpisiUBin;
import main.sistemskeOperacije.SOUpisiUTxt;

/**
 * Klasa koja predstavlja piceriju sa osnovnim funkcijama.
 * 
 * @author Dusan Radivojevic
 * @version 1.0.0
 * 
 */

public class Picerija implements PicerijaInterfejs {

	/**
	 * Metoda koja podatke o porudzbini upisuje u data fajl.
	 * 
	 * @param porudzbina Lista stavki iz porudzbine.
	 * 
	 * @throws java.lang.Exception U slucaju greske prilikom upisivanja u data fajl.
	 */
	@Override
	public void serijalizujUBin(LinkedList<StavkaPorudzbine> porudzbina, String putanjaDoFajla) throws Exception {

		SOUpisiUBin.izvrsi(porudzbina, putanjaDoFajla);
	}
	
	
	/**
	 * Metoda koja podatke o porudzbini upisuje u tekstualni fajl.
	 * 
	 * @param porudzbina Lista stavki iz porudzbine.
	 * 
	 * @throws java.lang.Exception U slucaju greske prilikom upisivanja u tekstualni fajl.
	 */
	@Override
	public void serijalizujUTxt(LinkedList<StavkaPorudzbine> porudzbina, String putanjaDoFajla) throws Exception {
		
		SOUpisiUTxt.izvrsi(porudzbina, putanjaDoFajla);		
	}


	/**
	 * Metoda koja pojedinacne stavke dodaje u listu porudzbina.
	 * 
	 * @param porudzbina Lista stavki iz porudzbine.
	 * 
	 * @param naziv Naziv porucene stavke.
	 * 
	 * @param cena Cena porucene stavke.
	 * 
	 * @throws java.lang.RuntimeException U slucaju da je parametar naziv prazan ili null string
	 * ili cena stavke negativna.
	 */
	@Override
	public void dodajPorudzbinuUListu(LinkedList<StavkaPorudzbine> porudzbina, String naziv, double cena)
			throws RuntimeException {

		SODodajPorudzbinuUListu.izvrsi(porudzbina, naziv, cena);
	}

}
