package com.quackslike.me.oop;

public class Guest implements Feeder {



  @Override public boolean feed(Animal animal, FoodType food, int pounds) {
    return animal.eat(food, pounds);
  }

}
