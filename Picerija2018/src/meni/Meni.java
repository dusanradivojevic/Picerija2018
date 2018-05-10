package meni;

import stavke.Desert;
import stavke.Pice;
import stavke.Pizza;

/**
 * Klasa koja sadrzi sve stavke menija, sortirane prema tipu proizvoda
 * 
 * @author Nikola
 *
 */
public class Meni {
	/**
	 * Niz pizza koje su u ponudi
	 */
	Pizza[] pizze = null;
	/**
	 * Niz deserta u ponudi
	 */
	Desert[] deserti = null;
	/**
	 * Niz vrsta pica u ponudi
	 */
	Pice[] pica = null;

	public Meni() {
		Pizza p1 = new Pizza("Capricciosa", "putanja", 500, 740, 1090,
				"Pelat, sir, praska sunka, svez paradajz, sampinjoni, masline");
		Pizza p2 = new Pizza("Margarita", "putanja", 440, 660, 980, "Pelat, sir, parmezan, svez paradajz, masline");
		Pizza p3 = new Pizza("Serbiana", "putanja", 570, 820, 1230,
				"Pelat, sir , panceta, sampinjoni, pavlaka, kulen, ljute papricice");
		Pizza p4 = new Pizza("Vegeteriano", "putanja", 470, 690, 1040,
				"Sir, sampinjoni, masline, paradajz, rukola, paprika, crveni luk");
		Pizza p5 = new Pizza("Vesuvio", "putanja", 500, 740, 1090, "Pelat, sir, praska sunka x2, paradajz, masline");

		pizze[0] = p1;
		pizze[1] = p2;
		pizze[2] = p3;
		pizze[3] = p4;
		pizze[4] = p5;

		Desert d1 = new Desert("Cokoladni mus", "Porcija od 200g", "putanja", 260);
		Desert d2 = new Desert("Knedle sljiva", "3 komada u porciji", "putanja", 220);
		Desert d3 = new Desert("Knedle kajsija", "3 komada u porciji", "putanja", 220);

		deserti[0] = d1;
		deserti[1] = d2;
		deserti[2] = d3;

		Pice s1 = new Pice("putanja", "Coca-Cola", 80, 120);
		Pice s2 = new Pice("putanja", "Fanta", 80, 120);
		Pice s3 = new Pice("putanja", "Sprite", 80, 120);

		pica[0] = s1;
		pica[1] = s2;
		pica[2] = s3;
	}

}