package main.porudzbina;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class StavkaSerializable implements Serializable {
	
	private LinkedList<StavkaPorudzbine> porudzbina;
	private GregorianCalendar datum;
	
	public LinkedList<StavkaPorudzbine> getPorudzbina() {
		return porudzbina;
	}
	
	public void setPorudzbina(LinkedList<StavkaPorudzbine> porudzbina) {
		this.porudzbina = porudzbina;
	}
	
	public GregorianCalendar getDatum() {
		return datum;
	}
	
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	
}
