package com.quackslike.me.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@SuppressWarnings("SpringFacetCodeInspection")
@SpringBootApplication
@RestController()
@RequestMapping("/api")
public class HelloController {

  private static final String template = "Hello, %s!";
  private final Map<String, AtomicLong> nameCounts = new HashMap<>();

  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String n) {
    AtomicLong nameCount = nameCounts.get(n);
    if (nameCount ==  null) {
      nameCount = new AtomicLong();
      nameCounts.put(n, nameCount);
    }
    return new Greeting(nameCount.incrementAndGet(), String.format(template, n));
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloController.class, args);
  }
}