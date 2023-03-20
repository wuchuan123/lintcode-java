package com.github.wuchuan123;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**我们规定乘坐公共交通工具时，
 * 正常情况下乘客按序列号 number 的升序顺序排队就座，
 * 当乘客中有年龄 age 小于 5 岁（不含 5 岁）的幼儿乘客或是年龄 age 大于 60 岁（不含 60 岁）的老年人乘客时，
 * 优先座。现在给你一个乘客列表，请你安排他们按序就座，结果请通过调用 System.out.println 方法进行输出。
 * [{number:0,age:21,name:"Jack"},{number:1,age:69,name:"Jimi"},
 * {number:2,age:52,name:"July"},{number:3,age:42,name:"July"},
 * {number:4,age:70,name:"Jane "}]
 * Jack 21
 * Jimi 69
 * July 52
 * July 42
 * Jane 70 =>
 * number = 1, name = Jimi, age = 69
 * number = 4, name = Jane, age = 70
 * number = 0, name = Jack, age = 21
 * number = 2, name = July, age = 52
 * number = 3, name = July, age = 42
 * */
public class 乘车按序就座 {
  public void priority(List<Person> list) {
//    使用PriorityQueue 优先队列类来解决，创建一个有比较器的优先队列
    PriorityQueue<Person> stack = new PriorityQueue<Person>(new PersonComparator());
    stack.addAll(list);
    while(!stack.isEmpty()){
//      stack.poll() 出列
      System.out.println(stack.poll().toString());
    }
  }

  static class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
      if((p1.age < 5 || p1.age > 60) && (p2.age >= 5 && p2.age <= 60)){
        return -1;
      }
      if((p1.age >= 5 && p1.age <= 60) && (p2.age < 5 || p2.age > 60)){
        return 1;
      }
      return p1.number - p2.number;
    }
  }
}
