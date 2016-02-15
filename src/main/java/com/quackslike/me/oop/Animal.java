package com.quackslike.me.oop;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal {

  private boolean isNocturnal;
  private boolean canFly;
  private boolean canSwim;
  private short numLegs;
  private boolean breathesAir;

  private Map<FoodType, Integer> amountFed = new HashMap<>();
  private int exercisedMinutes;

  public Animal(boolean isNocturnal, boolean canFly, boolean canSwim, short numLegs, boolean breathesAir) {
    this.isNocturnal = isNocturnal;
    this.canFly = canFly;
    this.canSwim = canSwim;
    this.numLegs = numLegs;
    this.breathesAir = breathesAir;
  }

  abstract FoodType getFoodType();

  public boolean eat(FoodType food, int numPounds) {
    Integer pounds = amountFed.get(food);
    if (pounds == null) {
      pounds = numPounds;
    }
    amountFed.put(food, pounds);
    return true;
  }

  boolean exercise(int minutesToExercise) {
    exercisedMinutes += minutesToExercise;
    return true;
  }

  public boolean isNocturnal() {
    return isNocturnal;
  }

  public boolean isCanFly() {
    return canFly;
  }

  public boolean isCanSwim() {
    return canSwim;
  }

  public short getNumLegs() {
    return numLegs;
  }

  public boolean isBreathesAir() {
    return breathesAir;
  }

  public Map<FoodType, Integer> getAmountFed() {
    return amountFed;
  }

  public int getExercisedMinutes() {
    return exercisedMinutes;
  }
}
