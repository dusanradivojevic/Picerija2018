package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import kontroler.GUIKontroler;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PicerijaGUI extends JFrame{

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblPizza;
	private JLabel lblPice;
	private JLabel lblDesert;
	private JComboBox comboBoxPizza;
	private JComboBox comboBoxPice;
	private JComboBox comboBoxDesert;
	private JButton btnOdaberiPizzu;
	private JButton btnOdaberiPice;
	private JButton btnOdaberiDesert;
	private JLabel lblPorudzbina;
	private JButton btnPoruci;
	private JTextArea textArea;
	private JLabel lblTotal;
	private JTextField textField;
	private JLabel lblRsd;

	

	/**
	 * Create the frame.
	 */
	public PicerijaGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				ugasiAplikaciju();
			}
		});
		setResizable(false);
		setBounds(100, 100, 816, 512);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().add(getPanel(), BorderLayout.WEST);
		getContentPane().add(getPanel_1(), BorderLayout.EAST);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(350, 10));
			panel.setLayout(null);
			panel.add(getLblPizza());
			panel.add(getLblPice());
			panel.add(getLblDesert());
			panel.add(getComboBoxPizza());
			panel.add(getComboBoxPice());
			panel.add(getComboBox_1());
			panel.add(getBtnOdaberiPizzu());
			panel.add(getBtnOdaberiPice());
			panel.add(getBtnOdaberiDesert());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setPreferredSize(new Dimension(450, 10));
			panel_1.setLayout(null);
			panel_1.add(getLblPorudzbina());
			panel_1.add(getBtnPoruci());
			panel_1.add(getTextArea());
			panel_1.add(getLblTotal());
			panel_1.add(getTextField());
			panel_1.add(getLblRsd());
		}
		return panel_1;
	}
	private JLabel getLblPizza() {
		if (lblPizza == null) {
			lblPizza = new JLabel("Pizza");
			lblPizza.setBounds(31, 43, 56, 16);
		}
		return lblPizza;
	}
	private JLabel getLblPice() {
		if (lblPice == null) {
			lblPice = new JLabel("Pice");
			lblPice.setBounds(31, 163, 56, 16);
		}
		return lblPice;
	}
	private JLabel getLblDesert() {
		if (lblDesert == null) {
			lblDesert = new JLabel("Desert");
			lblDesert.setBounds(31, 291, 56, 16);
		}
		return lblDesert;
	}
	private JComboBox getComboBoxPizza() {
		if (comboBoxPizza == null) {
			comboBoxPizza = new JComboBox();
			comboBoxPizza.setModel(new DefaultComboBoxModel(new String[] {"Margarita", "Vegetariano", "Vesuvio", "Capricciosa", "Serbiana"}));
			comboBoxPizza.setBounds(31, 89, 111, 22);
		}
		return comboBoxPizza;
	}
	private JComboBox getComboBoxPice() {
		if (comboBoxPice == null) {
			comboBoxPice = new JComboBox();
			comboBoxPice.setModel(new DefaultComboBoxModel(new String[] {"\u0160ljiva", "Kru\u0161ka", "Dunja"}));
			comboBoxPice.setBounds(31, 205, 111, 22);
		}
		return comboBoxPice;
	}
	private JComboBox getComboBox_1() {
		if (comboBoxDesert == null) {
			comboBoxDesert = new JComboBox();
			comboBoxDesert.setModel(new DefaultComboBoxModel(new String[] {"\u010Cokoladni mus", "Tiramisu", "Orasnice"}));
			comboBoxDesert.setBounds(31, 334, 111, 22);
		}
		return comboBoxDesert;
	}
	private JButton getBtnOdaberiPizzu() {
		if (btnOdaberiPizzu == null) {
			btnOdaberiPizzu = new JButton("Odaberi pizzu");
			btnOdaberiPizzu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//pozivam metodu kojoj saljem string
					//comboBoxPizza.getSelectedItem().toString()
					//ona mi vraca 
					
					GUIKontroler.prikaziPizzaGUI();
				}
			});
			btnOdaberiPizzu.setBounds(190, 88, 131, 25);
		}
		return btnOdaberiPizzu;
	}
	private JButton getBtnOdaberiPice() {
		if (btnOdaberiPice == null) {
			btnOdaberiPice = new JButton("Odaberi pice");
			btnOdaberiPice.setBounds(190, 204, 131, 25);
		}
		return btnOdaberiPice;
	}
	private JButton getBtnOdaberiDesert() {
		if (btnOdaberiDesert == null) {
			btnOdaberiDesert = new JButton("Odaberi desert");
			btnOdaberiDesert.setBounds(190, 333, 131, 25);
		}
		return btnOdaberiDesert;
	}
	private JLabel getLblPorudzbina() {
		if (lblPorudzbina == null) {
			lblPorudzbina = new JLabel("Porudzbina");
			lblPorudzbina.setFont(new Font("Tahoma", Font.PLAIN, 24));
			lblPorudzbina.setBounds(154, 13, 147, 44);
		}
		return lblPorudzbina;
	}
	private JButton getBtnPoruci() {
		if (btnPoruci == null) {
			btnPoruci = new JButton("Poruci");
			btnPoruci.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnPoruci.setBounds(125, 400, 164, 38);
		}
		return btnPoruci;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBounds(47, 70, 361, 243);
		}
		return textArea;
	}
	private JLabel getLblTotal() {
		if (lblTotal == null) {
			lblTotal = new JLabel("Total:");
			lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblTotal.setBounds(73, 345, 56, 16);
		}
		return lblTotal;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 17));
			textField.setBounds(141, 341, 178, 28);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblRsd() {
		if (lblRsd == null) {
			lblRsd = new JLabel("RSD");
			lblRsd.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblRsd.setBounds(331, 347, 56, 16);
		}
		return lblRsd;
	}
	
	private void ugasiAplikaciju() {
		int opcija = JOptionPane.showConfirmDialog(contentPane, "Da li ZAISTA zelite da izadjete iz apliacije",
				"Izlazak", JOptionPane.YES_NO_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}
}
