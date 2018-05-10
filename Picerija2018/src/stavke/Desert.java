package stavke;
/**
 * Klasa koja opisuje vrstu deserta
 * @author Nikola
 *
 */
public class Desert {
	/**
	 * Naziv stavke
	 */
	private String naziv;
	/**
	 * Opis jela
	 */
	private String opis;
	/**
	 * Relativna putanja do slike jela
	 */
	private String putanjaDoSlike;
	/**
	 * Cena stavke iz menija
	 */
	private double cena;
	/**
	 * Konstruktor koji postavlja vrednosti atributa za objekat tipa Desert
	 * @param naziv
	 * @param opis
	 * @param putanjaDoSlike
	 * @param cena
	 */
	public Desert(String naziv, String opis, String putanjaDoSlike, double cena) {
//		super();
		this.naziv = naziv;
		this.opis = opis;
		this.putanjaDoSlike = putanjaDoSlike;
		this.cena = cena;
	}
	/**
	 * Vraca naziv odrednjenog deserta
	 * @return String naziv
	 */
	public String getNaziv() {
		return naziv;
	}
	/**
	 * Postavlja naziv za desert
	 * @param naziv
	 */
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	/**
	 * Vraca opis deserta koji predstavlja kolicinu
	 * @return String opis
	 */
	public String getOpis() {
		return opis;
	}
	/**
	 * Postavlja String opis 
	 * @param opis
	 */
	public void setOpis(String opis) {
		this.opis = opis;
	}
	/**
	 * Vraca putanju do slike deserta u vidu Stringa
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
	 * Vraca cenu odredjenog deserta
	 * @return double cena
	 */
	public double getCena() {
		return cena;
	}
	/**
	 * Postavlja vrednost za cenu deserta
	 * @param cena
	 */
	public void setCena(double cena) {
		this.cena = cena;
	}
}
