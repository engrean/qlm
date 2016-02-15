package com.quackslike.me.oop;

public class Elephant extends Mammal {

  public Elephant() {
    super(false, false, true, (short)4);
  }

  @Override FoodType getFoodType() {
    return FoodType.PLANTS;
  }

  @Override public boolean eat(FoodType food, int pounds) {
    boolean r = super.eat(food, pounds);
    if (r) {
      System.out.println("Elephant pooping");
    }
    return r;
  }

}
