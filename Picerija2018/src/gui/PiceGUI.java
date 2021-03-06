package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import kontroler.GUIKontroler;
import stavke.Pice;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.awt.Color;

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
		getContentPane().setBackground(Color.GRAY);
		setUndecorated(true);
		this.pice = pice;
		setTitle("Pi\u0107e");
		setResizable(false);
		setBounds(100, 100, 443, 400);
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

		JButton btnNewButton = new JButton("Nazad");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setActionCommand("");
		btnNewButton.setBounds(278, 335, 115, 23);
		getContentPane().add(btnNewButton);
	}

	private JLabel getLblSlika() {
		if (lblSlika == null) {
			lblSlika = new JLabel("");
			lblSlika.setPreferredSize(new Dimension(200, 200));
			lblSlika.setBounds(25, 38, 200, 200);
		}
		return lblSlika;
	}

	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setForeground(Color.WHITE);
			lblNaziv.setHorizontalAlignment(SwingConstants.CENTER);
			lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNaziv.setBounds(256, 38, 160, 34);
		}
		return lblNaziv;
	}

	private JRadioButton getRdbtn05() {
		if (rdbtn05 == null) {
			rdbtn05 = new JRadioButton("0,5 l");
			rdbtn05.setForeground(Color.WHITE);
			rdbtn05.setBackground(Color.GRAY);
			rdbtn05.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textFieldTotal.setText(pice.getVelika() + "");
				}
			});
			buttonGroup.add(rdbtn05);
			rdbtn05.setFont(new Font("Tahoma", Font.BOLD, 15));
			rdbtn05.setBounds(289, 148, 127, 25);
		}
		return rdbtn05;
	}

	private JRadioButton getRdbtn033() {
		if (rdbtn033 == null) {
			rdbtn033 = new JRadioButton("0,33 l");
			rdbtn033.setForeground(Color.WHITE);
			rdbtn033.setBackground(Color.GRAY);
			rdbtn033.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textFieldTotal.setText(pice.getMala() + "");
				}
			});
			buttonGroup.add(rdbtn033);
			rdbtn033.setFont(new Font("Tahoma", Font.BOLD, 15));
			rdbtn033.setBounds(289, 107, 127, 25);
		}
		return rdbtn033;
	}

	private JLabel getLblTotal() {
		if (lblTotal == null) {
			lblTotal = new JLabel("Total:");
			lblTotal.setForeground(Color.WHITE);
			lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblTotal.setBounds(25, 290, 56, 16);
		}
		return lblTotal;
	}

	private JTextField getTextFieldTotal() {
		if (textFieldTotal == null) {
			textFieldTotal = new JTextField();
			textFieldTotal.setFont(new Font("Tahoma", Font.PLAIN, 17));
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
						if(lblNaziv.getText().equals("Sprite"))
							velicina = "Mali ";
						else
							velicina = "Mala ";
					if (rdbtn05.isSelected())
						if(lblNaziv.getText().equals("Sprite"))
							velicina = "Veliki ";
						else
							velicina = "Velika ";

					try {
						if (velicina == null) {
							JOptionPane.showMessageDialog(contentPane, "Molim Vas, odaberite velicinu pica!", null,
									JOptionPane.WARNING_MESSAGE);

							return;
						}
						GUIKontroler.ubaciPorudzbinuUListu(velicina + lblNaziv.getText(),
								Double.parseDouble(textFieldTotal.getText()));
					} catch (NumberFormatException e) {
						e.printStackTrace();
					} catch (Exception e) {
						e.printStackTrace();
					}

					dispose();
				}
			});
			btnDodajUKorpu.setBounds(278, 290, 115, 25);
		}
		return btnDodajUKorpu;
	}

	private JLabel getLblRsd() {
		if (lblRsd == null) {
			lblRsd = new JLabel("RSD");
			lblRsd.setForeground(Color.WHITE);
			lblRsd.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblRsd.setBounds(153, 322, 56, 16);
		}
		return lblRsd;
	}
}
