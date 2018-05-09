package main;

import java.util.LinkedList;

import main.interfejs.PicerijaInterfejs;
import main.porudzbina.StavkaPorudzbine;
import main.sistemskeOperacije.SODodajPorudzbinuUListu;
import main.sistemskeOperacije.SOUpisiUBin;
import main.sistemskeOperacije.SOUpisiUTxt;

public class Picerija implements PicerijaInterfejs {

	// private LinkedList<StavkaPorudzbine> porudzbina;

	@Override
	public void serijalizujUBin(LinkedList<StavkaPorudzbine> porudzbina, String putanjaDoFajla) throws Exception {

		SOUpisiUBin.izvrsi(porudzbina, putanjaDoFajla);
	}
	
	
	@Override
	public void serijalizujUTxt(LinkedList<StavkaPorudzbine> porudzbina, String putanjaDoFajla) throws Exception {
		
		SOUpisiUTxt.izvrsi(porudzbina, putanjaDoFajla);
		
	}


	@Override
	public void dodajPorudzbinuUListu(LinkedList<StavkaPorudzbine> porudzbina, String naziv, double cena)
			throws Exception {

		SODodajPorudzbinuUListu.izvrsi(porudzbina, naziv, cena);
	}

}
