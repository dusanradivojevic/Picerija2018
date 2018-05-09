package main.sistemskeOperacije;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;

import main.porudzbina.StavkaPorudzbine;

public class SOUpisiUTxt {

	public static void izvrsi(LinkedList<StavkaPorudzbine> porudzbina, String putanja) throws Exception {
		
		if (porudzbina == null || porudzbina.size() == 0)
			return;
		
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(putanja, true)))) {
			
			out.print("DATUM: " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime())  + "\n\n");
			
			for (int i = 0; i < porudzbina.size(); i++) {
				out.print(porudzbina.get(i).toString());				
			}			
			
			out.print("\n");
			
			for (int i = 0; i < 15; i++) {
				out.print("=");
			}
			
			out.print("\n");
			
			porudzbina = null; //?
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
}
