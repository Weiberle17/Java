package skriptProg;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

public class Zeichnen extends JFrame {
	public Zeichnen() {
		super("Grafik");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		// Mit pack() werden die Elemente in einer �passenden�
		// Fenstergr��e angeordnet
		pack();
		setVisible(true);
	}

	private class MyPanel extends JPanel {
		public MyPanel() {
			setBackground(Color.white);
			setPreferredSize(new Dimension(300, 200));
		}

		// automatisch aufgerufen, wenn Grafik aktualisiert wurde
		protected void paintComponent(Graphics g) {
			super.paintComponents(g);
			g.setColor(Color.red);

			// Erzeuge ein Rechteck mit der vorher festgelegten F�llfarbe
			// Parameter:
			g.fillRoundRect(30, 30, 240, 140, 30, 30);
			g.setColor(Color.white);

			// Schriftart festlegen, Farbe wie oben definiert
			g.setFont(new Font("Moonspaced", Font.BOLD, 48));

			// Text ausgeben, Koordinaten stellen linke obere Ecke dar
			g.drawString("Hallo!", 65, 110);
		}
	}

	public static void main(String[] args) {
		new Zeichnen();
	}
}
