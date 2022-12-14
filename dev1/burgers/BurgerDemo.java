package edu.hm.cs.bka.dev1.burgers;

/** Demo-Programm für Burger-Modell. */
public class BurgerDemo {

  /** Demo-Programm für Burger-Modell. */
  public static void main(String[] args) {
    // TODO: Erstellen Sie hier Objekte
    Burger b1 = new Burger("Burned Beef deluxe", 749);
    Burger b2 = new Burger("Greasy Chicken Remains", 479);

    Menu m1 = new Menu(Groesse.REGULAR, b1);
    Menu m2 = new Menu(Groesse.MAXI, b2);
    // TODO: Lassen Sie hier den berechneten Preis eines Menüs ausgeben.
    System.out.println(m1.berechnePreisInCent());
    System.out.println(m2.berechnePreisInCent());
  }
}
