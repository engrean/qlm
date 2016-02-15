package com.quackslike.me.oop;

public class Wolf extends Mammal {

  public Wolf() {
    super(true, false, true, (short)4);
  }

  @Override public boolean eat(FoodType food, int numPounds) {
    Integer pounds = getAmountFed().get(food);
    if (pounds == null) {
      pounds = numPounds;
    }
    getAmountFed().put(food, pounds/2);
    return true;
  }



  @Override FoodType getFoodType() {
    return FoodType.RODENTS;
  }
}
