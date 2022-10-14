package aufgaben;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class Aufgabe_6 extends JFrame implements ActionListener {
	private JPanel editor, button;
	private JTextArea text;
	private JButton copy, paste, cut;
	
	public Aufgabe_6() {
		super("TextEditor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		editor = new JPanel();
		text = new JTextArea(15, 30);
		text.setWrapStyleWord(true);
		text.setLineWrap(true);
		editor.add(text);
		add(editor, BorderLayout.CENTER);
		button = new JPanel();
		copy = new JButton("Copy");
		copy.addActionListener(this);
		button.add(copy);
		paste = new JButton("Paste");
		paste.addActionListener(this);
		button.add(paste);
		cut = new JButton("Cut");
		cut.addActionListener(this);
		button.add(cut);
		add(button, BorderLayout.SOUTH);
		setSize(new Dimension(400, 300));
		setLocation(500, 300);
		pack();
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == copy) {
			text.copy();
			System.out.println("Copy");
		} else if (obj == paste) {
			text.paste();
			System.out.println("Paste");
		} else {
			text.cut();
			System.out.println("Cut");
		}
	}
	
	public static void main(String[] args) {
		new Aufgabe_6();
	}
}
