package aufgaben;

import java.util.*;

public class Konto {
	
	Scanner in = new Scanner(System.in);
	
	public int Knr;
	public double saldo, ein, aus;
	
	public void setKontonummer(int newKnr) {
		
		Knr = newKnr;
		
	}
	
	public int getKontonummer() {
		
		return Knr;
	
	}
	public void setSaldo(double newsaldo) {
		
		saldo += newsaldo;
	
	}
	
	public void zahleEin(double newein) {
		
		ein = newein;
		
	}
	
	public void zahleAus(double newaus) {
		
		aus = newaus;
		
	}
	
	public double getSaldo() {
		
		saldo += ein;
		ein = 0;
		saldo -= aus;
		aus = 0;
				
		return saldo;
	
	}
}
