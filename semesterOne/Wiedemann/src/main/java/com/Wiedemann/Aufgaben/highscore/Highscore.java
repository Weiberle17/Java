package highscore;

import java.util.Arrays;

public class Highscore {

	public String[] namen, ranking;
	public int[] punkte;
	
	public Highscore() {
		namen = new String[10];
		punkte = new int[10];
		ranking = new String[10];
		namen[0] = "Thomas";
		namen[1] = "Martin";
		namen[2] = "Hans";
		namen[3] = "Gustav";
		namen[6] = "Theodor";
		punkte[0] = 4;
		punkte[1] = 5;
		punkte[2] = 6;
		punkte[3] = 2;
		punkte[6] = 3;
	}
	
	public int nenneHighscore() {
		return punkte[0];
	}
	
	public String nenneBesten() {
		return namen[0];
	}
	
	public void trageBestenEin (String namen, int punkte) {
		this.namen[0] = namen;
		this.punkte[0] = punkte;
	}
	
	public String nenneNamen(int x) {
		return namen[x];
	}
	
	public int nennePunkte(int x) {
		return punkte[x];
	}
	
	public void tragePunkteEin(int x, int punkte) {
		this.punkte[x] = punkte;
	}
	
	public void trageNamenEin(int x, String namen) {
		this.namen[x] = namen;
	}
	
	public void trageEin(int x, String namen, int punkte) {
		this.namen[x] = namen;
		this.punkte[x] = punkte;
	}
	
	public void alleNamenAusgeben() {
		for (int i = 0; i < namen.length; i++) {
			System.out.println(String.format("%2d", (i + 1)) + ": " + String.format("%3s", namen[i]));
		}
		System.out.println();
	}
	
	public void allePunkteAusgeben() {
		for (int i = 0; i < punkte.length; i++) {
			System.out.println(String.format("%2d", (i + 1)) + ": " + String.format("%3d", punkte[i]));
		}
		System.out.println();
	}
	
	public void alleAusgeben() {
		for (int i = 0; i < namen.length; i++) {
			System.out.println(String.format("%2d", (i + 1)) + ": " + String.format("%10s%10d", namen[i], punkte[i]));
		}
		System.out.println();
	}
	
	public void sortieren() {
		for (int i = 0; i < namen.length; i++) {
			ranking[i] = punkte[i] + " " + namen[i];
			System.out.println(ranking[i]);
		}
		System.out.println();
		Arrays.sort(ranking);
		int j = 1;
		for (int i = ranking.length; i > 0; i--) {
			System.out.println(String.format("%2d", j) + ". Platz: " + ranking[i-1]);
			j++;
		}
	}
}