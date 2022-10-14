package aufgaben;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Aufgabe_2 extends JFrame {
	public static ArrayList<String> vokale;

	public Aufgabe_2() {
		super("KeyTester");
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		addWindowListener(new MyWindowListener());
		addKeyListener(new MyKeyListener());

		MyPanel p1 = new MyPanel();
		
		p1.setBounds(10, 10, 450, 100);
		c.add(p1);
		System.out.println("Window is now open.");
		pack();
		setSize(485, 160);
		setLocation(500, 300);
		setVisible(true);
	}

	private class MyWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.out.println("Window was closed.");
			System.exit(0);
		}
	}

	private class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			String k = KeyEvent.getKeyText(e.getKeyCode());
			if (vokale.contains(k) == true) {
				System.out.println("Juhuu " + k + " is a vocal!");
			} else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				System.out.println("Window was closed.");
				System.exit(0);
			} else {
				System.out.println(k + " is no vocal!");
			}
		}
	}

	private class MyPanel extends JPanel {
		public MyPanel() {
			setBackground(Color.lightGray);
			setPreferredSize(new Dimension(450, 250));
			setMaximumSize(new Dimension(450, 250));
		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.setColor(Color.black);
			g.setFont(new Font("Moonspaced", Font.BOLD, 25));
			g.drawString("Press any button.", 25, 25);
		}
	}

	public static void main(String[] args) {

		vokale = new ArrayList<>();
		String[] v = { "A", "E", "I", "O", "U" };
		Collections.addAll(vokale, v);
	
		new Aufgabe_2();
	}
}