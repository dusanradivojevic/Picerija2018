package main.sistemskeOperacije;

import meni.Meni;
import stavke.Pizza;

public class SOPretraziPizze {

	public static Pizza izvrsi(String p) throws RuntimeException {
		if (p == null)
			throw new RuntimeException("Naziv jela ne sme biti null");

		Meni m = new Meni();

		for (int i = 0; i < m.pizze.length; i++) {
			if (m.pizze[i].getNaziv().contains(p))
				return m.pizze[i];
		}
		
		return null;
	}
}
