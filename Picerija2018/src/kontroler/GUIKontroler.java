package kontroler;

import java.awt.EventQueue;

import gui.DesertGUI;
import gui.PiceGUI;
import gui.PicerijaGUI;
import gui.PizzaGUI;

public class GUIKontroler {

	public static PicerijaGUI gp;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PicerijaGUI gp = new PicerijaGUI();
					gp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
	
}
