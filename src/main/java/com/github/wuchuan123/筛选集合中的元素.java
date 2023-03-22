package com.github.wuchuan123;

import java.util.List;
import java.util.stream.Collectors;

public class 筛选集合中的元素 {
    public void watch(List<Integer> blist) {
        List<Integer> alist = blist.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(alist);
    }
}
