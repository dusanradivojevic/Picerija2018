package main.sistemskeOperacije;

import meni.Meni;
import stavke.Pice;

public class SOPretraziPica {

	public static Pice izvrsi(String p) throws RuntimeException {
		if (p == null)
			throw new RuntimeException("Naziv pica ne sme biti null");
		
		Meni m = new Meni();
		
		for (int i = 0; i < m.pica.length; i++) {
			if (m.pica[i].getNaziv().contains(p))
				return m.pica[i];
		}
		
		return null;
	}
}
