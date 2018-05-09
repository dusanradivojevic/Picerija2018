package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import kontroler.GUIKontroler;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DesertGUI extends JFrame {
	private JLabel lblNewSlika;
	private JLabel lblNaziv;
	private JTextArea textAreaOpis;
	private JLabel lblTotal;
	private JTextField textFieldTotal;
	private JButton btnDodajUKorpu;

	/**
	 * Create the frame.
	 */
	public DesertGUI() {
		setTitle("Desert");
		setResizable(false);
		setBounds(100, 100, 568, 381);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewSlika());
		getContentPane().add(getLblNaziv());
		getContentPane().add(getTextAreaOpis());
		getContentPane().add(getLblTotal());
		getContentPane().add(getTextFieldTotal());
		getContentPane().add(getBtnDodajUKorpu());
	}

	private JLabel getLblNewSlika() {
		if (lblNewSlika == null) {
			lblNewSlika = new JLabel("New label");
			lblNewSlika.setBounds(35, 38, 201, 201);
		}
		return lblNewSlika;
	}

	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNaziv.setBounds(362, 38, 56, 16);
		}
		return lblNaziv;
	}

	private JTextArea getTextAreaOpis() {
		if (textAreaOpis == null) {
			textAreaOpis = new JTextArea();
			textAreaOpis.setBounds(335, 84, 136, 106);
		}
		return textAreaOpis;
	}

	private JLabel getLblTotal() {
		if (lblTotal == null) {
			lblTotal = new JLabel("Total:");
			lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblTotal.setBounds(72, 260, 56, 16);
		}
		return lblTotal;
	}

	private JTextField getTextFieldTotal() {
		if (textFieldTotal == null) {
			textFieldTotal = new JTextField();
			textFieldTotal.setEditable(false);
			textFieldTotal.setBounds(72, 289, 116, 22);
			textFieldTotal.setColumns(10);
		}
		return textFieldTotal;
	}

	private JButton getBtnDodajUKorpu() {
		if (btnDodajUKorpu == null) {
			btnDodajUKorpu = new JButton("Dodaj u korpu");
			btnDodajUKorpu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						GUIKontroler.ubaciPorudzbinuUListu(lblNaziv.getText(),
								Double.parseDouble(textFieldTotal.getText()));
					} catch (NumberFormatException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnDodajUKorpu.setBounds(322, 288, 138, 25);
		}
		return btnDodajUKorpu;
	}
}
