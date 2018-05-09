package main.sistemskeOperacije;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import main.porudzbina.StavkaPorudzbine;
import main.porudzbina.StavkaSerializable;

public class SOUpisiUBin {

	public static void izvrsi(LinkedList<StavkaPorudzbine> porudzbina, String putanja) throws Exception {
		
		if (porudzbina == null || porudzbina.size() == 0)
			return;
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(putanja, true))) {
			
			StavkaSerializable s = new StavkaSerializable();
			s.setPorudzbina(porudzbina);
			s.setDatum(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime()));
			
			out.writeObject(s);
			
			porudzbina = null; //?
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
