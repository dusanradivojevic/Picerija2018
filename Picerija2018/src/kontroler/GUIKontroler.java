package kontroler;

import java.awt.EventQueue;
import java.util.LinkedList;

import gui.DesertGUI;
import gui.PiceGUI;
import gui.PicerijaGUI;
import gui.PizzaGUI;
import main.Picerija;
import main.interfejs.PicerijaInterfejs;
import main.porudzbina.StavkaPorudzbine;
import stavke.Desert;
import stavke.Pice;
import stavke.Pizza;

public class GUIKontroler {

	public static LinkedList<StavkaPorudzbine> porudzbina;

	public static PicerijaInterfejs picerija = new Picerija();
	public static PicerijaGUI gp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIKontroler.gp = new PicerijaGUI();
					gp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// pretvara listu u tekst porudzbine
	// ona sluzi da se upise u textAreaPorudzbina porudzbina
	public static String tekstPorudzbine() {
		String s = "";

		for (int i = 0; i < porudzbina.size(); i++) {
			s = s + porudzbina.get(i).toString();
		}

		return s;
	}

	public static void prikaziPizzaGUI(Pizza pizza) {
		PizzaGUI prozor = new PizzaGUI(pizza);
		prozor.setLocationRelativeTo(gp);
		prozor.setVisible(true);
	}

	public static void prikaziPiceGUI(Pice pice) {
		PiceGUI prozor = new PiceGUI(pice);
		prozor.setLocationRelativeTo(gp);
		prozor.setVisible(true);
	}

	public static void prikaziDesertGUI(Desert desert) {
		DesertGUI prozor = new DesertGUI(desert);
		prozor.setLocationRelativeTo(gp);
		prozor.setVisible(true);
	}

	public static void ubaciPorudzbinuUListu(String naziv, double cena) throws Exception {
		picerija.dodajPorudzbinuUListu(porudzbina, naziv, cena);
		gp.ispisiPorudzbinu();
	}

	public static double getTotal() {
		double total = 0;
		for (int i = 0; i < porudzbina.size(); i++) {
			total += porudzbina.get(i).getCena();
		}

		return total;
	}

	public static void zavrsiPorudzbinu() {

		try {
			picerija.serijalizujUBin(porudzbina);
			picerija.serijalizujUTxt(porudzbina);

			porudzbina = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Pizza nadjiPizzu(String naziv) {
		Pizza pizza = null;

		return pizza;
	}

	public static Pice nadjiPice(String naziv) {
		Pice pice = null;

		return pice;
	}

	public static Desert nadjiDesert(String naziv) {
		Desert desert = null;

		return desert;
	}

}
