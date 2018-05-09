package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import kontroler.GUIKontroler;
import main.porudzbina.StavkaPorudzbine;

import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

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
	

	/**
	 * Create the frame.
	 */
	public PizzaGUI() {
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
	}
	private JLabel getLblSlika() {
		if (lblSlika == null) {
			lblSlika = new JLabel("");
			lblSlika.setPreferredSize(new Dimension(200, 200));
			lblSlika.setBounds(22, 39, 200, 200);
		}
		return lblSlika;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("naziv");
			lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNaziv.setBounds(284, 25, 202, 30);
		}
		return lblNaziv;
	}
	private JTextArea getTxtrOpis() {
		if (txtrOpis == null) {
			txtrOpis = new JTextArea();
			txtrOpis.setBounds(284, 82, 173, 90);
		}
		return txtrOpis;
	}
	private JRadioButton getRdbtnMala() {
		if (rdbtnMala == null) {
			rdbtnMala = new JRadioButton("");
			buttonGroup.add(rdbtnMala);
			rdbtnMala.setBounds(263, 217, 33, 41);
		}
		return rdbtnMala;
	}
	private JRadioButton getRdbtnSrednja() {
		if (rdbtnSrednja == null) {
			rdbtnSrednja = new JRadioButton("");
			buttonGroup.add(rdbtnSrednja);
			rdbtnSrednja.setBounds(363, 217, 33, 41);
		}
		return rdbtnSrednja;
	}
	private JRadioButton getRdbtnVelika() {
		if (rdbtnVelika == null) {
			rdbtnVelika = new JRadioButton("");
			buttonGroup.add(rdbtnVelika);
			rdbtnVelika.setBounds(453, 217, 33, 41);
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
						GUIKontroler.ubaciPorudzbinuUListu(velicina + lblNaziv.getText(), Double.parseDouble(lblTotal.getText()));
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
			btnDodajUKorpu.setBounds(313, 310, 121, 25);
		}
		return btnDodajUKorpu;
	}
	private JLabel getLblMala() {
		if (lblMala == null) {
			lblMala = new JLabel("Mala");
			lblMala.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblMala.setBounds(263, 194, 56, 22);
		}
		return lblMala;
	}
	private JLabel getLblSrednja() {
		if (lblSrednja == null) {
			lblSrednja = new JLabel("Srednja");
			lblSrednja.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblSrednja.setBounds(349, 192, 62, 26);
		}
		return lblSrednja;
	}
	private JLabel getLblVelika() {
		if (lblVelika == null) {
			lblVelika = new JLabel("Velika");
			lblVelika.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblVelika.setBounds(446, 194, 56, 22);
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
}
