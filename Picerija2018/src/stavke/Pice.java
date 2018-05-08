package stavke;
/**
 * Klasa koja predstavlja odredjenu vrstu pica iz ponude
 * @author Nikola
 *
 */
public class Pice {
	/**
	 * Relativna putanja do slike pica
	 */
	private String putanja;
	/**
	 * Naziv pica
	 */
	private String naziv;
	/**
	 * Cene za malo i veliko pice
	 */
	private double mala;
	private double velika;
	/**
	 * Konstruktor koji postavlja vrednosti svih atributa koji opisuju ovu klasu
	 * @param putanja
	 * @param naziv
	 * @param mala
	 * @param velika
	 */
	public Pice(String putanja, String naziv, double mala, double velika) {
		super();
		this.putanja = putanja;
		this.naziv = naziv;
		this.mala = mala;
		this.velika = velika;
	}
	/**
	 * Vraca String koji predstavlja putanju do slike
	 * @return String putanja
	 */
	public String getPutanja() {
		return putanja;
	}
	/**
	 * Postavlja vrednost Stringa koji predstavlja putanju do slike
	 * @param putanja
	 */
	public void setPutanja(String putanja) {
		this.putanja = putanja;
	}
	/**
	 * Vraca naziv odredjene vrste pica
	 * @return String naziv
	 */
	public String getNaziv() {
		return naziv;
	}
	/**
	 * Postavlja novi naziv za pice
	 * @param naziv
	 */
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	/**
	 * Vraca cenu za manju ambalazu pica
	 * @return double mala
	 */
	public double getMala() {
		return mala;
	}
	/**
	 * Postavlja novu vrednost cene manje ambalaze pica
	 * @param mala
	 */
	public void setMala(double mala) {
		this.mala = mala;
	}
	/**
	 * Vraca cenu za vecu ambalazu pica
	 * @return double velika
	 */
	public double getVelika() {
		return velika;
	}
	/**
	 * Postavlja novu vrednost cene vece ambalaze pica
	 * @param velika
	 */
	public void setVelika(double velika) {
		this.velika = velika;
	}
}
