package com.github.wuchuan123;

public class Test3 implements Test, Test2 {
  @Override
  public void x() {
    System.out.println("test");
  }

  @Override
  public void x2() {
    System.out.println("test");
  }

  public static void main(String[] args) {
    Test test = new Test3();
    test.x();
    test.x2();
  }
}
