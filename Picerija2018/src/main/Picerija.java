package main;

import java.util.LinkedList;

import main.interfejs.PicerijaInterfejs;
import main.porudzbina.StavkaPorudzbine;
import main.sistemskeOperacije.SODodajPorudzbinuUListu;
import main.sistemskeOperacije.SOPretraziDeserte;
import main.sistemskeOperacije.SOPretraziPica;
import main.sistemskeOperacije.SOPretraziPizze;
import main.sistemskeOperacije.SOUpisiUBin;
import main.sistemskeOperacije.SOUpisiUTxt;
import meni.Meni;
import stavke.Desert;
import stavke.Pice;
import stavke.Pizza;

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
	 * @param porudzbina
	 *            Lista stavki iz porudzbine.
	 * 
	 * @throws java.lang.Exception
	 *             U slucaju greske prilikom upisivanja u data fajl.
	 */

	@Override
	public void serijalizujUBin(LinkedList<StavkaPorudzbine> porudzbina) throws Exception {

		SOUpisiUBin.izvrsi(porudzbina);
	}

	/**
	 * Metoda koja podatke o porudzbini upisuje u tekstualni fajl.
	 * 
	 * @param porudzbina
	 *            Lista stavki iz porudzbine.
	 * 
	 * @throws java.lang.Exception
	 *             U slucaju greske prilikom upisivanja u tekstualni fajl.
	 */
	@Override
	public void serijalizujUTxt(LinkedList<StavkaPorudzbine> porudzbina) throws Exception {
		SOUpisiUTxt.izvrsi(porudzbina);

	}

	/**
	 * Metoda koja pojedinacne stavke dodaje u listu porudzbina.
	 * 
	 * @param porudzbina
	 *            Lista stavki iz porudzbine.
	 * 
	 * @param naziv
	 *            Naziv porucene stavke.
	 * 
	 * @param cena
	 *            Cena porucene stavke.
	 * 
	 * @throws java.lang.RuntimeException
	 *             U slucaju da je parametar naziv prazan ili null string ili cena
	 *             stavke negativna.
	 */
	@Override
	public void dodajPorudzbinuUListu(LinkedList<StavkaPorudzbine> porudzbina, String naziv, double cena)
			throws RuntimeException {

		SODodajPorudzbinuUListu.izvrsi(porudzbina, naziv, cena);
	}

	/**
	 * Metoda koja pretrazuje niz pizza po nazivu jela
	 * 
	 * @param p Naziv vrste pizze.
	 * 
	 * @return Objekat tipa Pizza.
	 * 
	 * @throws java.lang.RuntimeException U slucaju da je naziv jela null.
	 */
	@Override
	public Pizza pretraziPizze(String p) throws RuntimeException {
		
		return SOPretraziPizze.izvrsi(p);
	}

	/**
	 * Metoda koja pretrazuje niz pica po nazivu
	 * 
	 * @param p Naziv vrste pica.
	 * 
	 * @return Objekat tipa Pice.
	 * 
	 * @throws java.lang.RuntimeException U slucaju da je naziv pica null.
	 */
	@Override
	public Pice pretraziPica(String p) throws RuntimeException {

		return SOPretraziPica.izvrsi(p);
	}

	/**
	 * Metoda koja pretrazuje niz deserta po nazivu
	 * 
	 * @param d Naziv vrste deserta.
	 * 
	 * @return Objekat tipa Desert.
	 * 
	 * @throws java.lang.RuntimeException U slucaju da je naziv null.
	 */
	@Override
	public Desert pretraziDeserte(String d) throws RuntimeException {

		return SOPretraziDeserte.izvrsi(d);
	}

}
