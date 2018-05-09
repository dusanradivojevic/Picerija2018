package main.interfejs;

import java.util.LinkedList;
import main.porudzbina.StavkaPorudzbine;

public interface PicerijaInterfejs {

	public void serijalizujUBin(LinkedList<StavkaPorudzbine> porudzbina) throws Exception;
	
	public void serijalizujUTxt(LinkedList<StavkaPorudzbine> porudzbina) throws Exception;

	public void dodajPorudzbinuUListu(LinkedList<StavkaPorudzbine> porudzbina, String naziv, double cena)
			throws RuntimeException;
}
