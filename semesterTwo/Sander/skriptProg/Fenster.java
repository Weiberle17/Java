package skriptProg;

//import f�r awt- und swing-Bibliotheken
import javax.swing.JFrame;
import java.awt.Cursor;

//selbst erstelltes Fenster wird von JFrame abgeleitet
public class Fenster extends JFrame {
	public Fenster() {
		// verwende Konstruktor von JFrame f�r Titelzeile
		super("Einfaches Fenster");
		// Programmende beim Schlie�en des Fensters
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200); // Gr��e: Breite und H�he
		setLocation(1000, 700); // Position: linke obere Ecke
		setVisible(true); // Sichtbarkeit
	}

	public static void main(String[] args) {
		Fenster frame = new Fenster();
		// Anzeige verschiedener Cursor-Formen als int-Konstanten
		// insgesamt 6 Cursor-Formen werden vorgegeben
		int[] types = { Cursor.CROSSHAIR_CURSOR, Cursor.HAND_CURSOR, Cursor.MOVE_CURSOR, Cursor.TEXT_CURSOR,
				Cursor.WAIT_CURSOR, Cursor.DEFAULT_CURSOR };
		// verk�rzte for-Schleife
		// die oben definierten cursor werden nacheinander gezeigt
		for (int type : types) {
			// Programm h�lt an f�r 3000 Millisekunden
			// Fehlerbehandlung bei sleep() zwingend notwendig
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {}
			// cursor wird ausgew�hlt
			Cursor c = Cursor.getPredefinedCursor(type);
			frame.setCursor(c);
			// Name des cursors als Titelzeile
			frame.setTitle(c.getName());
		}
	}
}