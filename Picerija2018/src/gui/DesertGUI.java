package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import kontroler.GUIKontroler;
import stavke.Desert;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.Window.Type;

public class DesertGUI extends JFrame {
	private JLabel lblNewSlika;
	private JLabel lblNaziv;
	private JTextArea textAreaOpis;
	private JLabel lblTotal;
	private JTextField textFieldTotal;
	private JButton btnDodajUKorpu;
	private JLabel lblRsd;
	private Desert desert;
	private JButton btnNewButton;

	/**
	 * Create the frame.
	 */
	public DesertGUI(Desert desert) {
		setUndecorated(true);
		this.desert = desert;
		setTitle("Desert");
		setResizable(false);
		setBounds(100, 100, 532, 380);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewSlika());
		getContentPane().add(getLblNaziv());
		getContentPane().add(getTextAreaOpis());
		getContentPane().add(getLblTotal());
		getContentPane().add(getTextFieldTotal());
		getContentPane().add(getBtnDodajUKorpu());
		getContentPane().add(getLblRsd());

		// kreiranje prozora u zavisnosti od odabranog deserta

		lblNaziv.setText(desert.getNaziv());
		lblNewSlika.setIcon(new ImageIcon(DesertGUI.class.getResource(desert.getPutanjaDoSlike())));
		textAreaOpis.setText(desert.getOpis());
		textFieldTotal.setText(desert.getCena() + "");
		getContentPane().add(getBtnNewButton());

	}

	private JLabel getLblNewSlika() {
		if (lblNewSlika == null) {
			lblNewSlika = new JLabel("");
			lblNewSlika.setPreferredSize(new Dimension(200, 200));
			lblNewSlika.setBounds(35, 38, 201, 201);
		}
		return lblNewSlika;
	}

	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setHorizontalAlignment(SwingConstants.CENTER);
			lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNaziv.setBounds(335, 38, 136, 33);
		}
		return lblNaziv;
	}

	private JTextArea getTextAreaOpis() {
		if (textAreaOpis == null) {
			textAreaOpis = new JTextArea();
			textAreaOpis.setMaximumSize(new Dimension(4, 22));
			textAreaOpis.setBorder(null);
			textAreaOpis.setEditable(false);
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
			textFieldTotal.setHorizontalAlignment(SwingConstants.RIGHT);
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
					dispose();
				}
			});
			btnDodajUKorpu.setBounds(322, 260, 138, 25);
		}
		return btnDodajUKorpu;
	}

	private JLabel getLblRsd() {
		if (lblRsd == null) {
			lblRsd = new JLabel("RSD");
			lblRsd.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblRsd.setBounds(200, 292, 56, 16);
		}
		return lblRsd;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Nazad");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton.setBounds(322, 296, 138, 23);
		}
		return btnNewButton;
	}
}
