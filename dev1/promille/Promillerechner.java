package edu.hm.cs.bka.dev1.promille;

import static javax.swing.JOptionPane.*;

/** Promillerechner. */
public class Promillerechner {

  /** Promillerechner. */
  public static void main(String[] args) {

    // Abfrage von Konsum und Gewicht
    // TODO die Konvertierung fehlt.
    String eingabeBierInLitern = showInputDialog("Getrunkenes Bier (in Litern)?");
    double bierInLitern = Double.parseDouble(eingabeBierInLitern);
    String eingabeGewichtInKg = showInputDialog("Gewicht in kg?");
    double gewichtInKg = Double.parseDouble(eingabeGewichtInKg);

    // Hier wird das Geschlecht abgefragt (keine Änderung nötig!)
    Geschlecht geschlecht =
        Geschlecht.values()[
            showOptionDialog(
                null,
                "Biologisches Geschlecht",
                "",
                DEFAULT_OPTION,
                QUESTION_MESSAGE,
                null,
                Geschlecht.values(),
                Geschlecht.values()[0])];

    // Berechnen Sie hier den Blutalkoholgehalt
    // TODO: Hilfsmethode berechneAlkoholgehalt nutzen!
    double alkoholgehalt = berechneAlkoholgehalt(bierInLitern, gewichtInKg, geschlecht) * 1000;
    // TODO Geben Sie hier den Blutalkoholgehalt in Promille aus!
    String std = String.format("%.1f", alkoholgehalt);
    String ausgabe = "Sie als " + geschlecht + " haben einen Alkoholgehalt von " + std + " Promille.";
    showMessageDialog(null, ausgabe);
  }
  private static double berechneAlkoholgehalt(double bierInLitern, double gewichtInKg, Geschlecht geschlecht) {
    double alkoholmenge = bierInLitern * 0.038 * 0.85;
    if (geschlecht == Geschlecht.MAENNLICH) {
      return alkoholmenge / (gewichtInKg * 0.7);
    } else if (geschlecht == Geschlecht.WEIBLICH) {
      return alkoholmenge / (gewichtInKg * 0.6);
    }
    //for invalid input
    return -1;
  }
}
