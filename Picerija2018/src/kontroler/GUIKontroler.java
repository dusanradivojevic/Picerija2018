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
	
	//pretvara listu u tekst porudzbine
	//ona sluzi da se upise u textAreaPorudzbina porudzbina
	public static String tekstPorudzbine() {
		String s = "";
		
		for (int i = 0; i < porudzbina.size(); i++) {
			s = s + porudzbina.get(i).toString();
		}
		
		return s;		
	}
	
	public static void prikaziPizzaGUI() {
		PizzaGUI prozor = new PizzaGUI();
		prozor.setLocationRelativeTo(gp);
		prozor.setVisible(true);
	}
	
	public static void prikaziPiceGUI() {
		PiceGUI prozor = new PiceGUI();
		prozor.setLocationRelativeTo(gp);
		prozor.setVisible(true);
	}
	
	public static void prikaziDesertGUI() {
		DesertGUI prozor = new DesertGUI();
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
	
}
