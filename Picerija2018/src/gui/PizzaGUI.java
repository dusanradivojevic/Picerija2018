package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import kontroler.GUIKontroler;
import main.porudzbina.StavkaPorudzbine;
import stavke.Pizza;

import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Window.Type;

public class PizzaGUI extends JFrame {
	private JPanel contentPane;
	private JLabel lblSlika;
	private JLabel lblNaziv;
	private JTextArea txtrOpis;
	private JRadioButton rdbtnMala;
	private JRadioButton rdbtnSrednja;
	private JRadioButton rdbtnVelika;
	private JLabel lblTotal;
	private JTextField textFieldTotal;
	private JButton btnDodajUKorpu;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblMala;
	private JLabel lblSrednja;
	private JLabel lblVelika;
	private JLabel lblRsd;
	private Pizza pizza;
	private JButton btnNewButton;

	/**
	 * Create the frame.
	 */
	public PizzaGUI(Pizza pizza) {
		setUndecorated(true);
		this.pizza = pizza;

		setTitle("Pizza");
		setResizable(false);
		setBounds(100, 100, 534, 398);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().add(getLblSlika());
		getContentPane().add(getLblNaziv());
		getContentPane().add(getTxtrOpis());
		getContentPane().add(getRdbtnMala());
		getContentPane().add(getRdbtnSrednja());
		getContentPane().add(getRdbtnVelika());
		getContentPane().add(getLblTotal());
		getContentPane().add(getTextFieldTotal());
		getContentPane().add(getBtnDodajUKorpu());
		getContentPane().add(getLblMala());
		getContentPane().add(getLblSrednja());
		getContentPane().add(getLblVelika());
		getContentPane().add(getLblRsd());

		// kreiranje prozora u zavisnosti od odabrane pizze

		lblNaziv.setText(pizza.getNaziv());
		lblSlika.setIcon(new ImageIcon(PizzaGUI.class.getResource(pizza.getPutanjaDoSlike())));
		txtrOpis.setText(pizza.getOpis());
		getContentPane().add(getBtnNewButton());
	}

	private JLabel getLblSlika() {
		if (lblSlika == null) {
			lblSlika = new JLabel("");
			lblSlika.setIcon(null);
			lblSlika.setPreferredSize(new Dimension(200, 200));
			lblSlika.setBounds(22, 39, 200, 200);
		}
		return lblSlika;
	}

	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("naziv");
			lblNaziv.setHorizontalAlignment(SwingConstants.CENTER);
			lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNaziv.setBounds(284, 25, 202, 30);
		}
		return lblNaziv;
	}

	private JTextArea getTxtrOpis() {
		if (txtrOpis == null) {
			txtrOpis = new JTextArea();
			txtrOpis.setMaximumSize(new Dimension(4, 22));
			txtrOpis.setEditable(false);
			txtrOpis.setBounds(284, 66, 173, 129);
		}
		return txtrOpis;
	}

	private JRadioButton getRdbtnMala() {
		if (rdbtnMala == null) {
			rdbtnMala = new JRadioButton("");
			rdbtnMala.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textFieldTotal.setText(pizza.getMala() + "");
				}
			});
			buttonGroup.add(rdbtnMala);
			rdbtnMala.setBounds(263, 231, 33, 41);
		}
		return rdbtnMala;
	}

	private JRadioButton getRdbtnSrednja() {
		if (rdbtnSrednja == null) {
			rdbtnSrednja = new JRadioButton("");
			rdbtnSrednja.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textFieldTotal.setText(pizza.getSrednja() + "");
				}
			});
			buttonGroup.add(rdbtnSrednja);
			rdbtnSrednja.setBounds(363, 231, 33, 41);
		}
		return rdbtnSrednja;
	}

	private JRadioButton getRdbtnVelika() {
		if (rdbtnVelika == null) {
			rdbtnVelika = new JRadioButton("");
			rdbtnVelika.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textFieldTotal.setText(pizza.getVelika() + "");
				}
			});
			buttonGroup.add(rdbtnVelika);
			rdbtnVelika.setBounds(453, 231, 33, 41);
		}
		return rdbtnVelika;
	}

	private JLabel getLblTotal() {
		if (lblTotal == null) {
			lblTotal = new JLabel("Total:");
			lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblTotal.setBounds(40, 272, 56, 16);
		}
		return lblTotal;
	}

	private JTextField getTextFieldTotal() {
		if (textFieldTotal == null) {
			textFieldTotal = new JTextField();
			textFieldTotal.setHorizontalAlignment(SwingConstants.RIGHT);
			textFieldTotal.setEditable(false);
			textFieldTotal.setBounds(40, 311, 116, 22);
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
					if (rdbtnMala.isSelected())
						velicina = "Mala ";
					if (rdbtnSrednja.isSelected())
						velicina = "Srednja ";
					if (rdbtnVelika.isSelected())
						velicina = "Velika ";
					
					try {
						if (velicina == null) {
							JOptionPane.showMessageDialog(contentPane, "Molim Vas, odaberite velicinu pice!", 
									null, JOptionPane.WARNING_MESSAGE);
							
							return;
						}
						GUIKontroler.ubaciPorudzbinuUListu((velicina + lblNaziv.getText()),
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
			btnDodajUKorpu.setBounds(315, 284, 121, 25);
		}
		return btnDodajUKorpu;
	}

	private JLabel getLblMala() {
		if (lblMala == null) {
			lblMala = new JLabel("Mala");
			lblMala.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblMala.setBounds(263, 208, 56, 22);
		}
		return lblMala;
	}

	private JLabel getLblSrednja() {
		if (lblSrednja == null) {
			lblSrednja = new JLabel("Srednja");
			lblSrednja.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblSrednja.setBounds(349, 206, 62, 26);
		}
		return lblSrednja;
	}

	private JLabel getLblVelika() {
		if (lblVelika == null) {
			lblVelika = new JLabel("Velika");
			lblVelika.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblVelika.setBounds(446, 208, 56, 22);
		}
		return lblVelika;
	}

	private JLabel getLblRsd() {
		if (lblRsd == null) {
			lblRsd = new JLabel("RSD");
			lblRsd.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblRsd.setBounds(166, 314, 56, 16);
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
			btnNewButton.setBounds(315, 322, 121, 23);
		}
		return btnNewButton;
	}
}
