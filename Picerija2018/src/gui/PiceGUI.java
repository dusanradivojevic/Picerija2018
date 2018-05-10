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
import stavke.Pice;

import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;

public class PiceGUI extends JFrame {
	private JPanel contentPane;
	private JLabel lblSlika;
	private JLabel lblNaziv;
	private JRadioButton rdbtn05;
	private JRadioButton rdbtn033;
	private JLabel lblTotal;
	private JTextField textFieldTotal;
	private JButton btnDodajUKorpu;
	private JLabel lblRsd;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Pice pice;

	/**
	 * Create the frame.
	 */
	public PiceGUI(Pice pice) {
		this.pice = pice;
		setTitle("Pi\u0107e");
		setResizable(false);
		setBounds(100, 100, 492, 400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().add(getLblSlika());
		getContentPane().add(getLblNaziv());
		getContentPane().add(getRdbtn05());
		getContentPane().add(getRdbtn033());
		getContentPane().add(getLblTotal());
		getContentPane().add(getTextFieldTotal());
		getContentPane().add(getBtnDodajUKorpu());
		getContentPane().add(getLblRsd());

		// kreiranje prozora u zavisnosti od odabranog pica

		lblNaziv.setText(pice.getNaziv());
		lblSlika.setIcon(new ImageIcon(PiceGUI.class.getResource(pice.getPutanja())));
	}

	private JLabel getLblSlika() {
		if (lblSlika == null) {
			lblSlika = new JLabel("New label");
			lblSlika.setPreferredSize(new Dimension(200, 200));
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

	private JRadioButton getRdbtn05() {
		if (rdbtn05 == null) {
			rdbtn05 = new JRadioButton("0,5 l");
			rdbtn05.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textFieldTotal.setText(pice.getVelika() + "");
				}
			});
			buttonGroup.add(rdbtn05);
			rdbtn05.setFont(new Font("Tahoma", Font.PLAIN, 15));
			rdbtn05.setBounds(289, 243, 127, 25);
		}
		return rdbtn05;
	}

	private JRadioButton getRdbtn033() {
		if (rdbtn033 == null) {
			rdbtn033 = new JRadioButton("0,33 l");
			rdbtn033.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textFieldTotal.setText(pice.getMala() + "");
				}
			});
			buttonGroup.add(rdbtn033);
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
			textFieldTotal.setHorizontalAlignment(SwingConstants.RIGHT);
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
						velicina = "Mala ";
					if (rdbtn05.isSelected())
						velicina = "Velika ";

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

	private JLabel getLblRsd() {
		if (lblRsd == null) {
			lblRsd = new JLabel("RSD");
			lblRsd.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblRsd.setBounds(153, 322, 56, 16);
		}
		return lblRsd;
	}
}
