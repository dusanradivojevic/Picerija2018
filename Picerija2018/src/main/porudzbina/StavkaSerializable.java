package main.porudzbina;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * Klasa koja predstavlja stavku iz porudzbine koja je specijalizovana
 * za upisivanje u data fajl.
 * 
 * @author Dusan Radivojevic
 * @version 1.0.0
 * 
 */

public class StavkaSerializable implements Serializable {
	
	/**
	 * Privatni atribut koji predstavlja listu stavki koje su porucene.
	 */
	private LinkedList<StavkaPorudzbine> porudzbina;
	
	/**
	 * Privatni atribut tipa String koji oznacava datum porudzbine.
	 */
	private String datum;
	
	/**
	 * Metoda koja vraca listu porudzbina.
	 * 
	 * @return Listu porudzbina.
	 */
	public LinkedList<StavkaPorudzbine> getPorudzbina() {
		return porudzbina;
	}
	
	/**
	 * Metoda postavlja listu porudzbina na konkretnu vrednost.
	 * 
	 * @param porudzbina Nova vrednost liste porudzbina.
	 */
	public void setPorudzbina(LinkedList<StavkaPorudzbine> porudzbina) {
		this.porudzbina = porudzbina;
	}
	
	/**
	 * Metoda koja vraca listu porudzbina.
	 * 
	 * @return Datum.
	 */
	public String getDatum() {
		return datum;
	}
	
	/**
	 * Metoda postavlja datum na konkretnu vrednost.
	 * 
	 * @param datum Nova vrednost datuma.
	 */
	public void setDatum(String datum) {
		this.datum = datum;
	}
	
}
