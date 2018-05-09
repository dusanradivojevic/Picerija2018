package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import kontroler.GUIKontroler;

import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class PiceGUI extends JFrame {
	private JPanel contentPane;
	private JLabel lblSlika;
	private JLabel lblNaziv;
	private JTextArea textAreaOpis;
	private JRadioButton rdbtn05;
	private JRadioButton rdbtn033;
	private JLabel lblTotal;
	private JTextField textFieldTotal;
	private JButton btnDodajUKorpu;

	/**
	 * Create the frame.
	 */
	public PiceGUI() {
		setTitle("Pi\u0107e");
		setResizable(false);
		setBounds(100, 100, 492, 400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().add(getLblSlika());
		getContentPane().add(getLblNaziv());
		getContentPane().add(getTextAreaOpis());
		getContentPane().add(getRdbtn05());
		getContentPane().add(getRdbtn033());
		getContentPane().add(getLblTotal());
		getContentPane().add(getTextFieldTotal());
		getContentPane().add(getBtnDodajUKorpu());
	}

	private JLabel getLblSlika() {
		if (lblSlika == null) {
			lblSlika = new JLabel("New label");
			lblSlika.setBounds(25, 38, 200, 200);
		}
		return lblSlika;
	}

	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNaziv.setBounds(310, 38, 56, 16);
		}
		return lblNaziv;
	}

	private JTextArea getTextAreaOpis() {
		if (textAreaOpis == null) {
			textAreaOpis = new JTextArea();
			textAreaOpis.setBounds(278, 78, 126, 108);
		}
		return textAreaOpis;
	}

	private JRadioButton getRdbtn05() {
		if (rdbtn05 == null) {
			rdbtn05 = new JRadioButton("0,5 l");
			rdbtn05.setFont(new Font("Tahoma", Font.PLAIN, 15));
			rdbtn05.setBounds(289, 243, 127, 25);
		}
		return rdbtn05;
	}

	private JRadioButton getRdbtn033() {
		if (rdbtn033 == null) {
			rdbtn033 = new JRadioButton("0,33 l");
			rdbtn033.setFont(new Font("Tahoma", Font.PLAIN, 15));
			rdbtn033.setBounds(289, 213, 127, 25);
		}
		return rdbtn033;
	}

	private JLabel getLblTotal() {
		if (lblTotal == null) {
			lblTotal = new JLabel("Total:");
			lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblTotal.setBounds(25, 290, 56, 16);
		}
		return lblTotal;
	}

	private JTextField getTextFieldTotal() {
		if (textFieldTotal == null) {
			textFieldTotal = new JTextField();
			textFieldTotal.setEditable(false);
			textFieldTotal.setBounds(25, 319, 116, 22);
			textFieldTotal.setColumns(10);
		}
		return textFieldTotal;
	}

	private JButton getBtnDodajUKorpu() {
		if (btnDodajUKorpu == null) {
			btnDodajUKorpu = new JButton("Dodaj u korpu");
			btnDodajUKorpu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String velicina = null;
					if (rdbtn033.isSelected())
						velicina = "0,33 l ";
					if (rdbtn05.isSelected())
						velicina = "0,5 l ";

					try {
						GUIKontroler.ubaciPorudzbinuUListu(velicina + lblNaziv.getText(),
								Double.parseDouble(textFieldTotal.getText()));
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					dispose();
				}
			});
			btnDodajUKorpu.setBounds(278, 316, 115, 25);
		}
		return btnDodajUKorpu;
	}
}
