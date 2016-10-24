import java.io.*;
import java.util.ArrayList;

public class Einlesen {

	public static void main(String[] args) {
		
		String ueberschr = "";
		String inhalt = "";
		
		
		try {
			FileReader reader = new FileReader("daten.csv");
			
			BufferedReader buff = new BufferedReader(reader);
			
			ueberschr = buff.readLine();
			inhalt = buff.readLine();
			
			buff.close();
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(ueberschr);
		System.out.println(inhalt);
		
		String[] daten = inhalt.split(";");
		
		for(int i = 0; i< daten.length; i++){
			daten[i] = daten[i].substring(1, daten[i].length()-1);
		}
		
		
		double flaeche = Double.parseDouble(daten[0]);
		double hoehe = Double.parseDouble(daten[1]);
		int stockwerke = Integer.parseInt(daten[2]);
		int baujahr = Integer.parseInt(daten[3]);
		
		
		System.out.println(flaeche);
		System.out.println(hoehe);
		System.out.println(stockwerke);
		System.out.println(baujahr);
		
		final double volfakt = 1.34;
		double[] af = {5.0,3.0,1.0,0.7,0.3};
		
		
		Kostenabschaetzung ka = new Kostenabschaetzung(volfakt, af);
		
		double kosten = ka.berechneKosten(flaeche, hoehe, stockwerke, baujahr);
		
		System.out.println("Kosten: " + kosten);
	}

}
