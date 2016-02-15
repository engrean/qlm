package com.quackslike.me.boot;

/**
 * Created by hargravescw.
 */
public class Greeting {

  long count;
  String greeting;

  public Greeting(long count, String greeting) {
    this.count = count;
    this.greeting = greeting;
  }

  public long getCount() {
    return count;
  }

  public String getGreeting() {
    return greeting;
  }
}
