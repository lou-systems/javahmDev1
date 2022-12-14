package edu.hm.cs.bka.dev1.burgers;

public class Burger {
  private final String name;

  public String getName() {
    return name;
  }

  public int getPriceInCent() {
    return priceInCent;
  }

  private final int priceInCent;

  public Burger(String name, int priceInCent) {
    this.name = name;
    this.priceInCent = priceInCent;
  }
}
