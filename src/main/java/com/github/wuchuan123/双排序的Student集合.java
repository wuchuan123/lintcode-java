package com.github.wuchuan123;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class 双排序的Student集合 {
  public static Map<Student, Integer> getSortMap(List<Student> list) {
//    TreeMap 是一个有顺序的map
    Map<Student, Integer> map = new TreeMap<Student, Integer>((Student o1, Student o2) -> {
      if (o1 != o2) {
        return o1.age - o2.age;
      } else {
//        compareTo 字符串比较的方法
        return o1.name.compareTo(o2.name);
      }
    });
    int num = 0;
    for (Student su : list) {
      map.put(su, num);
      num++;
    }
    return map;
  }
}
