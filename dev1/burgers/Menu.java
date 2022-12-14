package edu.hm.cs.bka.dev1.burgers;

import java.util.InvalidPropertiesFormatException;
import java.util.concurrent.ExecutionException;

public class Menu {
  public Groesse getGroesse() {
    return groesse;
  }

  public Burger getBurger() {
    return burger;
  }

  private final Groesse groesse;
  private final Burger burger;

  public Menu(Groesse groesse, Burger burger) {
    this.groesse = groesse;
    this.burger = burger;
  }
  public int berechnePreisInCent() {
    if (groesse == Groesse.REGULAR) {
      return (int) burger.getPriceInCent() + 200;
    } else if (groesse == Groesse.MAXI) {
      return (int) (burger.getPriceInCent() + 250);
    }
    //for invalid input
    return -1;
  }
}
