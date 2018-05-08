package stavke;
/**
 * Klasa koja opisuje objekat klase Pizza sa svim potrebnim atributima
 * @author Nikola
 *
 */
public class Pizza {
	/**
	 * Naziv jela
	 */
	private String naziv;
	/**
	 * Relativna putanja do slike jela
	 */
	private String putanjaDoSlike;
	/**
	 * Cene za odredjenu velicinu pizze
	 */
	private double mala;
	private double srednja;
	private double velika;
	/**
	 * Sastojci pizze
	 */
	private String opis;
	/**
	 * Konstruktor koji postavlja vrednosti za sve atribute objekta tipa Pizza
	 * @param naziv
	 * @param putanjaDoSlike
	 * @param mala
	 * @param srednja
	 * @param velika
	 * @param opis
	 */
	public Pizza(String naziv, String putanjaDoSlike, double mala, double srednja, double velika, String opis) {
		super();
		this.naziv = naziv;
		this.putanjaDoSlike = putanjaDoSlike;
		this.mala = mala;
		this.srednja = srednja;
		this.velika = velika;
		this.opis = opis;
	}
	/**
	 * Vraca naziv pizze
	 * @return naziv-Naziv vrste pizze
	 */
	public String getNaziv() {
		return naziv;
	} 
	/**
	 * 
	 * @param naziv-postavlja naziv pizze
	 */
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	/**
	 * Vraca string koji predstavlja putanju do slike
	 * @return String putanjaDoSlike
	 */
	public String getPutanjaDoSlike() {
		return putanjaDoSlike;
	}
	/**
	 * Postavlja vrednost Stringa koji predstavlja putanju do slike
	 * @param putanjaDoSlike
	 */
	public void setPutanjaDoSlike(String putanjaDoSlike) {
		this.putanjaDoSlike = putanjaDoSlike;
	}
	/**
	 * Vraca cenu male pizze
	 * @return double mala
	 */
	public double getMala() {
		return mala;
	}
	/**
	 * Postavlja cenu male pizze
	 * @param mala
	 */
	public void setMala(double mala) {
		this.mala = mala;
	}
	/**
	 * Vraca cenu srednje pizze
	 * @return double srednja
	 */
	public double getSrednja() {
		return srednja;
	}
	/**
	 * Postavlja cenu srednje pice
	 * @param srednja
	 */
	public void setSrednja(double srednja) {
		this.srednja = srednja;
	}
	/**
	 * Vraca cenu velike pizze
	 * @return double velika
	 */
	public double getVelika() {
		return velika;
	}
	/**
	 * Postavlja cenu velike pizze
	 * @param velika
	 */
	public void setVelika(double velika) {
		this.velika = velika;
	}
	/**
	 * Vraca opis koji predstavlja sastojke pizze
	 * @return String opis
	 */
	public String getOpis() {
		return opis;
	}
	/**
	 * Postavlja opis, odnosno listu sastojaka pizze
	 * @param opis
	 */
	public void setOpis(String opis) {
		this.opis = opis;
	}
}
