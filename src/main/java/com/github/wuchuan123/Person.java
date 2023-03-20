package com.github.wuchuan123;

public class Person {
  String name;
  int age;
  int number;
  public Person(String name, int age, int number) {
    this.name = name;
    this.age = age;
    this.number = number;
  }
  public String toString() {
    return "number = " + number + ", name = " + name + ", age = " + age;
  }

}
