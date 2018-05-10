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
	/**
	 * Konstruktor koji definise sve stavke menija i postavlja ih u odgovarajuce nizove
	 */
	public Meni() {
		Pizza p1 = new Pizza("Capricciosa", "/meni/pizze/rsz_capricciosa.jpg", 500, 740, 1090,
				"Pelat, sir, praska sunka, svez paradajz, sampinjoni, masline");
		Pizza p2 = new Pizza("Margarita", "/meni/pizze/rsz_margarita.jpg", 440, 660, 980,
				"Pelat, sir, parmezan, svez paradajz, masline");
		Pizza p3 = new Pizza("Serbiana", "/meni/pizze/rsz_serbiana.jpg", 570, 820, 1230,
				"Pelat, sir , panceta, sampinjoni, pavlaka, kulen, ljute papricice");
		Pizza p4 = new Pizza("Vegeteriano", "/meni/pizze/rsz_vegetariano.jpg", 470, 690, 1040,
				"Sir, sampinjoni, masline, paradajz, rukola, paprika, crveni luk");
		Pizza p5 = new Pizza("Vesuvio", "/meni/pizze/rsz_vesuvio.jpg", 500, 740, 1090,
				"Pelat, sir, praska sunka x2, paradajz, masline");

		pizze[0] = p1;
		pizze[1] = p2;
		pizze[2] = p3;
		pizze[3] = p4;
		pizze[4] = p5;

		Desert d1 = new Desert("Cokoladni mus", "Porcija od 200g", "/meni/deserti/rsz_cokoladni-mus.jpg", 260);
		Desert d2 = new Desert("Orasnice", "Porcija od 150g", "/meni/deserti/rsz_orasnice.jpg", 220);
		Desert d3 = new Desert("Tiramisu", "Porcija od 150g", "/meni/deserti/rsz_tiramisu.jpg", 220);

		deserti[0] = d1;
		deserti[1] = d2;
		deserti[2] = d3;

		Pice s1 = new Pice("/meni/pice/rsz_coca-cola.jpg", "Coca-Cola", 80, 120);
		Pice s2 = new Pice("/meni/pice/rsz_1fanta.jpg", "Fanta", 80, 120);
		Pice s3 = new Pice("/meni/pice/rsz_1sprite.jpg", "Sprite", 80, 120);

		pica[0] = s1;
		pica[1] = s2;
		pica[2] = s3;
	}
	/**
	 * Metoda koja pretrazuje niz pizza po nazivu jela
	 * @param p-naziv vrste pizze
	 * @return Objekat tipa Pizza 
	 * @throws Exception u slucaju da je naziv jela null
	 */
	public Pizza pretraziPizze(String p) throws Exception{
		if(p == null) 
			throw new Exception("Naziv jela ne sme biti null");
		for(int i = 0;i<pizze.length;i++) {
			if(pizze[i].getNaziv().contains(p))
				return pizze[i];
		}
		return null;
	}
	/**
	 * Metoda koja pretrazuje niz pica po nazivu
	 * @param p-naziv pica
	 * @return Objekat tipa Pice
	 * @throws Exception u slucaju da je naziv null
	 */
	public Pice pretraziPica(String p) throws Exception {
		if(p==null)
			throw new Exception("Naziv pica ne sme biti null");
		for(int i=0;i<pica.length;i++) {
			if(pica[i].getNaziv().contains(p))
				return pica[i];
		}
		return null;
	}
	/**
	 * Metoda koja pretrazuje niz deserta po nazivu
	 * @param d-naziv deserta
	 * @return Objekat tipa Desert
	 * @throws Exception u slucaju da je naziv null
	 */
	public Desert pretraziDeserte(String d) throws Exception {
		if(d==null)
			throw new Exception("Naziv deserta ne sme biti null");
		for(int i=0;i<deserti.length;i++) {
			if(deserti[i].getNaziv().contains(d))
				return deserti[i];
		}
		return null;
	}

}