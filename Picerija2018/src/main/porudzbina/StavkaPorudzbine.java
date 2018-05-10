package main.porudzbina;

/**
 * Klasa koja predstavlja stavku iz porudzbine
 * sa osnovnim karakteristikama.
 * 
 * @author Dusan Radivojevic
 * @version 1.0.0
 * 
 */

public class StavkaPorudzbine {
	
	/**
	 * Privatni atribut tipa String koji oznacava naziv stavke.
	 */
	private String naziv;
	
	/**
	 * Privatni atribut tipa double koji oznacava cenu stavke.
	 */
	private double cena;
	
	/**
	 * Default konstruktor bez parametara.
	 */
	public StavkaPorudzbine() {
		
	}
	
	/**
	 * Konstruktor koji postavlja atribute naziv i cenu na vrednosti odredjene parametrima.
	 * 
	 * @param naziv Naziv stavke iz porudzbine.
	 * 
	 * @param cena Cena stavke iz porudzbine.
	 */
	public StavkaPorudzbine(String naziv, double cena) {
		this.naziv = naziv;
		this.cena = cena;
	}
	
	/**
	 * Metoda koja vraca cenu stavke.
	 * 
	 * @return cena Cena stavke.
	 */
	public double getCena() {
		return cena;
	}
	
	/**
	 * Metoda koja ispisuje osnovne podatke o stavki odnosno naziv i cenu.
	 * 
	 * @return String Formatiran tekst koji sadrzi naziv i cenu stavke u dinarima.
	 */
	@Override
	public String toString() {
		return naziv + "\t\t" + cena + " RSD \n";
	}
	
}
