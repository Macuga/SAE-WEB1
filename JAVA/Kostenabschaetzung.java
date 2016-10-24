
public class Kostenabschaetzung {

	private double volumenfaktor;
	private double[] altersfaktor;
	
	public Kostenabschaetzung(double vF, double[] aF){
		this.volumenfaktor = vF;
		this.altersfaktor = aF;
	}
	
	public double berechneKosten(double flaeche, double hoehe, int anz, int alterskat){
		
		/*double aF = 0.0;
		switch(alterskat){
		
		case 1: aF = 5.0;
		break;
		case 2: aF = 3.0;
		break;
		case 3: aF = 1.8;
		break;
		case 4: aF = 1.0;
		break;
		case 5: aF = 0.7;
		break;
		case 6: aF = 0.3;
		break;
	}*/
		//return flaeche * hoehe * anz * this.volumenfaktor * aF;
		return flaeche * hoehe * anz * this.volumenfaktor * this.altersfaktor[alterskat-1];
	}
}
