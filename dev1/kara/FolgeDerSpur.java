package edu.hm.cs.bka.dev1.kara;

import de.i8k.karalight.Kara;

import static de.i8k.karalight.Kara.*;

/** Hauptprogramm. Hier können Sie Kara programmieren. */
public class FolgeDerSpur {

  /**
   * Main-Methode. Hier können Sie Java programmieren und dabei die folgenden Kara-Befehle direkt
   * verwenden:
   *
   * <ul>
   *   <li>move() - Kara bewegt sich einen Schritt nach vorn.
   *   <li>turnRight() bzw. turnLeft() - Kara dreht sich nach rechts bzw. links
   *   <li>pickLeaf() - Kara nimmt ein Blatt auf (geht nur, wenn eins da ist!)
   *   <li>putLeaf() - Kara legt ein Blatt ab (geht nur, wenn keins da ist!)
   * </ul>
   *
   * Zusätzlich stehen Ihnen die folgenden Abfragen zur Verfügung:
   *
   * <ul>
   *   <li>isMushroomInFront() - liefert WAHR, wenn vor Kara ein Pilz steht
   *   <li>isTreeInFront() - liefert WAHR, wenn vor Kara ein Baum steht
   *   <li>isTreeLeft() - liefert WAHR, wenn links von Kara ein Baum steht
   *   <li>isTreeRight() - liefert WAHR, wenn rechts von Kara ein Baum steht
   *   <li>isOnLeaf() - liefert WAHR, wenn Kara auf einem Blatt steht
   * </ul>
   *
   * Kara kann mit dem Anwender kommunizieren:
   *
   * <ul>
   *   <li>say([Ausdruck]) - Öffnet ein Fenster, in dem der Wert des Ausdrucks steht
   *   <li>askNumber([Frage]) - fragt vom Anwender eine Ganzzahl (int) ab.
   * </ul>
   *
   * @param args not used.
   */
  public static void main(String[] args) {
    // Ergänzen Sie hier Ihr Programm!
    move();
    while (true) {
      if (isLeafInFront()) {
        move();
      } else if (isLeafLeft()) {
        turnLeft();
        move();
      } else if (isLeafRight()) {
        turnRight();
        move();
      } else {
        break;
      }
    }
  }

  /**
   * Ermittelt, ob auf dem Feld vor Kara ein Blatt liegt. Kehrt in die Ausgangsposition zurück!
   *
   * @return true, wenn vor Kara ein Blatt liegt.
   */
  static boolean isLeafInFront() {
    if (Kara.isTreeInFront()) {
      return false;
    }
    Kara.move();
    boolean result = Kara.isOnLeaf();
    Kara.turnLeft();
    Kara.turnLeft();
    Kara.move();
    Kara.turnLeft();
    Kara.turnLeft();
    // TODO: Ermitteln Sie hier, ob vor Kara ein Blatt liegt!
    return result;
  }

  /* Die folgenden Methoden müssen nicht geändert werden. */

  /**
   * Ermittelt, ob auf dem Feld links von Kara ein Blatt liegt. Kehrt in die Ausgangsposition
   * zurück!
   *
   * @return true, wenn links von Kara ein Blatt liegt.
   */
  static boolean isLeafLeft() {
    turnLeft();
    boolean b = isLeafInFront();
    turnRight();
    return b;
  }

  /**
   * Ermittelt, ob auf dem Feld rechts von Kara ein Blatt liegt. Kehrt in die Ausgangsposition
   * zurück!
   *
   * @return true, wenn rechts von Kara ein Blatt liegt.
   */
  static boolean isLeafRight() {
    turnRight();
    boolean b = isLeafInFront();
    turnLeft();
    return b;
  }

  /** Dreht Kara um 180 Grad. */
  static void turnAround() {
    turnLeft();
    turnLeft();
  }
}
