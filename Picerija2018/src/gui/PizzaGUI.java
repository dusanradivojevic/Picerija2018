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

public class PizzaGUI extends JFrame {
	private JPanel contentPane;
	private JLabel lblSlika;
	private JLabel lblNaziv;
	private JTextArea txtrOpis;
	private JRadioButton rdbtnMala;
	private JRadioButton rdbtnSrednja;
	private JRadioButton rdbtnVelika;
	private JLabel lblMala;
	private JLabel lblSrednja;
	private JLabel lblVelika;

	/**
	 * Create the frame.
	 */
	public PizzaGUI() {
		setResizable(false);
		setBounds(100, 100, 572, 422);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().add(getLblSlika());
		getContentPane().add(getLblNaziv());
		getContentPane().add(getTxtrOpis());
		getContentPane().add(getRdbtnMala());
		getContentPane().add(getRdbtnSrednja());
		getContentPane().add(getRdbtnVelika());
		getContentPane().add(getLblMala());
		getContentPane().add(getLblSrednja());
		getContentPane().add(getLblVelika());
	}
	private JLabel getLblSlika() {
		if (lblSlika == null) {
			lblSlika = new JLabel("Slika");
			lblSlika.setPreferredSize(new Dimension(200, 200));
			lblSlika.setBounds(40, 46, 157, 149);
		}
		return lblSlika;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("naziv");
			lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNaziv.setBounds(297, 28, 202, 30);
		}
		return lblNaziv;
	}
	private JTextArea getTxtrOpis() {
		if (txtrOpis == null) {
			txtrOpis = new JTextArea();
			txtrOpis.setBounds(299, 82, 157, 74);
		}
		return txtrOpis;
	}
	private JRadioButton getRdbtnMala() {
		if (rdbtnMala == null) {
			rdbtnMala = new JRadioButton("");
			rdbtnMala.setBounds(264, 217, 30, 41);
		}
		return rdbtnMala;
	}
	private JRadioButton getRdbtnSrednja() {
		if (rdbtnSrednja == null) {
			rdbtnSrednja = new JRadioButton("");
			rdbtnSrednja.setBounds(365, 217, 30, 41);
		}
		return rdbtnSrednja;
	}
	private JRadioButton getRdbtnVelika() {
		if (rdbtnVelika == null) {
			rdbtnVelika = new JRadioButton("");
			rdbtnVelika.setBounds(469, 217, 30, 41);
		}
		return rdbtnVelika;
	}
	private JLabel getLblMala() {
		if (lblMala == null) {
			lblMala = new JLabel("Mala");
			lblMala.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblMala.setBounds(258, 199, 56, 16);
		}
		return lblMala;
	}
	private JLabel getLblSrednja() {
		if (lblSrednja == null) {
			lblSrednja = new JLabel("Srednja");
			lblSrednja.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblSrednja.setBounds(349, 192, 66, 30);
		}
		return lblSrednja;
	}
	private JLabel getLblVelika() {
		if (lblVelika == null) {
			lblVelika = new JLabel("Velika");
			lblVelika.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblVelika.setBounds(459, 199, 56, 16);
		}
		return lblVelika;
	}
}
