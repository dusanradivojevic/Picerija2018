package main.sistemskeOperacije;

import meni.Meni;
import stavke.Desert;

public class SOPretraziDeserte {

	public static Desert izvrsi(String d) throws RuntimeException {
		if (d == null)
			throw new RuntimeException("Naziv deserta ne sme biti null");
		
		Meni m = new Meni();
		
		for (int i = 0; i < m.deserti.length; i++) {
			if (m.deserti[i].getNaziv().contains(d))
				return m.deserti[i];
		}
		
		return null;
	}
}
