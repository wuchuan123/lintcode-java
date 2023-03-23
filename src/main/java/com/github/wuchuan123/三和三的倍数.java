package com.github.wuchuan123;

import java.util.List;
import java.util.stream.Collectors;

public class 三和三的倍数 {
  public List<Integer> removeNumber(List<Integer> list) {
//    收集器（Collector）是为Stream.collect()方法量身打造的工具接口（类）。
    return list.stream().filter(item -> item % 3 != 0).collect(Collectors.toList());
  }
}
