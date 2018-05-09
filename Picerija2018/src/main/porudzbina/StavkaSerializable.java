package main.porudzbina;

import java.io.Serializable;
import java.util.LinkedList;

public class StavkaSerializable implements Serializable {
	
	private LinkedList<StavkaPorudzbine> porudzbina;
	private String datum;
	
	public LinkedList<StavkaPorudzbine> getPorudzbina() {
		return porudzbina;
	}
	
	public void setPorudzbina(LinkedList<StavkaPorudzbine> porudzbina) {
		this.porudzbina = porudzbina;
	}
	
	public String getDatum() {
		return datum;
	}
	
	public void setDatum(String datum) {
		this.datum = datum;
	}
	
}
