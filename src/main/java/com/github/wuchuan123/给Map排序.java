package com.github.wuchuan123;

import java.util.Map;
import java.util.TreeMap;

public class 给Map排序 {
  public static Map<String, Integer> sortMap(Map<String, Integer> map) {
    return new TreeMap<>(map);
  }
}
