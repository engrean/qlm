package com.quackslike.me.oop;

public abstract class Mammal extends Animal {

  public Mammal(boolean isNocturnal, boolean canFly, boolean canSwim, short numLegs){
    super(isNocturnal, canFly, canSwim, numLegs, true);
  }

}
