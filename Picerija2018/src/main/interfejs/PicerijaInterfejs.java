package main.interfejs;

import java.util.LinkedList;
import main.porudzbina.StavkaPorudzbine;
import stavke.Desert;
import stavke.Pice;
import stavke.Pizza;

public interface PicerijaInterfejs {

	public void serijalizujUBin(LinkedList<StavkaPorudzbine> porudzbina) throws Exception;

	public void serijalizujUTxt(LinkedList<StavkaPorudzbine> porudzbina) throws Exception;

	public LinkedList<StavkaPorudzbine> dodajPorudzbinuUListu(LinkedList<StavkaPorudzbine> porudzbina, String naziv, double cena)
			throws RuntimeException;

	public Pizza pretraziPizze(String p) throws RuntimeException;

	public Pice pretraziPica(String p) throws RuntimeException;

	public Desert pretraziDeserte(String d) throws RuntimeException;

}
