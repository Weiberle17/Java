package bmi;

import misc.*;
import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMI extends JFrame implements ActionListener {
  private JTextField vName, nName, gewicht, groesse;
  private JLabel msg1, msg2, ergebnis, bedeutung;
  private JButton berechnen;

  BMIPerson p = new BMIPerson();

  public BMI() {
    super("BMI Rechner");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();
    c.setBackground(Color.lightGray);
    c.setLayout(new GridLayout(13, 1, 0, 0));
    c.add(new JLabel("Vorname: "));
    vName = new JTextField(30);
    vName.setInputVerifier(new InputVerifier() {
      public boolean verify(JComponent input) {
        return isViableVName((JTextField) input);
      }
    });
    c.add(vName);
    c.add(new JLabel("Nachname: "));
    nName = new JTextField(30);
    nName.setInputVerifier(new InputVerifier() {
      public boolean verify(JComponent input) {
        return isViableNName((JTextField) input);
      }
    });
    c.add(nName);
    c.add(new JLabel("Gewicht (in kg): "));
    gewicht = new JTextField(4);
    gewicht.setInputVerifier(new InputVerifier() {
      public boolean verify(JComponent input) {
        return isViableWeight((JTextField) input);
      }
    });
    c.add(gewicht);
    msg1 = new JLabel();
    msg1.setForeground(Color.red);
    c.add(msg1);
    c.add(new JLabel("Groessee (in cm): "));
    groesse = new JTextField(3);
    groesse.setInputVerifier(new InputVerifier() {
      public boolean verify(JComponent input) {
        return isViableHeight((JTextField) input);
      }
    });
    c.add(groesse);
    msg2 = new JLabel();
    msg2.setForeground(Color.red);
    c.add(msg2);
    berechnen = new JButton("Berechnen");
    berechnen.addActionListener(this);
    c.add(berechnen);
    ergebnis = new JLabel();
    c.add(ergebnis);
    bedeutung = new JLabel();
    c.add(bedeutung);
    setMinimumSize(Misc.getMinSize(330, 275));
    setPreferredSize(Misc.getPrefSize(400, 400));
    setLocation(500, 300);
    pack();
    setVisible(true);
  }

  private boolean isViableWeight(JTextField f) {
    String s = f.getText().trim();
    try {
      p.setWeight(Double.parseDouble(s.trim()));
    if ((20 < p.getWeight()) && (p.getWeight() < 300)) {
        msg1.setText("");
        return true;
      } else {
        msg1.setText("Ihre Gewichtsangabe liegt ausserhalb des unterstuetzten Bereiches.");
        return false;
      }
    } catch (NumberFormatException ex) {
      msg1.setText("Bitte eine Zahl eingeben (max. eine Nachkommastelle).");
      return false;
    }
  }

  private boolean isViableHeight(JTextField f) {
    String s = f.getText().trim();
    try {
      p.setHeight((Double.parseDouble(s.trim()) / 100));
    if ((p.getHeight() > 0) && (p.getHeight() < 2.4)) {
        msg2.setText("");
        return true;
      } else {
        msg2.setText("Ihre Groessenangabe liegt ausserhalb des unterstuetzten Bereiches");
        return false;
      }
    } catch (NumberFormatException ex) {
      msg2.setText("Bitte eine Zahl eingeben (max. zwei Nachkommastellen).");
      return false;
    }
  }

  private boolean isViableVName(JTextField f) {
    String s = f.getText();
    p.setvName(s);
    return true;
  }

  private boolean isViableNName(JTextField f) {
    String s = f.getText();
    p.setnName(s);
    return true;
  }

  public void actionPerformed(ActionEvent e) {
    if (isViableWeight(gewicht) && isViableHeight(groesse)) {
      ergebnis.setText("Der BMI von " + p.getnName() + ", " + p.getvName() + " betraegt: " + p.berechnen(0));
      String[] bed = { "Sie sind untergewichtig.", "Sie haben ein normales Gewicht",
        "Sie sind leicht uebergewichtig.", "Sie sind uebergewichtig", "Sie sind stark uebergewichtig." };
      bedeutung.setText(bed[p.berechnen(1)]);
    }
  }

  public static void main(String[] args) {
    new BMI();
  }
}
