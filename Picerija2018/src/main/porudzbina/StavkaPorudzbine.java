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
	 * Ispisuje osnovne podatke o stavki formatirane na odgovarajuci nacin.
	 * 
	 * @return String Formatiran tekst koji sadrzi naziv i cenu stavke u dinarima.
	 */
	public String toString() {
		return String.format("%50s", naziv + "\t" + cena + " RSD \n");
	}
	
	/**
	 * Ispisuje osnovne podatke o stavki odnosno cenu i naziv.
	 * 
	 * @return String Tekst koji sadrzi naziv i cenu stavke u dinarima.
	 */
	public String toString2() {
		return naziv + "\t" + cena + " RSD \n";
	}
}
