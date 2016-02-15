package com.quackslike.me.oop;

import java.util.ArrayList;
import java.util.List;

public class Zookeeper {

  private List<Animal> animals = new ArrayList<>();
  private List<Guest> guests = new ArrayList<>();
  private List<Employee> employees = new ArrayList<>();

  boolean animalFed(Feeder feeder, Animal animal, FoodType food, int pounds) {
    return feeder.feed(animal, food, pounds);
  }

  public List<Animal> getAnimals() {
    return animals;
  }

  public List<Guest> getGuests() {
    return guests;
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public static void test(String[] args) {
    Zookeeper zk = new Zookeeper();

    Animal elephant = new Elephant();
    Animal wolf = new Wolf();
    zk.getAnimals().add(elephant);
    zk.getAnimals().add(wolf);

    Guest noah = new Guest();
    zk.getGuests().add(noah);
    Guest chris = new Guest();
    zk.getGuests().add(chris);

    Employee changhee = new Employee();
    zk.getEmployees().add(changhee);

//    noah.feed(wolf, FoodType.PLANTS, 2);
//    chris.feed(elephant, FoodType.PLANTS, 1);
//    changhee.feed(wolf, FoodType.RODENTS, 2);

    zk.animalFed(noah, wolf, FoodType.PLANTS, 2);
    zk.animalFed(chris, elephant, FoodType.PLANTS, 10);
    zk.animalFed(changhee, wolf, FoodType.RODENTS, 2);

    for (Animal animal: zk.getAnimals()) {
      System.out.println(animal.getClass() + " was fed " + animal.getAmountFed());
    }

  }
}
