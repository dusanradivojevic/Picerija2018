package main.sistemskeOperacije;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import main.porudzbina.StavkaPorudzbine;
import main.porudzbina.StavkaSerializable;

public class SOSerijalizuj {

	public static void izvrsi(LinkedList<StavkaPorudzbine> porudzbina, GregorianCalendar datum,
			String putanja) throws Exception {
		
		if (porudzbina == null || porudzbina.size() == 0)
			return;
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(putanja))) {
			
			StavkaSerializable s = new StavkaSerializable();
			s.setPorudzbina(porudzbina);
			s.setDatum(datum);
			
			out.writeObject(s);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
