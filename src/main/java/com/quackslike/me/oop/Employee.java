package com.quackslike.me.oop;

public class Employee implements Feeder {
  @Override public boolean feed(Animal animal, FoodType food, int pounds) {
    return animal.eat(food, pounds);
  }
}
