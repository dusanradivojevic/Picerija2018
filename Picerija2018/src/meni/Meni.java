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
	public Pizza[] pizze = null;

	/**
	 * Niz deserta u ponudi
	 */
	public Desert[] deserti = null;

	/**
	 * Niz vrsta pica u ponudi
	 */
	public Pice[] pica = null;

	/**
	 * Konstruktor koji definise sve stavke menija i postavlja ih u odgovarajuce
	 * nizove
	 */
	public Meni() {
		Pizza p1 = new Pizza("Capricciosa", "/meni/pizze/rsz_capricciosa.jpg", 500, 740, 1090,
				"Pelat, sir, praska sunka, svez paradajz, sampinjoni, masline");
		Pizza p2 = new Pizza("Margarita", "/meni/pizze/rsz_margarita.jpg", 440, 660, 980,
				"Pelat, sir, parmezan, svez paradajz, masline");
		Pizza p3 = new Pizza("Serbiana", "/meni/pizze/rsz_serbiana.jpg", 570, 820, 1230,
				"Pelat, sir , panceta, sampinjoni, pavlaka, kulen, ljute papricice");
		Pizza p4 = new Pizza("Vegetariana", "/meni/pizze/rsz_vegetariano.jpg", 470, 690, 1040,
				"Sir, sampinjoni, masline, paradajz, rukola, paprika, crveni luk");
		Pizza p5 = new Pizza("Vesuvio", "/meni/pizze/rsz_vesuvio.jpg", 500, 740, 1090,
				"Pelat, sir, praska sunka x2, paradajz, masline");

		pizze = new Pizza[5];

		pizze[0] = p1;
		pizze[1] = p2;
		pizze[2] = p3;
		pizze[3] = p4;
		pizze[4] = p5;

		Desert d1 = new Desert("Cokoladni mus", "Porcija od 200g", "/meni/deserti/rsz_cokoladni-mus.jpg", 260);
		Desert d2 = new Desert("Orasnice", "Porcija od 150g", "/meni/deserti/rsz_orasnice.jpg", 220);
		Desert d3 = new Desert("Tiramisu", "Porcija od 150g", "/meni/deserti/rsz_tiramisu.jpg", 220);

		deserti = new Desert[3];
		
		deserti[0] = d1;
		deserti[1] = d2;
		deserti[2] = d3;

		Pice s1 = new Pice("/meni/pice/rsz_coca-cola.jpg", "Coca-cola", 80, 120);
		Pice s2 = new Pice("/meni/pice/rsz_1fanta.jpg", "Fanta", 80, 120);
		Pice s3 = new Pice("/meni/pice/rsz_1sprite.jpg", "Sprite", 80, 120);

		pica = new Pice[3];
		
		pica[0] = s1;
		pica[1] = s2;
		pica[2] = s3;
	}

}